/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.PasienInap;
import Model.Database;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rakage
 */
public class percobaan {

    public static void main(String[] args) {
        try {

            Database db = new Database();
            db.connect();
            String query = "select*from pasien";
            ResultSet r1 = db.getData(query);

            ArrayList<PasienInap> daftarPasien = new ArrayList<>();
            while (r1.next()) {
                pasien pi = new pasien(r1.getString(1), r1.getString(2), r1.getInt(4), r1.getLong(5));
                int i = r1.getInt(3);
                String query2 = "select*from dokter d, pasien p where p.id_dokter = d.id_dokter and "
                        + "p.id_pasien =" + i;
                ResultSet r2 = db.getData(query2);
                while (r2.next()) {
                    dokter dok = new dokter(r2.getInt(1), r2.getString(2));
                    PasienInap ps = new PasienInap(pi, dok);
                    String query3 = "select *from diagnosa d, pasien p where p.id_pasien = d.id_pasien and "
                            + "p.id_pasien =" + i;
                    ResultSet r3 = db.getData(query3);
                    while (r3.next()) {
                        String di = r3.getString(2);
                        ps.addDiagnosa(di);
                    }
                    daftarPasien.add(ps);
                    break;
                }
            }
            db.close();
        } catch (Exception e) {
        }
    }
}
