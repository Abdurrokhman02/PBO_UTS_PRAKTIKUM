/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

/**
 *
 * @author iwana
 */

public class Kamar {
    private int nomorKamar;
    private String varianKamar; // Single, Double, atau Family
    private double harga;
    private boolean isBooked;
    
    //konstruktor
    public Kamar(int nomorKamar, String varianKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.varianKamar = varianKamar;
        this.harga = harga;
        this.isBooked = false;
    }
    
    //cek ketersediaan
    public boolean isAvailable() {
        return !isBooked;
    }
    
    public void book() {
        this.isBooked = true;
    }
    
    public void cancelBooking() {
        this.isBooked = false;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public String getVarianKamar() {
        return varianKamar;
    }

    public double getHarga() {
        return harga;
    }

    public boolean getIsBooked() {
        return isBooked;
    }
}
