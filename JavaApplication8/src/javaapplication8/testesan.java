/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import Model.Database;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Raka
 */
public class testesan {
    public static void main(String[] args) throws SQLException{
        Database db = new Database();
        db.connect();
        String query1 = "select *from ruangan";
            ResultSet r1 = db.getData(query1);
            while (r1.next()) {
                Ruangan ruang1 = new Ruangan(r1.getString(1),r1.getInt(2));
                System.out.print(ruang1.getNama());
                        
                
    }
        
    }
}