/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import Model.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Raka
 */
public class testesan {
    
    public static void main(String[] args) throws SQLException{
        ArrayList<Ruangan> ruang = new ArrayList<>();
        Database db = new Database();
        db.connect();
            String query1 = "select *from ruangan";
            ResultSet r1 = db.getData(query1);
            System.out.println(ruang.toString());
//            while (r1.next()) {
//                Ruangan ruang1 = new Ruangan(r1.getString(1),r1.getInt(2));
//                int x = r1.getInt(2);
//                String query = "select *from pasien p, ruangan r where p.id_ruangan ="+x;
//                ResultSet rs = db.getData(query);
//                ArrayList<PasienInap> daftarPasien = new ArrayList<PasienInap>();
//                while (rs.next()) {
//                    pasien pi = new pasien(rs.getString(1), rs.getString(2), rs.getInt(4), rs.getLong(5));
//                    int i = rs.getInt(3);
//                    String query2 = "select*from dokter d, pasien p where p.id_dokter = d.id_dokter and p.id_pasien ="+i;
//                    ResultSet rst = db.getData(query2);
//                    while (rst.next()) {
//                        dokter dok = new dokter(rs.getInt(1), rs.getString(2));
//                        PasienInap ps = new PasienInap(pi, dok);
//                        String query3 = "select *from diagnosa d, pasien p where p.id_pasien = d.id_pasien and p.id_pasien ="+i;
//                        ResultSet rs1 = db.getData(query3);
//                        while (rs1.next()) {
//                            String di = rs.getString(2);
//                            ps.addDiagnosa(di);
//                        }
//                        daftarPasien.add(ps);
//                        break;
//                    }
//                }
//                ruang1.setDaftarPasien(daftarPasien);
//                ruang.add(ruang1);
//            }
//            db.close();
    }
}