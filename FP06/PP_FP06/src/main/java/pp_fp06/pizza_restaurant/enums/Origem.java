/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant.enums;

/**
 *
 * @author Utilizador
 */
public enum Origem {
    
    ANIMAL,
   
    VEGETAL,
 
    MINERAL;

    
    public static String origemParaString(Origem origem) {
        switch (origem) {
            case ANIMAL:
                return "O ingrediente é de origem animal.";
            case VEGETAL:
                return "O ingrediente é de origem vegetal.";
            default:
                return "O ingrediente é de origem mineral.";
        }
    }
}
