/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp04;

/**
 *
 * @author Utilizador
 */
public class ex2 {
    public static boolean testarPrimo(int valor) {
        if (valor <= 1) return false;
        for (int i = 2; i < valor; i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    public static boolean testarPerfeito(int valor) {
        if (valor <= 1) return false;
        int soma = 0;
        for (int i = 1; i < valor; i++) {
            if (valor % i == 0) {
                soma += i;
            }
        }
        return soma == valor;
    }

    public static void main(String[] args) {
        int[] vetor = {6, 7, 10, 28, 13, 15, 496, 17, 25, 1, 2};

        System.out.println("Numeros primos no vetor:");
        for (int num : vetor) {
            if (testarPrimo(num)) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n\nNumeros perfeitos no vetor:");
        for (int num : vetor) {
            if (testarPerfeito(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

