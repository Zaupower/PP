/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3ex3;

/**
 *
 * @author marce
 */
public class Ficha3Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maior = 0;
        int menor = 1000;
        int contador =0;
        int contadorRep=0;

        int original[][] = {{1, 3, 4},
        {2, 4, 3},
        {3, 4, 5},
        {1, 2, 10}};
        int[] maiorL = new int[4];
        int menorL[] = new int[]{100,100,100,100};
        
        // Loop through all rows 
        for (int i = 0; i < original.length; i++) {
            // Loop through all elements of current row 
            for (int j = 0; j < original[i].length; j++) {
                if (original[i][j] > maior) {
                    maiorL[i] = original[i][j];
                }

                if (original[i][j] < menorL[i]) {
                    menorL[i] = original[i][j];
                    menor =original[i][j];
                    
                }

            }
        }
        
        //search for duplicatoes
        // Loop through all rows 
        //System.out.println("numeros repetidos");
        for (int i = 0; i < original.length; i++) {
            // Loop through all elements of current row 
            for (int j = 0; j < 3; j++) {
                // Loop through all rows 
                for (int k = 1; i < original.length; i++) {
                    // Loop through all elements of current row 
                    for (int l = 1; j < original[l].length; j++) {
                        if(original[i][j]==original[k][l]){
                            contadorRep++;
                            System.out.println("numero rep");
                            System.out.println(original[k][l]);
                        }
                    }
                }
            }
        }
        //teste
        
       
        
        
        //
        
        System.out.println("Numeors maiores");
        for (int i = 0; i < maiorL.length; i++) {
            System.out.println(maiorL[i]);
        }
        System.out.println("numeros menores");
        for (int i = 0; i < menorL.length; i++) {
            System.out.println(menorL[i]);
        }

        System.out.println("numeros repetidos = "+contadorRep);
    }

}
