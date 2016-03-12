/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;

/**
 *
 * @author Raka
 */
public class PasienInap {
    private pasien pas;
    private dokter dok;
    private ArrayList<String> diagnosa;

    public PasienInap(pasien pas, dokter dok) {
        diagnosa = new ArrayList<String>();
        this.pas = pas;
        this.dok = dok;
    }

    public void setDokter(dokter d) {
        this.dok = d;
    }

    public void addDiagnosa(String d) {
            diagnosa.add(d);
    }

    public pasien getPasienInap() {
        return pas;
    }

    public ArrayList<String> getDiagnosa() {
        return diagnosa;
    }
}
