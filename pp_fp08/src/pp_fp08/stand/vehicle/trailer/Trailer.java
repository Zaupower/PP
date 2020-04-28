/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pp_fp08.stand.vehicle.trailer;

/**
 *
 * @author marce
 */
public class Trailer {

    int axesNumber;
    double load;

    public Trailer(int axesNumber, double load) {
        this.axesNumber = axesNumber;
        this.load = load;
    }

    @Override
    public String toString() {
        return "Trailer{" +
                "axesNumber=" + axesNumber +
                ", load=" + load +
                '}';
    }
}
