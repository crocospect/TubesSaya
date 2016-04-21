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
import java.util.InputMismatchException;

/**
 *
 * @author Crocospect
 */
public class Ruangan {

    private ArrayList<PasienInap> daftarPasien = new ArrayList();
    private String nama;
    private long id_ruangan;
    Model.Database db = new Database();

    public void setDaftarPasien(ArrayList<PasienInap> daftarPasien) {
        this.daftarPasien = daftarPasien;
    }
    

    public void loadAll(){
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
    
    public Ruangan(String nama) {
            this.nama = nama;
    }
    
    public Ruangan (String nama, long id){
        this.nama=nama;
        this.id_ruangan=id;
    }

    public void tambahPasienInap(pasien p, dokter d) {
        PasienInap x = new PasienInap(p, d);
        daftarPasien.add(x);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
//    public PasienInap getPasienInap(int indeks){
//        return daftarPasien.get(indeks);
//    }

    public PasienInap getPasienInap(long id) {
        int i = 0;
        for (int j = 0; j < daftarPasien.size(); j++) {
            if (daftarPasien.get(j).getId() == id) {
                i = j;
                break;
            }
        }
        return daftarPasien.get(i);
    }

    public void removePasienInap(long id) {
        int i = 0;
        for (int j = 0; j < daftarPasien.size(); j++) {
            if (daftarPasien.get(j).getId() == id) {
                i = j;
                break;
            }
        }
        daftarPasien.remove(i);
    }

    public void display() {
        System.out.println("Ruangan : " + nama);
    }

    public ArrayList<PasienInap> getDaftarPasien() {
        return daftarPasien;
    }

    public void diplay_pasien() {
        int i = 0;
        for (int j = 0; j < daftarPasien.size(); j++) {
            daftarPasien.get(j).display();
        }
    }
}
