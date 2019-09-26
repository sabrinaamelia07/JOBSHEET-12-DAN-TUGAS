/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5js12;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class LATIHAN5JS12 {

    /**
     * @param a
     * @param b
     * @param c
     */
    public static void hasil(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("Nilai terbesar adalah "+a);
        }else if(b>a && b>c){
            System.out.println("Nilai terbesar adalah "+b);
        }else if(c>a && c>b){
            System.out.println("Nilai terbesar adalah "+c);
            
        }
        
    }
    public static void main(String[] args){
        Scanner brn = new Scanner(System.in);
        System.out.print("Masukkan bilangan 1 = ");
        int a = brn.nextInt();
        System.out.print("Masukkan bilangan 2 = ");
        int b = brn.nextInt();
        System.out.print("Masukkan bilangan 3 = ");
        int c = brn.nextInt();
        hasil(a,b,c);
        
        
    }
    
}
