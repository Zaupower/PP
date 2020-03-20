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
public class User {
    private static final int ID_SIZE = 3;
    
    protected char[] id;
    protected String name;
    protected String email;
    protected Date birthDate;
    protected Expense[] expense;

    public User(char[] id, String name, String email, Date birthDate, Expense[] expense) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.expense = expense;
    }
    
    
    
    
    
    
}
