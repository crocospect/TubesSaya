/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NANDHA
 */
public class dokter extends orang {

    private String spesialis;

    public dokter(String spesialis, String nama, int usia, String jns_kelamin, String pekerjaan, String alamat, String id, int nomorhp) {
        super(nama, usia, jns_kelamin, pekerjaan, alamat, id, nomorhp);
        this.spesialis = spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getSpesialis() {
        return spesialis;
    }

    @Override
    public void display() {
        System.out.println("ID Dokter   : " + getId());
        System.out.println("Nama Dokter : " + getNama());
        System.out.println("");
    }

}
