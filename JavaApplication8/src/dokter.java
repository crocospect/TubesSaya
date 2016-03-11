/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NANDHA
 */
public class dokter {
    private String nama_dok;
    private String spesialis;
    private String id_dok;

    public dokter(String nama_dok, String spesialis, String id_dok) {
        this.nama_dok = nama_dok;
        this.spesialis = spesialis;
        this.id_dok = id_dok;
    }

    public void setNama_dok(String nama_dok) {
        this.nama_dok = nama_dok;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public void setId_dok(String id_dok) {
        this.id_dok = id_dok;
    }
    
    public String getNama_dok() {
        return nama_dok;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public String getId_dok() {
        return id_dok;
    }
    
    
}
