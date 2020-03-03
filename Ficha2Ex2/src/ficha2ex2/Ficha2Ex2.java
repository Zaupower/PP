/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2ex2;

/**
 *
 * @author marce
 */
public class Ficha2Ex2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       int soma =0;
       int scores[][]  = { { 11, 7, 333 },
                            { -20, -23, 63 },
                            { -22, 501, 10000 }};
       int mat[][] = { { 1, 2, 3, 4 }, 
                        { 5, 6, 7, 8 }, 
                        { 9, 10, 11, 12 } }; 

     print2D(scores); 
    }
     public static void print2D(int mat[][]){ 
         int meancounter=0;
         int sum =0;
         
        // Loop through all rows 
        for (int i = 0; i < mat.length; i++){
           // Loop through all elements of current row 
            for (int j = 0; j < mat[i].length; j++) {
               System.out.print(mat[i][j] + " ");
                meancounter++; 
                sum = sum +mat[i][j];
            }  
        }        
          System.out.println("\n"+"Media="+sum/meancounter+"\n"+"Soma ="+sum);      
    } 
}
