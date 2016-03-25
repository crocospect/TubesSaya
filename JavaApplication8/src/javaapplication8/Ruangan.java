/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;

/**
 *
 * @author Crocospect
 */
public class Ruangan {
    private ArrayList<PasienInap> daftarPasien = new ArrayList();
    private String nama;

    public Ruangan(String nama) {
        this.nama = nama;
    }
    
    public void tambahPasienInap(pasien p, dokter d){
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
    
    public PasienInap getPasienInap(long id){
        int i = 0;
        for (int j = 0; j < daftarPasien.size(); j++) {
            if (daftarPasien.get(j).getId()==id) {
                i=j;
                break;
            }
        }
        return daftarPasien.get(i);
    }
    
    public void removePasienInap(long id ){
        int i = 0;
        for (int j = 0; j < daftarPasien.size(); j++) {
            if (daftarPasien.get(j).getId()==id) {
                i=j;
                break;
            }
        }
        daftarPasien.remove(i);
    }
    
    public void display (){
        System.out.println("Ruangan : "+nama);
    }

    public ArrayList<PasienInap> getDaftarPasien() {
        return daftarPasien;
    }
    public void diplay_pasien(){
        int i = 0;
        for (int j = 0; j < daftarPasien.size(); j++) {
            daftarPasien.get(j).display();
        }
        }
    }   