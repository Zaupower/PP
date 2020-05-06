/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

/**
 *
 * @author marce
 */

/**
 * 
 * Interface de metodos para o Super Mercado
 */
public interface MarketService {
    
    double getPotatoesPrice();
    void  setPotatoesPrice(double p);
    double getMarketTotal(double kilos);
}
