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
         ArrayList<PasienInap> daftarPasien = new ArrayList<PasienInap>();
            PasienInap ps = null;
            ArrayList<Ruangan> ruang = new ArrayList<>();
            Ruangan ruang1 = null;
            dokter dok = null;
            int x = -1;
            pasien pi = null;

            Database db = new Database();
            db.connect();
            String query1 = "select *from ruangan";
            ResultSet r1 = db.getData(query1);
            System.out.println(ruang.toString());

            while (r1.next()) {
                ruang1 = new Ruangan(r1.getString(1), r1.getInt(2));
                x = r1.getInt(2);
            }

            String query2 = "select *from dokter d, pasien p, ruangan r where p.id_ruangan =" + x;
            ResultSet r2 = db.getData(query2);
            long i = -1;
            while (r2.next()) {
                dok = new dokter(r2.getInt(1), r2.getString(2));
                pi = new pasien(r2.getLong(5), r2.getString(3), r2.getString(4), r2.getInt(6), r2.getLong(7));
                i = r2.getLong(5);
                ps = new PasienInap(pi, dok);
                daftarPasien.add(ps);
            }

            
            String query3 = "select *from diagnosa d, pasien p where p.id_pasien = d.id_pasien and p.id_pasien =" + i;
            ResultSet r3 = db.getData(query3);
            int z = 0;
            while (r3.next()) {
                String di = r3.getString(2);
//                ps.addDiagnosa(di);
                daftarPasien.get(z).addDiagnosa(di);
                z++;
            }
            ruang1.setDaftarPasien(daftarPasien);
            ruang.add(ruang1);
            System.out.println(ruang);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
