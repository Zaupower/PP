/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5ex1;

import java.util.Date;

/**
 *
 * @author marce
 */
public class Ficha5Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] id = {'a','b','c'};
        Date date;
        date = new Date();
        Expense expense = new Expense(4, "outro", 1590, date,"currencyType");
        Expense[] arrExpense = new Expense[3]; 
        arrExpense[0] = expense;
        arrExpense[1] = expense;
        arrExpense[2] = expense;
        
        User user1 = new User(id, "?mm", " ", date , arrExpense);
        User user2 = new User(id, "333333", " ", date , arrExpense);
        
        System.out.println(user1.birthDate);
        System.out.println(user2.expense[0].type);
       
    }
    
}
