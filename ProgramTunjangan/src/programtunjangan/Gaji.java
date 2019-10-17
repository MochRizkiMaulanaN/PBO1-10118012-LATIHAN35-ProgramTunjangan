/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtunjangan;

/**
 *
 * @author LENOVO
 */
public class Gaji {
    public double gp;
    public double tj;
    public double total;
    public String status;

    
    
    public void Hitung(String status,double gp){
        if(status.equals("Menikah")){
            tj=0.35 * gp;
            total=tj + gp;
        }else{
            tj=0;
            total=tj + gp;
        }
        System.out.println("=== Hasil Perhitungan Gaji Anda ===");
        System.out.println("Gaji Pokok : Rp."+gp);
        System.out.println("Tunjangan  : Rp."+tj);
        System.out.println("Total Gaji : Rp."+total);
    }

   
    
   
    
}
