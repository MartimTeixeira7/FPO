/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp05.expenses;

/**
 *
 * @author Utilizador
 */
public class User {
    protected static int nextId = 1;
    protected final int EXPENSES_SIZE = 31;
    protected int id;
    protected String nome;
    protected String email;
    protected String birthDate;
    protected Expense[] expenses;

    public User(String tempNome, String tempEmail, String tempBirthDate) {
        expenses = new Expense[EXPENSES_SIZE];
        id = nextId++;
        nome = tempNome;
        email = tempEmail;
        birthDate = tempBirthDate;
    }
}