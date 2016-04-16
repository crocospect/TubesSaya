/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.HapusDataPasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Raka
 */
public class ControllHapus implements ActionListener{
    
    HapusDataPasien hapus;
    
    public ControllHapus(){
        hapus = new HapusDataPasien();
        hapus.setVisible(true);
        hapus.getBtnExit().addActionListener(this);
        hapus.getBtnHapus().addActionListener(this);
        hapus.getBtnHome().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (e.equals(hapus.getBtnHapus())){
            new ControllHapus();
            hapus.dispose();
        }else if (e.equals(hapus.getBtnHome())){
            new ControllHome();
            hapus.dispose();
        }else if (e.equals(hapus.getBtnExit())){
            new ControllKeluar();
            hapus.dispose();
        }
    }
    
    
}
