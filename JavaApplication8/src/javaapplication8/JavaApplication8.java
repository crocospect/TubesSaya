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
public class JavaApplication8 {
    
    public static void main(String[] args) throws Exception {
        
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
            System.out.println("6. EXIT");
            System.out.print("Masukkan inputan ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1: {
                    
                    System.out.print("Masukkan Id Pasien      : ");
                    long id = input.nextLong();
                    System.out.print("Masukkan Nama           : ");
                    String nama = input.next();
                    System.out.print("Masukkan Alamat         : ");
                    String alamat = input.next();
                    System.out.print("Masukkan Usia           : ");
                    int usia = input.nextInt();
                    System.out.print("Masukkan Nomor Hp       : ");
                    long nomor = input.nextLong();
                    System.out.print("Masukkan Nama Dokter  :");
                    String nama_dokter = input.next();
                    System.out.println("Ruangan yang tersedia :");
                    System.out.print("1.");
                    r1.display();
                    System.out.print("2.");
                    r2.display();
                    System.out.print("3.");
                    r3.display();
                    
                    System.out.print("Ruangan yang dipilih :");
                    int kamar = input.nextInt();
                    
                    pasien p1 = new pasien(id, nama, alamat, usia, nomor);
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
                    System.out.print("apakah anda ingin lanjut? (Y/T) ");
                    String pil_lan = input.next();
                    if (pil_lan.equals("T")) {
                        lanjut = false;
                    }
                    
                    break;
                }
                case 2: {
                    System.out.println("Masukkan No. Ruangan :");
                    int no_ruang = input.nextInt();
                    switch (no_ruang) {
                        case 1: {
                            
                            System.out.println("Masukkan Id Pasien :");
                            int x = input.nextInt();
                            
                            System.out.println("Masukkan diagnosa  :");
                            String diagnosa = input.next();
                            r1.getPasienInap(x).addDiagnosa(diagnosa);
                            break;
                        }
                        case 2: {
                            System.out.println("Masukkan Id Pasien :");
                            int x = input.nextInt();
                            
                            System.out.println("Masukkan diagnosa  :");
                            String diagnosa = input.next();
                            r2.getPasienInap(x).addDiagnosa(diagnosa);
                            break;
                        }
                        case 3: {
                            System.out.println("Masukkan Id Pasien :");
                            int x = input.nextInt();
                            
                            System.out.println("Masukkan diagnosa  :");
                            String diagnosa = input.next();
                            r3.getPasienInap(x).addDiagnosa(diagnosa);
                            break;
                        }
                    }
                    System.out.print("apakah anda ingin lanjut? (Y/T) ");
                    String pil_lan = input.next();
                    if (pil_lan.equals("T")) {
                        lanjut = false;
                    }
                    break;
                }
                case 3: {
                    System.out.println("Masukkan No. Ruangan :");
                    int no_ruang = input.nextInt();
                    Ruangan r = null;
                    switch (no_ruang) {
                        case 1: {
                            System.out.println("Masukkan Id Pasien :");
                            int x = input.nextInt();
                            r1.getPasienInap(x).display();
                            break;
                        }
                        case 2: {
                            System.out.println("Masukkan Id Pasien :");
                            int x = input.nextInt();
                            r2.getPasienInap(x).display();
                            break;
                        }
                        case 3: {
                            System.out.println("Masukkan Id Pasien :");
                            int x = input.nextInt();
                            r3.getPasienInap(x).display();
                            break;
                        }
                    }
                    System.out.print("apakah anda ingin lanjut? (Y/T) ");
                    String pil_lan = input.next();
                    if (pil_lan.equals("T")) {
                        lanjut = false;
                    }
                    break;
                }
                case 4: {
                    System.out.println("Masukkan No. Ruangan :");
                    int no_ruang = input.nextInt();
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
                    String pil_lan = input.next();
                    if (pil_lan.equals("T")) {
                        lanjut = false;
                    }
                    break;
                }
                case 5: {
                    System.out.println("=====Masukkan data pasien yang akan dihapus=====");
                    System.out.println("Masukkan No. Ruangan :");
                    int no_ruang = input.nextInt();
                    Ruangan r = null;
                    switch (no_ruang) {
                        case 1: {
                            System.out.println("Masukkan Id Pasien :");
                            int x = input.nextInt();
                            r1.removePasienInap(x);
                            break;
                        }
                        case 2: {
                            System.out.println("Masukkan Id Pasien :");
                            int x = input.nextInt();
                            r2.removePasienInap(x);
                            break;
                        }
                        case 3: {
                            System.out.println("Masukkan Id Pasien :");
                            int x = input.nextInt();
                            r3.removePasienInap(x);
                            break;
                        }
                    }
                    System.out.print("apakah anda ingin lanjut? (Y/T) ");
                    String pil_lan = input.next();
                    if (pil_lan.equals("T")) {
                        lanjut = false;
                    }
                    break;
                }
                case 6: {
                    System.exit(0);
                    
                }
            }
        }
    }
}
