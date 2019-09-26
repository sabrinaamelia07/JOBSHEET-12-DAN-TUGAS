/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4js12;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class LATIHAN4JS12 {

    /**
     * @param a
     * @param b
     */
    public static void method(double a, double b){
        System.out.println("Kecepatan : " + (a/b) + "km/jam ");
    }
    public static void main(String[] args) {
        int jarak;
        int waktu;
        Scanner brn = new Scanner(System.in);
        System.out.print("Masukkan jarak: ");
        jarak = brn.nextInt();
        System.out.print("Masukkan waktu:");
        waktu = brn.nextInt();
        method(jarak,waktu);
                
    }
    
}
