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
        d1 = new dokter("Spesialis Anak","Soekarno",30,"Pria","Dokter",
                "Jl Telekomunikasi",1301144134,355755);
        d2 = new dokter("Spesialis Bedah","Hatta",35,"Pria","Dokter",
                "Jl Pegangsaan",1101144114,425027);
        d3 = new dokter("Spesialis Jantung","Soetomo",33,"Pria","Dokter",
                "Jl Kiara",1201144124,323787);
        
        pasien p1;
        pasien p2;
        pasien p3;
        p1 = new pasien("Risca",17,"Perempuan","Mahasiswa","Jl Soehat",14045,
                356653,"Usus Buntu","25 Agustus 2016","O","Sumiati","Jl Soehat",
                456456,"Ibu");
        p2 = new pasien("Moektito",56,"Laki-laki","PNS","Jl Gajah Mada",130356,
                657890,"Serangan Jantung","25 Agustus 2016","O","Sumiati","Jl Soehat",
                456456,"Ibu");
        p3 = new pasien("Susan",5,"Perempuan","-","Jl Gajah Mada",123456,0000000,
                "Muntaber","25 Agustus 2016","O","Sumiati","Jl Soehat",456456,"Ibu");
    }
    
}
