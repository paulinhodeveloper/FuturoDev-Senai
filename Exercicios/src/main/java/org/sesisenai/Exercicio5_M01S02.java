package org.sesisenai;

import java.util.Scanner;

public class Exercicio5_M01S02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = lerDouble(scanner, "Digite a primeira nota (A): ");

        double B = lerDouble(scanner, "Digite a segunda nota (B): ");

        scanner.close();

        final double PESO_A = 3.5;
        final double PESO_B = 7.5;

        double media = (A * PESO_A + B * PESO_B) / (PESO_A + PESO_B);

        System.out.printf("MEDIA = %.2f%n", media);
    }

    private static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Erro: Por favor, digite um número válido.");
                scanner.next();
            }
        }
    }
}

