package org.sesisenai;

import java.util.Scanner;

public class Exercicio3_M01S02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double area = PI * raio * raio;

        System.out.printf("A = %.1f%n", area);

        scanner.close();
    }
}

