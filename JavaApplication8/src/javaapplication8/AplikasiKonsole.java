/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Raka
 */
public class AplikasiKonsole {

    public void MainMenu() throws Exception {
        //public  void main(String[] args) throws Exception {

        Ruangan r1 = new Ruangan("Gold");
        Ruangan r2 = new Ruangan("Silver");
        Ruangan r3 = new Ruangan("Bronze");

        int pilih;
        boolean lanjut = true;
        Scanner input = new Scanner(System.in);
        while (lanjut) {

            System.out.println("===Pelayanan Rumah Sakit===");
            System.out.println("1. Pendaftaran Pasien");
            System.out.println("2. Tambah Diagnosa");
            System.out.println("3. Cari Pasien");
            System.out.println("4. Lihat Daftar Pasien");
            System.out.println("5. Hapus Data Pasien Inap");
            System.out.println("6. Keluar");
            try{
                System.out.print("Masukkan inputan ");
                pilih = input.nextInt();
            }catch (Exception e){
                System.out.println("Inputkan integer");
                input.nextLine();
            }
            pilih=input.nextInt();
            switch (pilih) {
                case 1:
                    try {

                        System.out.print("Masukkan Id Pasien      : ");
                        long id = input.nextLong();
                        try {
                            System.out.print("Masukkan Nama           : ");
                            String nama = input.next();
                            try {
                                System.out.print("Masukkan Alamat         : ");
                                String alamat = input.next();
                                try {
                                    System.out.print("Masukkan Usia           : ");
                                    int usia = input.nextInt();
                                    try {
                                        System.out.print("Masukkan Nomor Hp       : ");
                                        long nomor = input.nextLong();
                                        try {
                                            System.out.print("Masukkan Nama Dokter  :");
                                            String nama_dokter = input.next();
                                        } catch (Exception e) {
                                            System.out.println("Inputkan tipe variabel String");
                                            input.nextLine();
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Inputkan tipe variabel Long");
                                        input.nextLine();
                                    }
                                } catch (Exception e) {
                                    System.out.println("Inputkan tipe variabel Integer");
                                    input.nextLine();
                                }
                            } catch (Exception e) {
                                System.out.println("Inputkan tipe variabel String");
                                input.nextLine();
                            }
                        } catch (Exception e) {
                            System.out.println("Inputkan tipe variabel String");
                            input.nextLine();
                        }

                        System.out.println("Ruangan yang tersedia :");
                        System.out.print("1.");
                        r1.display();
                        System.out.print("2.");
                        r2.display();
                        System.out.print("3.");
                        r3.display();

                        try {
                            System.out.print("Ruangan yang dipilih :");
                            int kamar = input.nextInt();
                        }catch (Exception e){
                            System.out.println("Inputkan integer");
                            input.nextLine();
                        }
                        int kamar = input.nextInt();
                        pasien p1;
                        String nama = input.next();
                        String alamat = input.next();
                        int usia = input.nextInt();
                        long nomor = input.nextLong();
                        p1 = new pasien(id, nama, alamat, usia, nomor);
                        String nama_dokter = input.next();
                        dokter d1 = new dokter(nama_dokter);
                        
                        switch (kamar) {
                            case 1: {
                                r1.tambahPasienInap(p1, d1);
                                break;
                            }
                            case 2: {
                                r2.tambahPasienInap(p1, d1);
                                break;
                            }
                            case 3: {
                                r3.tambahPasienInap(p1, d1);
                                break;
                            }
                        }

            
                    } catch (Exception e) {
                        System.out.println("Inputkan tipe variabel String");
                        input.nextLine();
                    }
                    System.out.print("apakah anda ingin lanjut? (Y/T) ");
                    String pil_lan = input.next();
                    if (pil_lan.equals("T")) {
                        lanjut = false;
                    }

                    break;

                case 2:
                    try {
                        System.out.println("Masukkan No. Ruangan :");
                        int no_ruang = input.nextInt();
                    } catch (Exception e) {
                        System.out.println("Inputkan tipe variabel Integer");
                        input.nextLine();
                    }

                    int no_ruang = 0;
                    switch (no_ruang) {
                        case 1: {

                            try {
                                System.out.println("Masukkan Id Pasien :");
                                int x = input.nextInt();
                            } catch (Exception e) {
                                System.out.println("Inputkan tipe variabel integer");
                                input.nextLine();
                            }

                            try {
                                System.out.println("Masukkan diagnosa  :");
                                String diagnosa = input.next();
                            } catch (Exception e) {
                                System.out.println("Inputkan tipe variabel String");
                                input.nextLine();
                            }
                            long x = 0;
                            String diagnosa = null;
                            r1.getPasienInap(x).addDiagnosa(diagnosa);
                            break;
                        }
                        case 2: {
                            try {
                                System.out.println("Masukkan Id Pasien :");
                                int x = input.nextInt();
                            } catch (Exception e) {
                                System.out.println("--");
                                input.nextLine();
                            }

                            try {
                                System.out.println("Masukkan diagnosa  :");
                                String diagnosa = input.next();
                            } catch (Exception e) {
                                System.out.println("Inputkan tipe variabel String");
                                input.nextLine();
                            }
                            long x = 0;
                            String diagnosa = input.next();
                            r2.getPasienInap(x).addDiagnosa(diagnosa);
                            break;
                        }
                        case 3: {
                            try {
                                System.out.println("Masukkan Id Pasien :");
                                int x = input.nextInt();
                            } catch (Exception e) {
                                System.out.println("--");
                                input.nextLine();
                            }

                            try {
                                System.out.println("Masukkan diagnosa  :");
                                String diagnosa = input.next();
                            } catch (Exception e) {
                                System.out.println("Inputkan tipe variabel String");
                                input.nextLine();
                            }
                            long x = 0;
                            String diagnosa = input.next();
                            r3.getPasienInap(x).addDiagnosa(diagnosa);
                            break;
                        }
                    }
            System.out.print("apakah anda ingin lanjut? (Y/T) ");
            pil_lan = input.next();
            if (pil_lan.equals("T")) {
                lanjut = false;
            }
            break;
        
    
                case 3:
                    try {
                        System.out.print("Masukkan No. Ruangan :");
                        no_ruang = input.nextInt();
                    }catch (Exception e){
                        System.out.println("Inputkan tipe variabel integer");
                        input.nextLine();
                    }
                        Ruangan r = null;
                        no_ruang=input.nextInt();
                        switch (no_ruang) {
                            case 1: try{
                                System.out.print("Masukkan Id Pasien :");
                                int x = input.nextInt();
                            }catch (Exception e){
                                System.out.println("Inputkan Integer");
                                input.nextLine();
                            }
                                int x=input.nextInt();
                                r1.getPasienInap(x).display();
                                break;
                            
                            case 2: try{
                                System.out.print("Masukkan Id Pasien :");
                                 x = input.nextInt();
                            }catch (Exception e){
                                System.out.println("Inputkan Integer");
                                input.nextLine();
                            }
                                x = input.nextInt();
                                r2.getPasienInap(x).display();
                                break;
                            
                            case 3: try{
                                System.out.print("Masukkan Id Pasien :");
                                x = input.nextInt();
                            }catch (Exception e){
                                System.out.println("Inputkan Integer");
                                input.nextLine();
                            }
                                x = input.nextInt();
                                r3.getPasienInap(x).display();
                                break;
                            
                        }
                        
                        System.out.print("apakah anda ingin lanjut? (Y/T) ");
                        pil_lan = input.next();
                        if (pil_lan.equals("T")) {
                            lanjut = false;
                        }
                        break;
                     
                    
    

            case 4:
                    try {
                        System.out.print("Masukkan No. Ruangan :");
                        no_ruang = input.nextInt();
                    }catch (Exception e){
                        System.out.println("Inputkan tipe variabel integer");
                        input.nextLine();
                    }
                        no_ruang=input.nextInt();
                        switch (no_ruang) {
                            case 1: {
                                r1.diplay_pasien();
                                break;
                            }
                            case 2: {
                                r2.diplay_pasien();
                                break;
                            }
                            case 3: {
                                r3.diplay_pasien();
                                break;
                            }
                        }
                        System.out.print("apakah anda ingin lanjut? (Y/T) ");
                         pil_lan = input.next();
                        if (pil_lan.equals("T")) {
                            lanjut = false;
                        }
                        break;
                   
                case 5:
                    try {
                        System.out.println("=====Masukkan data pasien yang akan dihapus=====");
                        System.out.print("Masukkan No. Ruangan :");
                        no_ruang = input.nextInt();
                    }catch (Exception e){
                        System.out.println("Inputkan integer");
                        input.nextLine();
                    }
                        r = null;
                        no_ruang=input.nextInt();
                        switch (no_ruang) {
                            case 1: try{
                                System.out.print("Masukkan Id Pasien :");
                                int x = input.nextInt();
                            }catch (Exception e){
                                System.out.println("Inputkan integer");
                                input.nextLine();
                            }
                                int x = input.nextInt();
                                r1.removePasienInap(x);
                                break;
                            
                            case 2: try{
                                System.out.println("Masukkan Id Pasien :");
                                x = input.nextInt();
                            }catch (Exception e){
                                System.out.println("Inputkan integer");
                                input.nextLine();
                            }
                                x = input.nextInt();
                                r2.removePasienInap(x);
                                break;
                            
                            case 3: try{
                                System.out.println("Masukkan Id Pasien :");
                                x = input.nextInt();
                                }catch (Exception e){
                                System.out.println("Inputkan integer");
                                input.nextLine();
                            }
                                x = input.nextInt();
                                r3.removePasienInap(x);
                                break;
                            
                        }
                        System.out.print("apakah anda ingin lanjut? (Y/T) ");
                        pil_lan = input.next();
                        if (pil_lan.equals("T")) {
                            lanjut = false;
                        }
                        break;
                    
                    
                case 6:
                    try {
                        System.exit(0);

                    } catch (Exception e) {
                        System.out.println("Inputan salah");
                        input.nextLine();
                        break;
                    }
            }
        }
    }
}
