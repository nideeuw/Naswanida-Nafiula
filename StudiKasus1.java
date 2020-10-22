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
public class StudiKasus1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hargabarang, jumlahbarang, total, diskon=0, bayar;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("<<<Department Store>>>");
        System.out.print("Harga Barang: Rp ");
        hargabarang = input.nextDouble();
        System.out.print("Jumlah Barang: ");
        jumlahbarang = input.nextDouble();
        total =hargabarang*jumlahbarang;
        System.out.println("Total harga: Rp "+total);
        System.out.println("Jumlah yang harus dibayar: Rp "+total);
        System.out.println("Terimakasih telah berbelanja");
        
        if(total>=50000){
            diskon = 0.2*total;
            System.out.println("Total diskon: Rp "+diskon);
            bayar = total-diskon;
            System.out.println("Jumlah yang harus dibayar: Rp "+bayar);
            System.out.println("Terimakasih telah berbelanja");
        }
        
    }
    
}
