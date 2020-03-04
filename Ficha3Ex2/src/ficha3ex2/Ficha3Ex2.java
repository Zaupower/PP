/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3ex2;

/**
 *
 * @author marce
 */
public class Ficha3Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, m = 0, flag = 0;
        int vetor[] = {1, 2, 3, 4};

        for (int j = 0; j < vetor.length; j++) {
            m = vetor[j] / 2;
            if (vetor[j] == 0 || vetor[j] == 1) {
                System.out.println(vetor[j] + " is not prime number");
            } else {
                for (i = 2; i <= m; i++) {
                    if (vetor[j] % i == 0) {
                        System.out.println(vetor[j] + " is not prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(vetor[j] + " is prime number");
                }
            }//end of else 
        }

    }

}
