/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Database;
import View.PendaftaranPasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.pasien;
import Model.dokter;
import Model.PasienInap;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 *
 * @author Raka
 */
public class ControllPendaftaran implements ActionListener {

    PendaftaranPasien daftar;

    public ControllPendaftaran() {
        daftar = new PendaftaranPasien();
        daftar.setVisible(true);
        daftar.getBtnMasuk().addActionListener(this);
        daftar.getBtnHome().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(daftar.getBtnHome())) {
            new ControllHome();
            daftar.dispose();
        } else if (o.equals(daftar.getBtnMasuk())) {
            new ControllPendaftaran();
            Database db = new Database();
            db.connect();
            pasien p = new pasien(daftar.getNamaPasField().getText(), daftar.getAlamatField().getText(), parseInt(daftar.getUsiaField().getText()), parseLong(daftar.getNoHpField().getText()));
            dokter d = new dokter(parseInt(daftar.getIDdokter().getText()), daftar.getNamaDokter().getText());
            PasienInap PI = new PasienInap(p, d);
            db.close();
            daftar.dispose();

        }
    }
}
