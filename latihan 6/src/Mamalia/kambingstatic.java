/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mamalia;

/**
 *
 * @author ASUS
 * NAMA                 : AGUNG GUMELAR
 * KELAS                : TI-1B
 * NIM                  : A2.1900006
 * Deskripsi Program    : kambingstatis & konstanta
 */
public class kambingstatic {
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main (String[] args){
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
}
