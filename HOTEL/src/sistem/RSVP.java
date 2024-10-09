/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistem;
import pengguna.Admin;
import pengguna.Customer;
import sistem.Hotel;

/**
 *
 * @author iwana
 */
import java.util.Scanner;

public class RSVP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        
        //menu utama
        System.out.println("\n--- Hotel Bintang Toedjoeh ---");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Customer");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                //login sebagai admin
                Admin admin = new Admin("Abdur", 123);
                admin.login();
                admin.tampilkanMenu(hotel); //menampilkan menu user admin
                int pilAdmin = scanner.nextInt();
                switch(pilAdmin){
                    case 1:
                        //menampilkan status kamar
                        hotel.tampilkanStatusKamar();
                        break;
                    case 2:
                        //keluar
                        System.out.println("Anda logout");
                        break;
                    default:
                        System.out.println("Input anda salah");
                }                    
                break;
            case 2:
                //login sebagai customer
                Customer customer = new Customer("Caca", 321);
                customer.login();
                customer.tampilkanMenu(hotel); //tampilkan menu user customer
                int pilCus = scanner.nextInt();
                switch(pilCus){
                    case 1:
                        //tampilkan status kamar
                        hotel.tampilkanStatusKamar();
                        break;
                    case 2:
                        //tampilkan varian dan harga kamar
                        hotel.tampilkanVarianKamar();
                        System.out.print("Masukkan nomor kamar untuk dibooking: ");
                        int nomorKamar = scanner.nextInt();
                        customer.pesanKamar(hotel, nomorKamar); //booking kamar
                        break;
                    case 3:
                        System.out.println("Anda keluar.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            case 3:
                System.out.println("Anda keluar.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}

