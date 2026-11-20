/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp04;

/**
 *
 * @author Utilizador
 */
public class ex3 {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 2, 8},
            {3, 5, 1},
            {9, 5, 4},
            {2, 7, 5}
        };

       
        int[] contagem = new int[100]; 
        int maisRepetido = 0;
        int maxRepeticoes = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                contagem[matriz[i][j]]++;
                if (contagem[matriz[i][j]] > maxRepeticoes) {
                    maxRepeticoes = contagem[matriz[i][j]];
                    maisRepetido = matriz[i][j];
                }
            }
        }

        System.out.println("Numero que mais se repete: " + maisRepetido + " (" + maxRepeticoes + " vezes)");

        System.out.println("Maior e menor de cada linha:");
        for (int i = 0; i < 4; i++) {
            int maior = matriz[i][0];
            int menor = matriz[i][0];
            for (int j = 1; j < 3; j++) {
                if (matriz[i][j] > maior) maior = matriz[i][j];
                if (matriz[i][j] < menor) menor = matriz[i][j];
            }
            System.out.println("Linha " + i + " Maior: " + maior + " Menor: " + menor);
        }
    }
}

