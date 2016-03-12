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
public class pasien extends orang{
    private long id;
    public pasien(String nama, String alamat, int usia, long nomor) {
        super(nama, alamat, usia, nomor);
    }

    public pasien(long id, String nama, String alamat, int usia, long nomor) {
        super(nama, alamat, usia, nomor);
        this.id = id;
    }

    public long getId() {
        return id;
    }   
}
