/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fp10.Ex2;

import com.mycompany.fp10.GasStation;

/**
 *
 * @author marce
 */
public class LargeGasStation extends GasStation implements CoffeService {
    
    protected double coffePrice;

    public LargeGasStation(double coffePrice, double gasPrice, double litres, String name, int vatNumber) {
        super(gasPrice, litres, name, vatNumber);
        this.coffePrice = coffePrice;
    }

   

    @Override
    public double getCoffePrice() {
        return this.coffePrice;
         }

    @Override
    public void setCoffePrice(double p) {
        this.coffePrice = p;
        }

    @Override
    public double getCoffeTotal(int coffes) {
    return this.coffePrice * coffes;
    }
    
    
    
    
}
