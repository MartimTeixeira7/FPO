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
public class ex4 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza o valor em graus: ");
        double graus = sc.nextDouble();

        double radianos = graus * Math.PI / 180;

        System.out.println(graus + " graus = " + radianos + " radianos");

        sc.close();
    }
}


