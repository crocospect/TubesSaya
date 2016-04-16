/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.LihatDataPasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Raka
 */
public class ControllLihatDaftar implements ActionListener{
    
    LihatDataPasien lihatdata;
    public ControllLihatDaftar (){
        lihatdata = new LihatDataPasien();
        lihatdata.setVisible(true);
        lihatdata.getBtnCari().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(lihatdata.getBtnCari())){
            new ControllLihatDaftar();
            lihatdata.dispose();
        }else if (o.equals(lihatdata.getBtnHome())){
            new ControllHome();
            lihatdata.dispose();
        }else if (o.equals(lihatdata.getBtnExit())){
            new ControllKeluar();
            lihatdata.dispose();
        }
    }
    
    
}
