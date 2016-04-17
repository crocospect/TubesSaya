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
public class ControllPendaftaran implements ActionListener {
    PendaftaranPasien daftar;
    public ControllPendaftaran(){
        daftar = new PendaftaranPasien();
        daftar.setVisible(true);
        daftar.getBtnMasuk().addActionListener(this);
        daftar.getBtnHome().addActionListener(this);
      }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(daftar.getBtnHome())){
            new ControllHome();
            daftar.dispose();
        }else if(o.equals(daftar.getBtnMasuk())){
            new ControllPendaftaran();
            daftar.dispose();
        }
    }
}
