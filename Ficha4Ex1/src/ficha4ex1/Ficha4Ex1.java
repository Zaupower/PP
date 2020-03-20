/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ex1;

import static ficha4ex1.User.id;

/**
 *
 * @author marce
 */
public class Ficha4Ex1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       User user = null;
       Expenses expenses = null;
     
        user.id[0] = 'A';
        user.id[1] = 'B';
        user.id[2] = 'C';
        user.name = new char[]{'B','r','u','o'};
        user.email = new char[]{'B','r','u','o'};
        
        System.out.println(user.name );
        System.out.println(user.expenses.descriptionCar);
        System.out.println(user.id);
        
    }
    
}
