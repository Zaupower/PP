/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7ex1.BikeStore;

/**
 *
 * @author marce
 */
public class BikeManagment {
    private final int MAXBIKES = 20;
    private Bicycle[] bikelist = new Bicycle[MAXBIKES];
    private int count = 0;

    /**
     *
     * @param bike
     */
    public void addbike(Bicycle bike) {
        if (count < MAXBIKES) {
            bikelist[count] = bike;
            count += 1;
        } else {
            System.out.println("MAX Bikes");
        }
    } //ou pode percorrer o array e adicionar pra la
   
   
    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += "Bike " + (i + 1) + " : " + "\n" + bikelist[i].toString() + "\n";
        }
        return text;
    }
}
