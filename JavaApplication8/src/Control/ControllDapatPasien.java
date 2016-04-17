/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import View.DapatPasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Raka
 */
public class ControllDapatPasien implements ActionListener {
    
    DapatPasien dapatPasien;
    public ControllDapatPasien(){
        dapatPasien = new DapatPasien();
        dapatPasien.setVisible(true);
        dapatPasien.getBtnKembali();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(dapatPasien.getBtnKembali())){
            new ControllCariPasien();
            dapatPasien.dispose();
        }
    }
    
}
