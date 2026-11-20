/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp04;
import java.util.Scanner;

/**
 *
 * @author Utilizador
 */
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza o valor: ");
        double valor = sc.nextDouble();

        System.out.print("Introduza a taxa de conversao: ");
        double taxa = sc.nextDouble();

        double resultado = valor * taxa;
        System.out.printf("%.2f%n", resultado);

        sc.close();
    }
} 

