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
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza o dividendo: ");
        int a = sc.nextInt();

        System.out.print("Introduza o divisor: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Erro: divisao por zero!");
            sc.close();
            return;
        }

        int quociente = 0;
        int resto = a;

        while (resto >= b) {
            resto = resto - b;
            quociente++;
        }

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);

        sc.close();
    }
}

