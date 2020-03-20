/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3ex5;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Ficha3Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        float dollarValue = (float) 1.13;
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter Euro value:");
        float euros = myObj.nextFloat();
        
        float dollars = (float) (euros * dollarValue);
        System.out.println(dollars);
        
        
        
    }
    
}
