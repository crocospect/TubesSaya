/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Crocospect
 */
public class JavaApplication8 {

    public static void main(String[] args) {
        
        dokter d1;
        dokter d2;
        dokter d3;
        d1 = new dokter("Oca","Jl Telekomunikasi",32,12345);
        d2 = new dokter("Mining","Jl Telekomunikasi",35,12346);
        d3 = new dokter("Nandha","Jl Telekomunikasi",33,12347);
        
        pasien p1;
        pasien p2;
        p1 = new pasien (123466,"Abc","Jl Abc",20,5555555);
        p2 = new pasien (123333,"Bcd","Jl Bcd",22,9999999);
        
        PasienInap pi1;
        PasienInap pi2;
        pi1 = new PasienInap(p1,d1);
        pi2 = new PasienInap(p2,d3);
        
    }
    
}
