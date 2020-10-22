/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;

/**
 *
 * @author MOKLET-2
 */
import java.util.Scanner;
public class StudiKasus3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kode;
        int pilihkode = 1, pilihkode1 = 2, pilihkode2 = 3;
        String barang;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Kode yang tersedia: "+pilihkode+", "+pilihkode1+", "+pilihkode2);
        System.out.print("Masukkan kode barang: ");
        kode = input.nextInt();
        switch (kode)
        {
            case 1:
            barang = "Alat Olahraga";
            break;
            case 2:
            barang = "Alat Elektronik";
            break;
            case 3:
            barang = "Alat Masak";
            break;
            default:
            barang = "Anda Salah Memasukkan Kode";
            break;
        }
        System.out.println("Hasil Kode yang dipilih: "+barang);
        
    }
    
}
