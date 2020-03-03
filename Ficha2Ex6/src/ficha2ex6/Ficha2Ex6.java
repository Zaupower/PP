/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2ex6;

/**
 *
 * @author marce
 */
public class Ficha2Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] array2 = {6, 99, -1, 12, 1, -2};

        int length = array1.length + array2.length;

        //array result is the array concat of array 1 and 2
        int[] result = new int[length];
        int pos = 0;
        //add secund array to result array
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }
        //add secund array to result array
        for (int element : array2) {
            result[pos] = element;
            pos++;
        }

        //count duplicates
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < length; i++) {  
            for(int j = i + 1; j < length; j++) {  
                if(result[i] == result[j])  
                    System.out.println(result[j]); 
            }  
        } 
            //print array sum
        for(int i=0;i<result.length;i++){
           System.out.print(result[i]+" "); 
        }
        
    }
}
