package org.sesisenai;

public class Exercicio8_M01S03 {

    public static void main(String[] args) {

        char[] vetor = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        inverterVetor(vetor);

        System.out.println("\nVetor invertido:");
        imprimirVetor(vetor);
    }

    public static void inverterVetor(char[] vetor) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {

            char temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
        }
    }

    public static void imprimirVetor(char[] vetor) {
        for (char c : vetor) {
            System.out.print(c + " ");
        }
    }
}
