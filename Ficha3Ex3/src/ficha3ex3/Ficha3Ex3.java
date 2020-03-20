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
        int linha=0;
        int coluna=0;
        int maisRepetido=0;

        int original[][] = {{1, 3, 4},
                            {2, 4, 3},
                            {3, 4, 5},
                            {1, 2, 10}};
        
        int[][] duplicados = {{0, 0, 0},
                              {0, 0, 0},
                              {0, 0, 0},
                              {0, 0, 0}};
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
        //encontrar numeros repetidos atraves da posiçao
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                for (int k = 0; k < original.length; k++) {
                    for (int l = 1; l < original[l].length; l++) {
                        if (original[i][j] == original[k][l]) {       
                            duplicados[i][j] += 1; 
                        }
                    }
                }
            }
        }
        
         System.out.println("");

        //print quantidade posicoes
        for (int k = 0; k < 4; k++) {
            System.out.println("");
            for (int l = 0; l < 3; l++) {
                System.out.print(duplicados[k][l] + "\t");

            }
        } 
        //achar na matriz dos duplicados qual o numero que se repete mais vezes
        System.out.println("");
        for (int i = 0; i < duplicados.length; i++) {
            // Loop through all elements of current row 
            for (int j = 0; j < duplicados[i].length; j++) {
                if (duplicados[i][j] > maisRepetido) {
                    maisRepetido=duplicados[i][j];
                    System.out.println(original[i][j]);
                    linha=i;
                    coluna=j;
                }
            }
        }
     
        //
        System.out.println("Mais repetido "+original[linha][coluna]);
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
    
