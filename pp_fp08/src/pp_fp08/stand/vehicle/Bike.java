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
public class Bike extends Vehicle {

    double cubicCapacity;
    double wheelSize;

    public Bike(int id, int vin, String brand, String model, LocalDate manufacteringDate, Origem origin, int kms, Condition condition, double price, double cubicCapacity, double wheelSize) {
        super(id, vin, brand, model, manufacteringDate, origin, kms, condition, price);
        this.cubicCapacity = cubicCapacity;
        this.wheelSize = wheelSize;
    }

    public double getCubicCapacity() {
        return cubicCapacity;
    }

    public double getWheelSize() {
        return wheelSize;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "cubicCapacity=" + cubicCapacity +
                ", wheelSize=" + wheelSize +
                "} " + super.toString();
    }
}
