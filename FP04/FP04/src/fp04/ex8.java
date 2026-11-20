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
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza o valor em euros: ");
        double valor = sc.nextDouble();

        int centimos = (int) Math.round(valor * 100);

        int[] moedas = {200, 100, 50, 20, 10, 5, 2, 1};
        String[] nomes = {
            "2 euros", "1 euro", "50 centimos", "20 centimos",
            "10 centimos", "5 centimos", "2 cêntimos", "1 centimo"
        };

        for (int i = 0; i < moedas.length; i++) {
            int quantidade = centimos / moedas[i];
            if (quantidade > 0) {
                System.out.println(quantidade + " moeda" + (quantidade > 1 ? "s" : "") + " de " + nomes[i]);
                centimos = centimos % moedas[i];
            }
        }

        sc.close();
    }
}  

