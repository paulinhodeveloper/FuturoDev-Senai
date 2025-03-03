package org.sesisenai;

public class Exercicio10_M01S03 {

    public static void main(String[] args) {

        double[] numeros = {10.5, 20.3, 30.7, 40.2, 50.1};

        double media = calculaMedia(numeros);

        System.out.println("A média dos valores é: " + media);
    }


    public static double calculaMedia(double[] vetor) {
        double soma = 0.0;

        for (double valor : vetor) {
            soma += valor;
        }

        return soma / vetor.length;
    }
}
