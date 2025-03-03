package org.sesisenai;

import java.util.Random;

public class Exercicio9_M01S03 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        preencherMatriz(matriz);

        System.out.println("Matriz gerada:");
        imprimirMatriz(matriz);

        int maiorValor = encontrarMaiorValor(matriz);

        System.out.println("\nO maior valor na matriz é: " + maiorValor);
    }

    public static void preencherMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int encontrarMaiorValor(int[][] matriz) {
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }
}
