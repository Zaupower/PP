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
class Expense {
    
    protected int id;
    protected String type;
    protected float value;
    protected Date date;
    protected String currencyType;

    public Expense(int id, String type, float value, Date date, String currencyType) {
        this.id = id;
        this.type = type;
        this.value = value;
        this.date = date;
        this.currencyType = currencyType;
    }

    
    
    
    
    
}
