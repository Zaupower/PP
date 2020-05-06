/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Financial;

import Ex3.MarketService;
import com.mycompany.fp10.Ex2.CoffeService;
import com.mycompany.fp10.GasService;

/**
 *Hipermercado
 * @author marce
 */
public interface HiperMarketService extends CoffeService, MarketService,
CreditService, GasService{
    
}
