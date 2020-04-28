/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pp_fp08.stand.vehicle;

import pp_fp08.stand.vehicle.Vehicle;
import pp_fp08.stand.vehicle.enums.Condition;
import pp_fp08.stand.vehicle.enums.Origem;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author marce
 */
public class Car extends Vehicle {

    int occupantsNumber;
    int doorsNumber;

    public Car(int id, int vin, String brand, String model, LocalDate manufacturingDate, Origem origin, int kms, Condition condition, double price, int occupantsNumber, int doorsNumber) {
        super(id, vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.occupantsNumber = occupantsNumber;
        this.doorsNumber = doorsNumber;
    }

    @Override
    public double getPrice() {
        if (getCondition() == Condition.USED){
            double newPrice =super.price;
            newPrice = newPrice - newPrice*0.3;
            super.setPrice(newPrice);
        }
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Car{" +
                "occupantsNumber=" + occupantsNumber +
                ", doorsNumber=" + doorsNumber +
                ", price=" + price +
                "} " + super.toString();
    }
}
