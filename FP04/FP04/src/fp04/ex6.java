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
public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza o valor em centimos: ");
        int centimos = sc.nextInt();

        int euros = centimos / 100;
        int resto = centimos % 100;

        System.out.println(euros + " euros e " + resto + " centimos");

        sc.close();
    }
}    

