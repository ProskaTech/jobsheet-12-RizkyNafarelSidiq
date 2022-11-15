/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js12.lat.pkg1;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */
public class RodaEmpat extends JS12Lat1{
    double NaikHargaKe = 8; // 1 kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga mobil menjadi Rp. " 
                              + hargaDasar);
    }
    
}
