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

    private String nama, alamat;
    private int usia;
    private long nomor;

    public orang(String nama) {
        this.nama = nama;
    }

    public orang(String nama, String alamat, int usia, long nomor) {
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUsia() {
        return usia;
    }

    public long getNomor() {
        return nomor;
    }
}
