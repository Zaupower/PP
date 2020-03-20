/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3ex8;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Ficha3Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  mueda2E=0, mueda1E=0, mueda50=0, mueda20=0, mueda10=0, mueda5=0,mueda2=0, mueda1=0;
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter Euro value:");
        float euros = myObj.nextFloat();
        
        while(euros >0){
            if(euros >=2){
                mueda2E++;
                euros -=2;
            }else if(euros >=1){
                mueda1E++;
                euros -=1;
            }else if(euros >=0.5){
                mueda50++;
                euros -=0.5;
            }else if(euros >=0.2){
                mueda20++;
                euros -=0.2;
            }else if(euros >=0.1){
                mueda10++;
                euros -=0.1;
            }else if(euros >=0.05){
                mueda5++;
                euros -=0.05;
            }else if(euros >=0.02){
                mueda2++;
                euros -=0.02;
            }else if(euros >=0.01){
                mueda1++;
                euros -=0.01;
            }
        }
        System.out.println(euros+ "muedas de 2 euros: "+ mueda2E+"\n"+" muedas de 1€: "
                +mueda1E+"\n"+"muedas de 50 centimos: "+mueda50+"\n"+"muedas de 20 centimos: "
                +mueda50+"\n"+"muedas de 20 centimos: "+ mueda20+"\n"+"muedas de 10 centimos: "
                +mueda10+"\n"+"muedas de 5 centimos: "+mueda5+"\n"+"muedas de 2 centimos"
                +mueda2+"\n"+"muedas de 1 centimos: "+mueda1);
    }
       
}
