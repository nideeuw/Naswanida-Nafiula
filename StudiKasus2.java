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
public class StudiKasus2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pendapatan;
        double jasa, komisi, total;
        Scanner input = new Scanner (System.in);
        System.out.println("<<<Menghitung Pendapatan Salesman>>>");
        System.out.print("Jumlah Pendapatan Salesman: Rp ");
        pendapatan = input.nextInt();
        
        if (pendapatan <=200000)
        {
            jasa = 10000;
            komisi = 0.1*pendapatan;
    }
        else if (pendapatan <=500000) {
            jasa = 20000;
            komisi = 0.15*pendapatan;
        }
        else {
            jasa = 30000;
            komisi = 0.2*pendapatan;
        }
        System.out.println("Jumlah Uang Jasa diperoleh: Rp "+jasa);
        System.out.println("Jumlah Uang Komisi diperoleh: Rp "+komisi);
        total = jasa+komisi;
        System.out.println("Total Perolehan Jasa dan Komisi: Rp "+total);
        total = pendapatan+jasa+komisi;
        System.out.println("Total Seluruh Pendapatan: Rp "+total);
    
        
    }
    
}
