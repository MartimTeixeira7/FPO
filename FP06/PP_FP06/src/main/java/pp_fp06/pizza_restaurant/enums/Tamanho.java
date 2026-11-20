/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant.enums;

/**
 *
 * @author Utilizador
 */
public enum Tamanho {
    
    PEQUENA,
   
    MEDIA,
    
    FAMILIAR;

    
    public static String tamanhoParaString(Tamanho tamanho) {
        switch (tamanho) {
            case PEQUENA:
                return "A pizza é pequena.";
            case FAMILIAR:
                return "A pizza é familiar.";
            default:
                return "A pizza é média.";
        }
    }
}