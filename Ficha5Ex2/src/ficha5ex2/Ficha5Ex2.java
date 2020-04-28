/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5ex2;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author marce
 */
public class Ficha5Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Musica m1 = new Musica(1,"hello",1.99f,"marcelo");
        Musica arrMusicas[] = {m1};
        ElemntoDaBanda arrElemnts[]= null;
        LocalDate date = LocalDate.of( 2014 , 2 , 11 );
        Cd cd1 = new Cd(" nome da banda", "nome do cd", 1.88f, date, "editora", arrElemnts , arrMusicas);
    }
    
}
