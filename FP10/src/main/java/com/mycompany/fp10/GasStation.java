/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fp10;

/**
 *
 * @author marce
 */
public class GasStation extends Company implements GasService{

    /**
     * Variaveis de instancia
     */
    protected double gasPrice;
    protected double litres;

    /**
     * 
     * @param gasPrice preco do gas
     * @param litres litros 
     * @param name nome da empresa 
     * @param vatNumber  vat da empresa 
     */
    public GasStation(double gasPrice, double litres, String name, int vatNumber) {
        super(name, vatNumber);
        this.gasPrice = gasPrice;
        this.litres = litres;
    }
    
    
    /**
     * Metodos implementados do interface GasService
     * @return 
     */
    @Override
    public double getGasPrice() {
    
        return this.gasPrice;
    }

    @Override
    public void setGasPrice(double p) {
        this.gasPrice = p;
    }

    @Override
    public double getGasTotal(double litres) {
     return this.gasPrice * this.litres;        
    }

    @Override
    public String toString() {
        return "GasStation{" + "gasPrice=" + gasPrice + ", litres=" + litres + '}';
    }
    
}
