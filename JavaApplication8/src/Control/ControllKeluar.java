/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.keluar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Raka
 */
public class ControllKeluar implements ActionListener{
    keluar keluar;

    public ControllKeluar(){
        keluar = new keluar();
        keluar.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
}
