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
public enum Material {
    CARBONO,
    ALUMINIO,
    SEM;
    
    public static String MaterialToString(Material tipo){
        
        switch(tipo){
            case CARBONO:
                return "Bicicleta feita de carbono";
            case ALUMINIO:
                return "Bicicleta feita de aluminio";
            default:
                return "Material invalido";
        }
    }
}
