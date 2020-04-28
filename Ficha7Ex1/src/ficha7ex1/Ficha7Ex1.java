/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7ex1;

import ficha7ex1.BikeStore.BikeManagment;
import ficha7ex1.BikeStore.MontainBike;
import ficha7ex1.BikeStore.RoadBike;
import ficha7ex1.enums.BikeTools;
import ficha7ex1.enums.BrakeType;
import ficha7ex1.enums.Material;
import ficha7ex1.enums.MontaionBikeSuspension;

/**
 *
 * @author marce
 */
public class Ficha7Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        MontaionBikeSuspension mm = MontaionBikeSuspension.DUPLA;
        //System.out.println(MountainBikeSuspension.MountainBikeSuspensionToString(mm));
        
        MontainBike b = new MontainBike(0, mm, 0, 0, "P", 0, BrakeType.P, Material.CARBONO, 0, 0);
        
        b.addtool(BikeTools.GPS);
        b.addtool(BikeTools.BOMBA_PRESSAO);
        b.addtool(BikeTools.CONTA_KIL);
        
        System.out.println(b.printtools());
        
        b.removetool(BikeTools.GPS);
        
        System.out.println(" ");
        System.out.println(b.printtools());
        
        System.out.println(" ");
        
        
        
        RoadBike b2 = new RoadBike(2, 0, "Blue", 0, BrakeType.P, Material.CARBONO, 0, 0, "Fitacola", 0);
        b2.addobs("Bicicleta tem de ter rodas");
        b2.addobs("Bicicleta tem de andar");
        System.out.println(b2.printobs());
        
        //b2.editmaterial(Material.CARBONO, Material.ALUMINIO);
        //b2.printmat();
        BikeManagment list = new BikeManagment();
        list.addbike(b);
        list.addbike(b2);
        
        System.out.println(list.toString());
        //System.out.println(b.printBike());
        
        //list.printbikelist();
        
    }
    
}
