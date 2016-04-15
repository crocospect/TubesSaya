/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Database;
import View.inputdatapasien;
import java.util.ArrayList;

/**
 *
 * @author Raka
 */
public class c_inputpasien {
    
    Database db = new Model.Database();
    ArrayList<Model.Database> listpasien;
    View.inputdatapasien idp;

    public void setListpasien(ArrayList<Database> listpasien) {
        this.listpasien = listpasien;
    }

    public void setIdp(inputdatapasien idp) {
        this.idp = idp;
    }
    
    
}
