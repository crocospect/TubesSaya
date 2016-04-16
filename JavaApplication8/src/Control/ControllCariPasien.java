/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.CariPasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Raka
 */
public class ControllCariPasien implements ActionListener{
    CariPasien caripasien;

    public ControllCariPasien(){
        caripasien = new CariPasien();
        caripasien.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (e.equals(caripasien.getBtnCari())){
            new ControllCariPasien();
            caripasien.dispose();
        } else if (e.equals(caripasien.getBtnHome())){
            new ControllHome();
            caripasien.dispose();
        }else if (e.equals(caripasien.getBtnExit())){
            new ControllKeluar();
            caripasien.dispose();
        }
    }
    
    
}
