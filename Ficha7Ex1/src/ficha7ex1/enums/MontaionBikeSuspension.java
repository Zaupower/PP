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
public enum MontaionBikeSuspension {
    SIMPLES,
    DUPLA,
    SEM;
    
    public static String MontainBikeSuspensionToString(MontaionBikeSuspension tipo){
        
        switch(tipo){
            case SIMPLES:
                return "Suspensao simples";
            case DUPLA:
                return "Suspensao dupla";
            default:
                return "sem suspensao";
        }
    }
}
