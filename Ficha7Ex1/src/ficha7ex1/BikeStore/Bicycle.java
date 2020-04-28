/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7ex1.BikeStore;

import ficha7ex1.enums.Material;

/**
 *
 * @author marce
 */
public class Bicycle {
   private int ID ;
   private int numberOfGears;
   private String mainColor;
   private double wheelSize;
   private String brakes;
   Material material;
   private double price;
   private int guarantee;

    public Bicycle(int ID, int numberOfGears, String mainColor, double wheelSize, String brakes, Material material, double price, int guarantee) {
        this.ID = ID;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.guarantee = guarantee;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public double getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(double wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getBrakes() {
        return brakes;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

   
}