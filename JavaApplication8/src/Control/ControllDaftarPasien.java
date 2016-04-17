/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.DaftarPasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Raka
 */
public class ControllDaftarPasien implements ActionListener{
    
    DaftarPasien data;

    public ControllDaftarPasien (){
        data = new DaftarPasien();
        data.setVisible(true);
        data.getBtnKembali().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(data.getBtnKembali())){
            new ControllLihatDaftar();
            data.dispose();
        }
    }
    
    
}
