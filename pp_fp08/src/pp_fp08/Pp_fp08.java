/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pp_fp08;

import pp_fp08.stand.vehicle.*;
import pp_fp08.stand.vehicle.enums.Condition;
import pp_fp08.stand.vehicle.enums.Origem;
import pp_fp08.stand.vehicle.enums.TruckType;
import pp_fp08.stand.vehicle.trailer.Trailer;

import java.text.ParseException;
import java.time.LocalDate;

/**
 *
 * @author marce
 */
public class Pp_fp08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        Trailer trailer = new Trailer(2, 1500);
        LocalDate ld = LocalDate.parse( "2016-09-20" ) ;

        Vehicle vehicle1 = new Vehicle(1,2," Mercedes","Vito", ld, Origem.NATIONAL,1,Condition.NEW,2000);
        Car car = new Car(1,0,"BMW","M3", ld,Origem.NATIONAL, 1, Condition.USED, 10000, 5,5);
        Bike bike = new Bike(2,19,"BMW","M3", ld,Origem.NATIONAL, 1, Condition.NEW, 5000, 5.0,5);
        Truck truck = new Truck(1,2,"BMW","M3", ld,Origem.NATIONAL, 1, Condition.NEW, 5000, 5.0,5, TruckType.Truck, trailer);

        //Management
        VehicleManagement vehicleManagement = new VehicleManagement();
        vehicleManagement.addVehicle(car);
        vehicleManagement.addVehicle(bike);
        vehicleManagement.addVehicle(truck);


        //System.out.println(vehicle1.toString());
        //System.out.println(car.toString());
        //System.out.println(bike.toString());
        //System.out.println(truck.toString());
        vehicleManagement.showVehicle();
    }


}
