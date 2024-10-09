/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengguna;
import sistem.Kamar;
import sistem.Hotel;

/**
 *
 * @author iwana
 */

public class Customer extends Pengguna {
    public Customer(String nama, int ID) {
        super(nama, ID);
    }

    public void login() {
        System.out.println("Anda login sebagai Customer.");
    }
    
    //menu user customer
    public void tampilkanMenu(Hotel hotel) {
        System.out.println("\n--- Customer Menu ---");
        System.out.println("1. Lihat status kamar");
        System.out.println("2. Pesan kamar");
        System.out.println("3. keluar");
        System.out.print("Masukkan pilihan: ");
    }
    
    //pemesanan kamar
    public void pesanKamar(Hotel hotel, int nomorKamar) {
        Kamar kamar = hotel.getKamar(nomorKamar);
        if (kamar != null && kamar.isAvailable()) {
            tampilkanDetailPesanan(kamar);
            kamar.book();
            System.out.println("Kamar " + kamar.getNomorKamar() + " berhasil dibooking oleh " + this.nama);
        } else {
            System.out.println("Kamar tidak tersedia atau sudah dibooking.");
        }
    }
    
    //detail pesanan yang menampilkan nama, varian, dan harga
    public void tampilkanDetailPesanan(Kamar kamar) {
        System.out.println("Detail Pesanan:");
        System.out.println("Nama: " + this.nama);
        System.out.println("Varian Kamar: " + kamar.getVarianKamar());
        System.out.println("Harga: Rp" + kamar.getHarga());
    }
}
