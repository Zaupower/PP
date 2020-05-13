/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Financial;

/**
 *interface de credito
 * @author marce
 */
interface CreditService {
    double getAnnualRate();
    void setAnnualRate(double r);
    double computeMonthlyPayment(double ammount, int meses);
    
}
