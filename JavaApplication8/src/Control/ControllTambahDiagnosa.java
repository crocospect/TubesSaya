/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.pasien;
import View.TambahDiagnosa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Raka
 */
public class ControllTambahDiagnosa implements ActionListener{
    TambahDiagnosa tambahdiagnosa;
    
    public ControllTambahDiagnosa(){
        tambahdiagnosa = new TambahDiagnosa();
        tambahdiagnosa.setVisible(true);
        tambahdiagnosa.getBtnTambahDiagnosa().addActionListener(this);
        tambahdiagnosa.getBtnHome().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(tambahdiagnosa.getBtnTambahDiagnosa())){
            new ControllTambahDiagnosa();       
            tambahdiagnosa.dispose();
        } else if(o.equals(tambahdiagnosa.getBtnHome())){
            new ControllHome();
            tambahdiagnosa.dispose();
        } 
    }
}
