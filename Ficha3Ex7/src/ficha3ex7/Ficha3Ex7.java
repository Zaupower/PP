/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3ex7;

/**
 *
 * @author marce
 */
public class Ficha3Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = Integer.parseInt(args[0]); //a=5 dividendo
        int b = Integer.parseInt(args[1]); //b=2 divisor
        int q = 0, r; //quociente e resto
        int aux; //valor da subtracao a ser armazenado

        aux = a;

        while (aux >= b) {
            aux = aux - b;
            q = q + 1;
        }

        r = aux;

        System.out.println(q);
        System.out.println(r);

    }
    
}
