/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pp_fp08.stand.vehicle;

import pp_fp08.stand.vehicle.Vehicle;
import pp_fp08.stand.vehicle.enums.Condition;
import pp_fp08.stand.vehicle.enums.Origem;
import pp_fp08.stand.vehicle.enums.TruckType;
import pp_fp08.stand.vehicle.trailer.Trailer;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author marce
 */
public class Truck extends Vehicle{

    double lenght;
    double load;
    TruckType truckType;
    Trailer trailer;

    public Truck(int id, int vin, String brand, String model, LocalDate manufacteringDate, Origem origin, int kms, Condition condition, double price, double lenght, double load, TruckType truckType, Trailer trailer) {
        super(id, vin, brand, model, manufacteringDate, origin, kms, condition, price);
        this.lenght = lenght;
        this.load = load;
        this.truckType = truckType;
        this.trailer = trailer;
    }

    public double getLenght() {
        return lenght;
    }

    public double getLoad() {
        return load;
    }

    public TruckType getTruckType() {
        return truckType;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "lenght=" + lenght +
                ", load=" + load +
                ", truckType=" + truckType +
                ", trailer=" + trailer +
                "} " + super.toString();
    }
}
