/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fp04;

/**
 *
 * @author Utilizador
 */
public class FP04 {
    public static void main(String[] args) {
        int N = 2; 
        int[][] A = {
            {1, 2},
            {3, 4}
            
        };

        int[][] B = new int[N][N]; 

       
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = A[j][i];
            }
        }

        
        System.out.println("Matriz original:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

     
        System.out.println("\nMatriz transposta:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
    }


    

