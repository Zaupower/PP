/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7ex1.BikeStore;

import ficha7ex1.enums.BikeTools;
import ficha7ex1.enums.Material;
import ficha7ex1.enums.MontaionBikeSuspension;

/**
 *
 * @author marce
 */
public class MontainBike extends Bicycle{
  
    private final int MAXTOOLS = 10;
    private int counttools  = 0;
    
    /**
     * numero de luzes
     */
    private int numberOfLights;
    
    /**
     * suspensao tipo
     */
    private MontaionBikeSuspension suspension;
    
    /**
     * utensilios que vem com a bike
     */
    private BikeTools[] bikeTools;

    public MontainBike(int numberOfLights, MontaionBikeSuspension suspension, BikeTools[] bikeTools, int ID, int numberOfGears, String mainColor, double wheelSize, String brakes, Material material, double price, int guarantee) {
        super(ID, numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
        this.bikeTools = bikeTools;
    }

    
    
    /**
     * @param ID
     * @param numberOfGears
     * @param mainColor
     * @param wheelSize
     * @param brakes
     * @param material
     * @param price
     * @param guarantee 
     */
   
     public void addtool(BikeTools tool) {
        int i = 0;
        /// counter 
        // biketools[counter]
        // counter++
        for (; i < MAXTOOLS; i++) {
            if (bikeTools[i] == null) {
                bikeTools[i] = tool;
                counttools++;
                break;
            }
        }
    }

    /**
     * metodo de editar tools, vaia aposiçao da tool antiga e da replace por uma
     * nova a escolha
     * @param tool
     * @param newtool
     */
    public void edittool(BikeTools tool, BikeTools newtool) {
        int i = 0;

        for (; i < MAXTOOLS; i++) {
            if (bikeTools[i] == tool) {
                bikeTools[i] = newtool;
                break;
            }
        }

    }

    /**
     * Metodo de remover tools
     * verifica se ha tools iguais a inserida no metodo, se houver ignora, se nao
     * houver, guarda pro array novo as diferentes
     * @param tool
     */
    public void removetool(BikeTools tool) {
        // 4-3 counter --
        int i = 0;
        BikeTools[] newtools = new BikeTools[bikeTools.length];

        for (int k = 0; i < MAXTOOLS; i++) {

            if (bikeTools[i] == tool) {
                counttools--;
                continue;
            }

            newtools[k++] = bikeTools[i];
        }
        bikeTools = newtools;
    }

    /**
     * printar tools
     * @return
     */
    public String printtools() {

        String tools = "";
        for (int i = 0; i < counttools; i++) {
            tools += bikeTools[i] + "\n";
        }

        return tools;
    }
    
    /**
     * printar bike
     */
    public void printBike(){
        System.out.println("-----------------//////---------");
        System.out.print("ID : ");
        System.out.println(super.getID());
        System.out.print("Number of Gears: ");
        System.out.println(super.getNumberOfGears());
        System.out.print("Cor : ");
        System.out.println(super.getMainColor());
        System.out.print("Weel Size : ");
        System.out.println(super.getWheelSize());
        System.out.print("Brakes : ");
        System.out.println(super.getBrakes());
        System.out.print("Material : ");
        System.out.println(super.getMaterial());
        System.out.print("Price : ");
        System.out.println(super.getPrice());
        System.out.print("Guarantee : ");
        System.out.println(super.getGuarantee());
        System.out.print("Number of lights : ");
        System.out.println(numberOfLights);
        System.out.print("Suspension : ");
        System.out.println(suspension);
        System.out.println("-------------Tools : ");
        System.out.println(printtools());
        
    }

}
