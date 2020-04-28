package pp_fp08.stand.vehicle;

import java.util.Arrays;

public class VehicleManagement {
    final int MAX = 10;

    private Vehicle obj[] = new Vehicle[MAX];

    int counter = 0;

    public void addVehicle(Vehicle vehicle){
        if(counter<1){

            obj[counter] = vehicle;
            ++counter;
            System.out.println("quem entrou aqui " + counter);

        }else if (counter > 0){

            System.out.println(counter);
            for (int i =0; i<counter;i++){

                System.out.println(counter+" entrou no else");
                if (obj[i].getVin() == vehicle.getVin()){
                    System.out.println(obj[i].toString());
                    System.out.println(vehicle.toString());
                    System.out.println("ERRO " + i);
                }else {
                    obj[counter] = vehicle;

                    ++counter;
                }
            }

        }

    }
    public void showVehicle(){
        System.out.println("Objectos dentro do array");
        System.out.println(counter);

        for (int i= 0; i< counter; i++){
            System.out.println(obj[i].toString());

        }
    }
}
