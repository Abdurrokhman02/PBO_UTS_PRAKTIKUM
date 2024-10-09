/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengguna;
import sistem.Hotel;

/**
 *
 * @author iwana
 */

public class Admin extends Pengguna {
    public Admin(String nama, int ID) {
        super(nama, ID);
    }

    public void login() {
        System.out.println("Anda login sebagai Admin.");
    }
    
    //menu user admin
    public void tampilkanMenu(Hotel hotel) {
        System.out.println("\n--- Admin Menu ---");
        System.out.println("1. Lihat status kamar");
        System.out.println("2. Logout");
        System.out.print("Masukkan pilihan: ");
    }
}

