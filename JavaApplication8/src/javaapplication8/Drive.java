/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Raka
 */
public class Drive {

    public static void main(String[] args) {

        try {
            AplikasiKonsole aplikasi = new AplikasiKonsole();
            aplikasi.MainMenu();
        } catch (Exception e) {
            System.out.println("Input Salah");
        }
    }

}
