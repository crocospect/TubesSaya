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
public class pasien extends orang {
    private String penyakit;

    /**
     *
     * @param nama
     * @param usia
     * @param jns_kelamin
     * @param pekerjaan
     * @param alamat
     * @param id
     * @param nomorhp
     * @param penyakit
     */
    public pasien(String nama, int usia, String jns_kelamin, String pekerjaan, String alamat, String id, String nomorhp, String penyakit) {
        super(nama, usia, jns_kelamin, pekerjaan, alamat, id, nomorhp);
        this.penyakit=penyakit;
    }

    @Override
    public void display() {
        
    }
    
}
