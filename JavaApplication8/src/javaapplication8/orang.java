package javaapplication8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NANDHA
 */
public abstract class orang {
    private String nama;
    private int usia;
    private String jns_kelamin;
    private String pekerjaan;
    private String alamat;
    private String id;
    private int nomorhp; 

    public orang(String nama, int usia, String jns_kelamin, String pekerjaan, String alamat, String id, int nomorhp) {
        this.nama = nama;
        this.usia = usia;
        this.jns_kelamin = jns_kelamin;
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
        this.id = id;
        this.nomorhp = nomorhp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setJns_kelamin(String jns_kelamin) {
        this.jns_kelamin = jns_kelamin;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNomorhp(int nomorhp) {
        this.nomorhp = nomorhp;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getJns_kelamin() {
        return jns_kelamin;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getId() {
        return id;
    }

    public int getNomorhp() {
        return nomorhp;
    }
    
    public abstract void display();
}
