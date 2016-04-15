/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javaapplication8.PasienInap;
import javaapplication8.Ruangan;
import javaapplication8.dokter;
import javaapplication8.pasien;
import javax.swing.JOptionPane;

/**
 *
 * @author Kazero
 */
public class Database {

    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;

    ArrayList<Ruangan> ruang = new ArrayList<>();

    public void loadAll() {
        try {
            connect();
            String query1 = "select *from ruangan";
            ResultSet r1 = getData(query1);
            while (r1.next()) {
                Ruangan ruang1 = new Ruangan(r1.getString(1),r1.getInt(2));
                
                int x = r1.getInt(2);
                String query = "select *from pasien p, ruangan r where p.id_ruangan ="+x;
                ResultSet rs = getData(query);
                ArrayList<PasienInap> daftarPasien = new ArrayList<PasienInap>();
                while (rs.next()) {
                    pasien pi = new pasien(rs.getString(1), rs.getString(2), rs.getInt(4), rs.getLong(5));
                    int i = rs.getInt(3);
                    String query2 = "select*from dokter d, pasien p where p.id_dokter = d.id_dokter and p.id_pasien ="+i;
                    ResultSet rst = getData(query2);
                    while (rst.next()) {
                        dokter dok = new dokter(rs.getString(1), rs.getInt(2));
                        PasienInap ps = new PasienInap(pi, dok);
                        String query3 = "select *from diagnosa d, pasien p where p.id_pasien = d.id_pasien and p.id_pasien ="+i;
                        ResultSet rs1 = getData(query3);
                        while (rs1.next()) {
                            String di = rs.getString(2);
                            ps.addDiagnosa(di);
                        }
                        daftarPasien.add(ps);
                        break;
                    }
                }
                ruang1.setDaftarPasien(daftarPasien);
                ruang.add(ruang1);
            }
            close();
        } catch (Exception e) {
        }
    }

    public Database() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(),
                    "JDBC Driver Error", JOptionPane.WARNING_MESSAGE);

        }

    }

    public void close() {
        try {
            con.close();
            stmt.close();
            rs.close();
        } catch (Exception e) {
        }
    }

    public void connect() {
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/tubes", dbuser, dbpasswd);
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(),
                    "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            rs = stmt.executeQuery(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage(),
                    "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }

    public void execute(String SQLString) {
        try {
            connect();
            stmt.executeUpdate(SQLString);
            close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage(),
                    "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
