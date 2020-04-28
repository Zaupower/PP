/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7ex1.enums;

/**
 *
 * @author marce
 */
public enum BrakeType {
    /**
     * pnças
     */
    P,
    H;
    
    public static String BrakeType(BrakeType tipo){
        switch(tipo){
            case P:
                return "Travao de pinças";
            case H:
                return "Travao Hidraulico";
            default:
                return "Travoes Invalidos";
                        
        }
    }
}
