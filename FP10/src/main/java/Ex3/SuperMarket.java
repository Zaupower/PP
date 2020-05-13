/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import com.mycompany.fp10.Company;

/**
 *
 * @author marce
 */

/**
 * 
 * Classe de SuperMercado
 */
public class SuperMarket extends Company implements MarketService{
    
    /**
     * Preco das batatas
     */
    double potatoesPrice;

    /**
     * 
     * @param potatoesPrice preco das batatas
     * @param name nome da empresa
     * @param vatNumber vat da empresa
     */
    public SuperMarket(double potatoesPrice, String name, int vatNumber) {
        super(name, vatNumber);
        this.potatoesPrice = potatoesPrice;
    }

    /**
     * 
     *
     * @return preco das batatas
     */
    @Override
    public double getPotatoesPrice() {
    return this.potatoesPrice;   
    }

    /**
     * 
     * @param p preco das batatas que se vai definir
     */
    @Override
    public void setPotatoesPrice(double p) {
        this.potatoesPrice = p;
    }

    /**
     * 
     * @param kilos
     * @return total a pagar pelas batatas
     */
    @Override
    public double getMarketTotal(double kilos) {
   return this.potatoesPrice * kilos;
    }

}
