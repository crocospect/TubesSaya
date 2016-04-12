/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Kazero
 */
public class Database {

    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;

    public Database() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(),
                    "JDBC Driver Error", JOptionPane.WARNING_MESSAGE);

        }

    }
    
    public void close(){
        try{
        con.close();
        stmt.close();
        rs.close();
        }catch(Exception e){}
    }
    public void connect(){
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/tubes", dbuser, dbpasswd);
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(),
                    "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            rs = stmt.executeQuery(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage(),
                    "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }

    public void execute(String SQLString) {
        try {
            connect();
            stmt.executeUpdate(SQLString);
            close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage(),
                    "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
