package Model;

import Model.Database;
import java.util.InputMismatchException;
import Model.orang;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NANDHA
 */
public class dokter extends orang {

    private int id_dokter;
    Model.Database db = new Database(); 

    public int getId_dokter() {
        return id_dokter;
    }
    
    public dokter(String nama) {
        super(nama);
        try{
            db.connect();
            String query = "insert into dokter(id_dokter, nama_dokter) values ("
                    + id_dokter +"',"
                    + nama +"')";
            db.execute(query);
            db.close();
        }catch(InputMismatchException e){
            System.out.println("Input Salah");
        }
    }
    
    public dokter( int id, String nama){
        super(nama);
        id_dokter = id; 
    }
}
