package org.sesisenai;

public class Exercicio7_M01S03 {

    public static void main(String[] args) {

        int[] vetor = {10, 20, 30, 40, 50};

        int soma = 0;

        for (int j : vetor) {
            soma += j;
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
