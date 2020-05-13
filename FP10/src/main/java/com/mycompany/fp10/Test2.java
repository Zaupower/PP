/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fp10;
import Financial.HiperMarket;
import Markets.ContinentHipermarket;
import Markets.JumbHipermarket;
import com.mycompany.fp10.Ex2.LargeGasStation;

import java.lang.reflect.Array;

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
        
       // HiperMarket hiperMarket = new HiperMarket(3, 0.5, 0.01, 1.98);
        //System.out.println("HiperMarket Values "+ hiperMarket.getAnnualRate());
        //System.out.println(hiperMarket.computeMonthlyPayment(100, 5));
        System.out.println(" hyper  ");
        
       //double r = hiperMarket.getGasTotal(5);
       // hiperMarket.getCoffeTotal(4);
       // hiperMarket.getMarketTotal(5);
        //System.out.println(hiperMarket.calculatePoints());
       // hiperMarket.getTotal();
        ContinentHipermarket conti = new ContinentHipermarket(2,33,1.5,5," ",2);
        JumbHipermarket jumbHipermarket =new JumbHipermarket(2,2,2,2," name333",111);
        boolean b = conti.morepoints(55, jumbHipermarket );
        System.out.println(b);
        GasStation gasStation1 = new GasStation(3,33,"bomas1",22);
        GasStation gasStation2 = new GasStation(6,33,"bomas1",22);
        GasStation gasStation3= new GasStation(2,33,"bomas1",22);
        GasStation gasStation4 = new GasStation(2,33,"bomas1",22);
        GasStation[] arr = new GasStation[4];
        arr[0] = gasStation1;
        arr[1] = gasStation2;
        arr[2] = gasStation3;
        arr[3] = gasStation4;

        System.out.println("gas price "+gasStation1.getGasPrice());
        GasStation gg = conti.compareAll(arr);
        System.out.println(gg);
    }
    
}
