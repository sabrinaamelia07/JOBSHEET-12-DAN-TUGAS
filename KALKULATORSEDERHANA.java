/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator.sederhana;

/**
 *
 * @author PC
 */
public class KALKULATORSEDERHANA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---KALKULATOR SEDERHANA---");
        System.out.println("PENJUMLAHAN: "+penjumlahan());
        System.out.println("PENGURANGAN: "+pengurangan());
        System.out.println("PERKALIAN: "+perkalian());
        System.out.println("PEMBAGIAN: "+pembagian(50, 10));
        System.out.println("SISA HASIL BAGI: "+sisahasilbagi(5, 10));
    }
    public static int penjumlahan(){
        int bil1 = 10;
        int bil2 = 50;
        int hasil = bil1+bil2;
        return hasil;
    }
    public static int pengurangan(){
        int bil1 = 50;
        int bil2 = 10;
        int hasil = bil1-bil2;
        return hasil;
    }
    public static int perkalian(){
        int bil1 = 10;
        int bil2 = 50;
        int hasil = bil1*bil2;
        return hasil;
    }
    public static double pembagian(int bil1, int bil2){
        
        double hasil = 50/10;
        return hasil;
    }
    public static double sisahasilbagi(int bil1, int bil2){
        if(bil1>bil2){
            System.out.println("Sisa hasil bagi = " +(bil1%bil2));
        }else if(bil1<bil2){
            System.out.println("Sisa hasil bagi = Tidak ada sisa hasil bagi");
            
        }
        return 0;
    
    }
    
}

