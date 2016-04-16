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

    public static void mainxxx(String[] args) throws SQLException {
//        ArrayList<Ruangan> ruang = new ArrayList<>();
//        dokter dok = null;
//        Database db = new Database();
//        db.connect();
//        String query1 = "select *from ruangan";
//        ResultSet r1 = db.getData(query1);
//        System.out.println(ruang.toString());
//        
//        
//        while (r1.next()) {
//            Ruangan ruang1 = new Ruangan(r1.getString(1), r1.getInt(2));
//            int x = r1.getInt(2);
//            String query = "select *from dokter d, pasien p, ruangan r where p.id_ruangan =" + x;
//            ResultSet rs = db.getData(query);
//            while (rs.next()) {
//                dok = new dokter(rs.getInt(1), rs.getString(2));
//
//            }
//            ArrayList<PasienInap> daftarPasien = new ArrayList<PasienInap>();
//            while (rs.next()) {
//                pasien pi = new pasien(rs.getString(1), rs.getString(2), rs.getInt(4), rs.getLong(5));
//                int i = rs.getInt(3);
//                String query2 = "select*from dokter d, pasien p where p.id_dokter = d.id_dokter and p.id_pasien =" + i;
//                System.out.println(query2 + " ");
//                ResultSet rst = db.getData(query2);
//                while (rst.next()) {
////                        dokter dok = new dokter(rs.getInt(1), rs.getString(2));
//                    PasienInap ps = new PasienInap(pi, dok);
//                    String query3 = "select *from diagnosa d, pasien p where p.id_pasien = d.id_pasien and p.id_pasien =" + i;
//                    ResultSet rs1 = db.getData(query3);
//                    while (rs1.next()) {
//                        String di = rs.getString(2);
//                        ps.addDiagnosa(di);
//                    }
//                    daftarPasien.add(ps);
//                    break;
//                }
//            }
//            ruang1.setDaftarPasien(daftarPasien);
//            ruang.add(ruang1);
//        }
//        db.close();
//    }
    }

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
            while (r1.next()) {
                ruang1 = new Ruangan(r1.getString(1), r1.getInt(2));
                x = r1.getInt(2);
                System.out.println(r1.getInt("id_ruangan")+"-"+r1.getString("nama_ruangan"));
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
                System.out.println("\n"+r2.getInt("id_dokter")+"\n"+
                        r2.getString("nama_dokter")+"\n"+
                        r2.getString("nama")+"\n"+
                        r2.getString("alamat")+"\n"+
                        r2.getInt("id_pasien")+"\n"+
                        r2.getInt("usia")+"\n"+
                        r2.getLong("nomorhp")+"\n"+
                        r2.getInt("id_ruangan")+"\n"+
                        r2.getString("nama_ruangan")
                );
            }

            String query3 = "select *from diagnosa d, pasien p where p.id_pasien = d.id_pasien and p.id_pasien =" + i;
            ResultSet r3 = db.getData(query3);
            int z = 0;
            while (r3.next()) {
                String di = r3.getString(2);
                daftarPasien.get(z).addDiagnosa(di);
                System.out.println("\n"+r3.getInt("id_pasien")+"\n"+
                        r3.getString("nama")+"\n"+
                        r3.getString("nama_diagnosa")
                );
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
