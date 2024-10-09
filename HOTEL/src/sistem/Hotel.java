/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

/**
 *
 * @author iwana
 */

public class Hotel {
    // Tiga varian kamar diinisialisasi sebagai objek individual
    private Kamar singleRoom = new Kamar(1, "Single", 500000);
    private Kamar doubleRoom = new Kamar(2, "Double", 750000);
    private Kamar familyRoom = new Kamar(3, "Family", 1000000);

    public Kamar getKamar(int nomorKamar) {
        switch (nomorKamar) {
            case 1: return singleRoom;
            case 2: return doubleRoom;
            case 3: return familyRoom;
            default: return null;
        }
    }
    
    //tampilkan varian kamar beserta harganya
    public void tampilkanVarianKamar() {
        System.out.println("Varian Kamar yang Tersedia:");
        System.out.println("1. Single Room - Harga: Rp" + singleRoom.getHarga());
        System.out.println("2. Double Room - Harga: Rp" + doubleRoom.getHarga());
        System.out.println("3. Family Room - Harga: Rp" + familyRoom.getHarga());
    }
    
    //tampilkan status kamar (tersedia/booked)
    public void tampilkanStatusKamar() {
        System.out.println(singleRoom.getNomorKamar() + ". kamar" + singleRoom.getVarianKamar() + ": " + (singleRoom.getIsBooked() ? "Booked" : "Available"));
        System.out.println(doubleRoom.getNomorKamar() + ". kamar" + doubleRoom.getVarianKamar() + ": " + (doubleRoom.getIsBooked() ? "Booked" : "Available"));
        System.out.println(familyRoom.getNomorKamar() + ". kamar" + familyRoom.getVarianKamar() + ": " + (familyRoom.getIsBooked() ? "Booked" : "Available"));
    }
}

