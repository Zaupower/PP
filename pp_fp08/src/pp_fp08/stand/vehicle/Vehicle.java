/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pp_fp08.stand.vehicle;

import java.time.LocalDate;

import pp_fp08.stand.vehicle.enums.Condition;
import pp_fp08.stand.vehicle.enums.Origem;

/**
 *
 * @author marce
 */
public class Vehicle {

private int id;
private int vin;
private String brand;
private String model;
private LocalDate manufacturingDate;
private Origem origin;
private int kms;
private Condition condition;
protected double price;

    public Vehicle(int id, int vin, String brand, String model, LocalDate manufacturingDate, Origem origin, int kms, Condition condition, double price) {
        this.id = id;
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
        this.origin = origin;
        this.kms = kms;
        this.condition = condition;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", vin=" + vin +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufacteringDate=" + manufacturingDate +
                ", origin=" + origin +
                ", kms=" + kms +
                ", condition=" + condition +
                ", price=" + getPrice() +
                '}';
    }
}
