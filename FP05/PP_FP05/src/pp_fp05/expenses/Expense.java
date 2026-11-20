/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp05.expenses;

/**
 *
 * @author Utilizador
 */
public class Expense {
    protected static int nextId = 1;
    protected int id;
    protected String type;
    protected float amount;
    protected String date;

    public Expense(String tempType, float tempAmount, String tempDate) {
        id = nextId++;
        type = tempType;
        date = tempDate;
        amount = tempAmount;
    }
}
