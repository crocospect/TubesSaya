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
    private  String penyakit;
    private  String tgl_daftar;
    private  String gol_darah;
    private  String nama_pj;
    private  String alamat_pj;
    private long noHp;
    private  String hub_dg_pasien;

    public pasien(String nama, int usia, String jns_kelamin, String pekerjaan, 
            String alamat, long id, long nomorhp, String penyakit, 
            String tgl_daftar, String gol_darah, String nama_pj, String alamat_pj, 
            long noHp, String hub_dg_pasien) {
        super(nama, usia, jns_kelamin, pekerjaan, alamat, id, nomorhp);
        this.penyakit=penyakit;
        this.tgl_daftar=tgl_daftar;
        this.alamat_pj=alamat_pj;
        this.gol_darah=gol_darah;
        this.nama_pj=nama_pj;
        this.hub_dg_pasien=hub_dg_pasien;
        
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public String getTgl_daftar() {
        return tgl_daftar;
    }

    public void setTgl_daftar(String tgl_daftar) {
        this.tgl_daftar = tgl_daftar;
    }

    public String getGol_darah() {
        return gol_darah;
    }

    public void setGol_darah(String gol_darah) {
        this.gol_darah = gol_darah;
    }

    public String getNama_pj() {
        return nama_pj;
    }

    public void setNama_pj(String nama_pj) {
        this.nama_pj = nama_pj;
    }

    public String getAlamat_pj() {
        return alamat_pj;
    }

    public void setAlamat_pj(String alamat_pj) {
        this.alamat_pj = alamat_pj;
    }

    public String getHub_dg_pasien() {
        return hub_dg_pasien;
    }

    public void setHub_dg_pasien(String hub_dg_pasien) {
        this.hub_dg_pasien = hub_dg_pasien;
    }

    
    public long getNoHp() {
        return noHp;
    }

    public void setNoHp(long noHp) {
        this.noHp = noHp;
    }
    
    

    @Override
    public void display() {
        
    }
    
}
