/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2ex4;

/**
 *
 * @author marce
 */
public class Ficha2Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int j= 0;
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        for(int i=0;i<nome.length;i++){
            if(nome[i]==' '){
                 j= i+1;
                for(int k=j;k<nome.length;k++){
                    System.out.print(nome[k]);
                }
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(nome[i]);
        }
        System.out.println("\n");
    }
    
}
