/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3ex4;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Ficha3Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter name, age and salary:");
        float graus = myObj.nextFloat();
        
        float rad = (float) (graus * (Math.PI/180));
        System.out.println(rad);
        
        
        
    }
    
}
