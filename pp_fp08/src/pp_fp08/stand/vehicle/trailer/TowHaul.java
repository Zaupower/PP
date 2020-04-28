/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pp_fp08.stand.vehicle.trailer;

import pp_fp08.stand.vehicle.enums.TrailerType;

/**
 *
 * @author marce
 */
public class TowHaul extends Trailer{

    TrailerType trailerType;

    public TowHaul(int axesNumber, double load, TrailerType trailerType) {
        super(axesNumber, load);
        this.trailerType = trailerType;
    }

    @Override
    public String toString() {
        return "TowHaul{" +
                "trailerType=" + trailerType +
                ", axesNumber=" + axesNumber +
                ", load=" + load +
                "} " + super.toString();
    }
}
