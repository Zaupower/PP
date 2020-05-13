/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Markets;

import Financial.HiperMarket;
import Financial.HiperMarketService;

/**
 *
 * @author marce
 */
public class JumbHipermarket extends HiperMarket{


    public JumbHipermarket(double coffePrice, double anualRate, double gasPrice, double potatoesPrice, String name, int vatNumber) {
        super(coffePrice, anualRate, gasPrice, potatoesPrice, name, vatNumber);
    }

    @Override
    public int getPoints(double valor) {
        return 20;
    }

    @Override
    public double calculatePoints() {
        return 0;
    }

    @Override
    public double getAnnualRate() {
        return 0;
    }

    @Override
    public void setAnnualRate(double r) {

    }

    @Override
    public double computeMonthlyPayment(double ammount, int meses) {
        return 0;
    }

    @Override
    public double getCoffePrice() {
        return 0;
    }

    @Override
    public void setCoffePrice(double p) {

    }

    @Override
    public double getCoffeTotal(int coffes) {
        return 0;
    }

    @Override
    public double getGasPrice() {
        return 0;
    }

    @Override
    public void setGasPrice(double p) {

    }

    @Override
    public double getGasTotal(double litres) {
        return 0;
    }
}
