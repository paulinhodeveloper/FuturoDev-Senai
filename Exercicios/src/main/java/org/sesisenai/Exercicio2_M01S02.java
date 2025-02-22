package org.sesisenai;

import java.util.Scanner;

public class Exercicio2_M01S02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = lerInteiro(scanner, "Digite o valor de A: ");
        int B = lerInteiro(scanner, "Digite o valor de B: ");

        scanner.close();

        int soma = A + B;

        System.out.println("SOMA = " + soma);
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

