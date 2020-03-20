/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ex1;

/**
 *
 * @author marce
 */
public class User {
    private static final int ID_SIZE = 3;
    protected static char[] id = new char[ID_SIZE];
    protected static char[] name;
    protected static char[] email;
    protected static Expenses expenses;

    public  char[] getId() {
        return id;
    }

    public void setId(char[] id) {
        User.id = id;
    }
    
   
}
