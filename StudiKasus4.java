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
public class StudiKasus4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int nilai;
       System.out.print("Nilai yang diperoleh: ");
       nilai = input.nextInt();
       
       if (nilai>=90){
       System.out.println("Grade A");
       }
       else if (nilai>=80){
       System.out.println("Grade B+");
       }
       else if (nilai>=70){
       System.out.println("Grade B");
       }else{
       System.out.println ("Grade F");
       }
               
    }
           
    }

    
    
       

