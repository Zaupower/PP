/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2ex5;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Ficha2Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.print("Enter your name : ");
        Scanner scanner = new Scanner(System. in);
        String inputString = scanner. nextLine();
        System.out.print("Enter your surname : ");
        Scanner scanner2 = new Scanner(System. in);
        String inputString2 = scanner. nextLine();
        System.out.println("Name : \n"+inputString);
        System.out.println("Surname : \n"+inputString2);
    }
    
}
