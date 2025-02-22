package org.sesisenai;

import java.util.Scanner;

public class Exercicio4_M01S02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = lerInteiro(scanner, "Digite o primeiro valor inteiro: ");

        int B = lerInteiro(scanner, "Digite o segundo valor inteiro: ");

        scanner.close();

        int produto = A * B;

        System.out.println("PRODUTO = " + produto);
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Erro: Por favor, digite um número inteiro válido.");
                scanner.next();
            }
        }
    }
}

