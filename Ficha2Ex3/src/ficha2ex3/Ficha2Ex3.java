/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2ex3;

/**
 *
 * @author marce
 */
public class Ficha2Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int multiplicapositivos=1;
        int contaNegativos=0;
        int maior =0;
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        //percorrer a lista
        for(int i=0; i<lista.length;i++){
            //verificar se e positivo
            if(lista[i]>0){
               multiplicapositivos= multiplicapositivos*lista[i]; 
            //verificar se e negativo
            }else if(lista[i]<0){
                    contaNegativos++;
                }
            //verificar o maior
            if(lista[i]>maior){
                maior=lista[i];
            }
        }
        System.out.println("Multiplicaçao = "
                +multiplicapositivos+"\n"+"Numero de elementos negativos = "+contaNegativos+"\n"+"Numero maior = "+maior);
    }
    
}
