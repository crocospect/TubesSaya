/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.caripasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Raka
 */
public class ControllCariPasien implements ActionListener{
    caripasien carip;

    public ControllCariPasien(){
        carip = new caripasien();
        carip.setVisible(true);
        carip.getBtnCari().addActionListener(this);
        carip.getBtnHome().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (e.equals(carip.getBtnCari())){
            new ControllDapatPasien();
            carip.dispose();
        } else if (e.equals(carip.getBtnHome())){
            new ControllHome();
            carip.dispose();
        }
    }
    
    
}
