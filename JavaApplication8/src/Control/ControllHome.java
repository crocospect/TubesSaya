/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Raka
 */
public class ControllHome implements ActionListener{
    
    home home;
    
    public ControllHome(){
        home = new home();
        home.setVisible(true);
        home.getBtnDaftar().addActionListener(this);
        home.getBtnTmbhDiagnosa().addActionListener(this);
        home.getBtnCariPasien().addActionListener(this);
        home.getBtnHapusPasien().addActionListener(this);
        home.getBtnLihatDaftar().addActionListener(this);
        home.getBtnKeluar().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(home.getBtnDaftar())){
            new ControllPendaftaran();
            home.dispose();
        }else if (o.equals(home.getBtnTmbhDiagnosa())){
            new ControllTambahDiagnosa();
            home.dispose();
        }else if(o.equals(home.getBtnCariPasien())){
            new ControllCariPasien();
            home.dispose();
        }else if (o.equals(home.getBtnHapusPasien())){
            new ControllHapus();
            home.dispose();
        }else if (o.equals(home.getBtnLihatDaftar())){
            new ControllLihatDaftar();
            home.dispose();
        }else if (o.equals(home.getBtnKeluar())){
            new ControllKeluar();
            home.dispose();
        }
        
    }
    
    
}
