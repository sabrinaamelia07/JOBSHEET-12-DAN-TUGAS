/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg2.js.pkg12;

/**
 *
 * @author PC
 */
public class LATIHAN2JS12 {

    /**
     * @param a
     * @param b
     * @return 
     */
    public static int hitung(int a, int b)
    {
        int c = a + b;
        return c;
    }    
    public static void main(String[] args)
    {
        int x;
        int bill = 34, bill2 = 65;
        
        x = hitung(bill, bill2);
        
        System.out.println("Hasil : " + x);
    }
    
    
}
