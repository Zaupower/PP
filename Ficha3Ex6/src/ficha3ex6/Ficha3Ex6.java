/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3ex6;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Ficha3Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter cents value:");
        float cents = myObj.nextFloat();
        
        float euros = (float) (cents/100);
        System.out.println(euros);
    }
    
}
