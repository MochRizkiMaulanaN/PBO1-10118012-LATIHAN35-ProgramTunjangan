/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtunjangan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Gaji g = new Gaji();
        
        System.out.println("=== Progaram Tunjangan ===");
        System.out.print("Berapa Gaji Pokok Anda perbulan : Rp. ");
        double gp=input.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        String status=input.next();
        System.out.println("");
        
        g.Hitung(status, gp);
        
      
    }
    
}
