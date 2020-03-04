/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3ex1;

/**
 *
 * @author marce
 */
public class Ficha3Ex1 {

    static int MATRIXSIZE = 3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int original[][]={{1,3,4},
                        {2,4,3},
                        {3,4,5}};
       
       int transpose[][]=new int[MATRIXSIZE][MATRIXSIZE];  //3 rows and 3 columns  
       
       //Code to transpose a matrix  
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
            transpose[i][j]=original[j][i];  
            }    
        }
        
        System.out.println("Printing Matrix without transpose:");  
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
            System.out.print(original[i][j]+" ");    
            }    
        System.out.println();//new line    
        } 
        
        
        System.out.println("Printing Matrix After Transpose:");  
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
        System.out.print(transpose[i][j]+" ");    
            }    
        System.out.println();//new line    
        }
        
        
        
        
    }
}  
    
  
