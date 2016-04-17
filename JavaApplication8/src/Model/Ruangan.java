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
        try{
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
