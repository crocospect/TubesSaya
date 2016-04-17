package Model;

import Model.Database;
import java.util.InputMismatchException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NANDHA
 */
public class pasien extends orang{
    
    private long id;
    Model.Database db = new Database();
    
    public pasien( String nama, String alamat, int usia, long nomor) {
        super(nama, alamat, usia, nomor);
        try{
            db.connect();
            String query = "insert into Pasien"
                    +"(nama, alamat, usia, nomorhp)"
                    + "values ('"
                    + nama +"',"
                    +alamat+","
                    
                    +usia+","
                    +nomor+"')";
                    ;
            db.execute(query);
            db.close();
        }catch (InputMismatchException e){
            System.out.println("Input Salah");
        }
    }

    public long getId() {
        return id;
    }
    
    public pasien(long id, String nama, String alamat, int usia, long nomor) {
        super(nama, alamat, usia, nomor);
        this.id = id;
    }
}
