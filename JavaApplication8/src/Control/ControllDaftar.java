/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.PendaftaranPasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Raka
 */
public class ControllDaftar implements ActionListener {
    PendaftaranPasien daftar;
    public ControllDaftar(){
        daftar = new PendaftaranPasien();
        daftar.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(daftar.getBtnHome())){
            new ControllHome();
            daftar.dispose();
        }else if(o.equals(daftar.getBtnMasuk())){
            new ControllDaftar();
            daftar.dispose();
        }else if(o.equals(daftar.getBtnExit())){
            new ControllKeluar();
            daftar.dispose();
        }
    }
}
