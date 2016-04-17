/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Database;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Raka
 */
public class PasienInap {

    Database db = new Database();
    private pasien p;
    private dokter d;
    private ArrayList<String> diagnosa = new ArrayList();
    private int numOfDiagnosa = 0;

    
    public void loadAll(){
        try{
        db.connect();
            String query = "select*from diagnosa where id_pasien= "+p.getId();
            ResultSet rs = db.getData(query);
            diagnosa = new ArrayList<>();
            while (rs.next()) {
                String di = rs.getString(2);
                diagnosa.add(di);
            }             
            db.close();
            }catch(Exception e){
        }
    }
    public long getId() {
        return this.p.getId();
    }

    public PasienInap(pasien p, dokter d) {
        this.p = p;
        this.d = d;
    }

    public void setDokter(dokter d) {
        this.d = d;
    }

    public void addDiagnosa(String d) {

        diagnosa.add(d);
    }

    public String getDiagnosa(int indeks) {
        return diagnosa.get(indeks);
    }

    public void deleteDiagnosa(int indeks) {
        diagnosa.remove(indeks);
    }

    public void display() {
        System.out.println("Nama Pasien: " + p.getNama());
        System.out.println("Id Pasien: " + p.getId());
        System.out.println("Alamat pasien: " + p.getAlamat());
        System.out.println("Usia pasien: " + p.getUsia());
        System.out.println("Nomor pasien: " + p.getNomor());
        System.out.println("Diagnosa: ");

        for (int j = 0; j < diagnosa.size(); j++) {
            System.out.println(diagnosa.get(j));
        }
    }
}
