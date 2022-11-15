/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js12.lat.pkg1;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */
interface AktivitasPagi{
    abstract void lari();

    abstract void berenang();
}

class AktivitasPagiAnak implements AktivitasPagi{

    @Override
    public void lari(){
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }

    @Override
    public void berenang(){
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}

class AktivitasUtama{
    public static void main(String[] args) {
        AktivitasPagiAnak a1 = new AktivitasPagiAnak();

        // Panggil Method anak umur 1 tahun
        a1.lari();
        a1.berenang();
    }
}
