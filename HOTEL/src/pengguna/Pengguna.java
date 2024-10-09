/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengguna;

/**
 *
 * @author iwana
 */

// Kelas abstrak Pengguna yang menjadi superclass untuk Admin dan Customer
public abstract class Pengguna {
    // Atribut protected untuk menyimpan nama dan ID pengguna
    protected String nama;
    protected int ID;

    // Konstruktor untuk menginisialisasi nama dan ID pengguna
    public Pengguna(String nama, int ID) {
        this.nama = nama;  // Menyimpan nama pengguna
        this.ID = ID;      // Menyimpan ID pengguna
    }

    // Method abstrak login() yang harus diimplementasikan oleh subclass (Admin dan Customer)
    public abstract void login();
}

