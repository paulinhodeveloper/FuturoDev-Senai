package org.sesisenai;

import java.util.Scanner;

public class Exercicio6_M01S02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        int horasTrabalhadas = lerInteiro(scanner);

        double valorPorHora = lerDouble(scanner);

        scanner.close();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("O funcionário %s trabalhou %d horas, e portanto possui R$ %.2f a receber.%n",
                nome, horasTrabalhadas, salario);
    }

    private static int lerInteiro(Scanner scanner) {
        while (true) {
            System.out.print("Digite o número de horas trabalhadas: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Erro: Por favor, digite um número inteiro válido.");
                scanner.next();
            }
        }
    }

    private static double lerDouble(Scanner scanner) {
        while (true) {
            System.out.print("Digite o valor recebido por hora: ");
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Erro: Por favor, digite um número válido.");
                scanner.next();
            }
        }
    }
}

