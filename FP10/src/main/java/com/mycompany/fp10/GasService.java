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

/**
 * 
 * Inteface da estaco de Servico
 */
public interface GasService {
    
    /**
     * 
     * @return
     * Retorna Preco do Gas
     */
    double getGasPrice();
    
    /**
     * 
     * @param p set do preco do gas
     */
    void setGasPrice(double p);
    
    /**
     * 
     * @param litres
     * @return total a pagar pelos "litres" inseridos
     */
    double getGasTotal(double litres);
    
}
