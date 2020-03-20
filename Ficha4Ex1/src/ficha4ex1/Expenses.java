/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ex1;

/**
 *
 * @author marce
 */
public class Expenses {
    private static final int NUMBER_OF_DAYS = 31; //mes de março
    
    //para despesas com 
    protected static int number1;
    /*
    vetor com o valor das despesas de automovel durante o dia do mes
    o indice do vetor corresponde ao dia do mes
    */
    protected static double [] carValues = new double[NUMBER_OF_DAYS];
    protected static char[] descriptionCar = new char[]{'C', 'A', 'R'};
    
    //Para despesas alimentares 
    protected static int number2;
    protected static double[] foodValues = new double[NUMBER_OF_DAYS];
    protected static char[] descriptionFood = new char[]{'F','O','O','D'};
    
}   
