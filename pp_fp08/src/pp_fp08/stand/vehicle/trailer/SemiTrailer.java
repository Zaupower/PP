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
public class SemiTrailer extends Trailer{

    int spareTyreNumber;

    public SemiTrailer(int axesNumber, double load, int spareTyreNumber) {
        super(axesNumber, load);
        this.spareTyreNumber = spareTyreNumber;
    }

    @Override
    public String toString() {
        return "SemiTrailer{" +
                "spareTyreNumber=" + spareTyreNumber +
                ", axesNumber=" + axesNumber +
                ", load=" + load +
                "} " + super.toString();
    }
}
