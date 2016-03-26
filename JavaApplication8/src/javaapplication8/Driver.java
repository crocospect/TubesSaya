/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Crocospect
 */
public class Driver {
    public static void main(String[] args) throws Exception {
        AplikasiKonsole apk = new AplikasiKonsole();
        try{
            apk.MainMenu();
        }catch (Exception e){
            System.out.println("Terdapat kesalahan dalam input data");
            apk.MainMenu();
        }
    }
}
