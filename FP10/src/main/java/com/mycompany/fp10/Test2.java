/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fp10;
import Financial.HiperMarket;
import com.mycompany.fp10.Ex2.LargeGasStation;

/**
 *
 * @author marce
 */
public class Test2 {

    /**
     * @param args the command line arguments
     * 
     * Classe de testes
     */
    public static void main(String[] args) {
        GasStation gasStation = new GasStation(2.0,2," ", 2);
        System.out.println(gasStation.getGasTotal(4));
        System.out.println("UM PRINT");
        
        
        LargeGasStation largeGasStation = new LargeGasStation(2, 2, 5, " Large Gas Station",1111);
        System.out.println(largeGasStation.getCoffeTotal(5));
        
        HiperMarket hiperMarket = new HiperMarket(3, 0.5, 0.01, 1.98);
        System.out.println("HiperMarket Values "+ hiperMarket.getAnnualRate());
        System.out.println(hiperMarket.computeMonthlyPayment(100));
        
    }
    
}
