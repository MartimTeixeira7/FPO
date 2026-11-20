/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp05;

/**
 *
 * @author Utilizador
 */
public class Expenses {
    private static final int NUMBER_OF_DAYS = 31; // Para o mês de março

    protected static int number1; // Para despesas com o automóvel
    protected static double[] carValues = new double[NUMBER_OF_DAYS]; // Em euros
    protected static char[] descriptionCar = new char[] { 'C', 'A', 'R' };

    protected static int number2; // Para despesas alimentares
    protected static double[] foodValues = new double[NUMBER_OF_DAYS]; // Em euros
    protected static char[] descriptionFood = new char[] { 'F', 'O', 'O', 'D' };
}