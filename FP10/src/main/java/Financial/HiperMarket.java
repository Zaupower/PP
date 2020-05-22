/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Financial;

import Ex3.SuperMarket;
import com.mycompany.fp10.GasStation;

import java.util.Calendar;

/**
 *
 * @author marce
 */
public abstract class HiperMarket extends SuperMarket implements HiperMarketService{

    private double coffePrice;
    private double anualRate;
    private double gasPrice;
    private int clientPoints;
    private double total;

    public HiperMarket(double coffePrice, double anualRate, double gasPrice, double potatoesPrice, String name, int vatNumber) {
        super(potatoesPrice, name, vatNumber);
        this.coffePrice = coffePrice;
        this.anualRate = anualRate;
        this.gasPrice = gasPrice;
    }


    public abstract int getPoints(double valor);

    public boolean morepoints(double valor, HiperMarket h2){
        int a,b = 0;
        boolean t = false;
        a=this.getPoints(valor);
        b=h2.getPoints(valor);
        if (a<b){
            t=true;
        }else if (a>b){
            t=false;
        }
        return t;
    }

    public GasStation compareAll(GasStation[] bombas){
        GasStation tmp = null;
        for (int i =0; i<bombas.length-2; i++){
            for (int j = 1; j< bombas.length-1;j++){
                if (bombas[i].getGasPrice() < bombas[j].getGasPrice()){
                    tmp = bombas[i];
                }else {
                    tmp= bombas[j];
                }
            }
        }

        return  tmp;
    }
   // public  cabaz
    //add mais 2 funcois
}
