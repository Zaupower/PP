/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Financial;

/**
 *
 * @author marce
 */
public class HiperMarket implements HiperMarketService{

    double coffePrice;
    double potatoesPrice;
    double anualRate;
    double gasPrice;

    public HiperMarket(double coffePrice, double potatoesPrice, double anualRate, double gasPrice) {
        this.coffePrice = coffePrice;
        this.potatoesPrice = potatoesPrice;
        this.anualRate = anualRate;
        this.gasPrice = gasPrice;
    }
    
    
    
    //------------------------CoffeStation------------------------//
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

 //------------------------CoffeStation------------------------//
    
 //------------------------SuperMarket------------------------//
    @Override
    public double getPotatoesPrice() {
        return this.potatoesPrice;
    }

    @Override
    public void setPotatoesPrice(double p) {
        this.potatoesPrice = p;
    }

    @Override
    public double getMarketTotal(double kilos) {
        return this.potatoesPrice * kilos;
    }
   //------------------------SupoerMarket------------------------//
    
    
    //------------------------Loan------------------------//
    @Override
    public double getAnnualRate() {
        return this.anualRate;
    }

    @Override
    public void setAnnualRate(double r) {
        this.anualRate = r;
    }

    @Override
    public double computeMonthlyPayment(double ammount) {
        return this.anualRate * ammount;
    }

    //------------------------Loan------------------------//
    
    //------------------------GasStation------------------------//
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
        return this.gasPrice * litres;
    }
    
       //------------------------GasStation------------------------//
    
}
