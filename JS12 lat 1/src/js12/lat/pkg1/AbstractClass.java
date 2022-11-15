/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js12.lat.pkg1;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */
  abstract class Orang {
    public String namaAyah = "Randi Proska";
    abstract void makan();
    public void minum(){
        System.out.println("Minum Air Teh dan Kopi");
    }
}

class AnakUmur1Tahun extends Orang{
    
    public void namaAyahku(){
        System.out.println("Nama Ayahku adalah " + namaAyah);
    }

    @Override
    public void makan(){
        System.out.println("Anak Umur 1 Tahun Makan Asi");
    }

    @Override
    public void minum(){
        System.out.println("Anak Umur 1 Tahun Minum Asi");
    }

    class Manusia{
        public static void main(String[] args) {
            // Object induk tidak bisa dibuat disini 
            
            // Buat objek anak umur 1 tahun baru
            AnakUmur1Tahun a1= new AnakUmur1Tahun();

            // Panggil method anak umur 1 tahun
            a1.makan();
            a1.minum();
            a1.namaAyahku();
            System.out.println();
        }
    }
}