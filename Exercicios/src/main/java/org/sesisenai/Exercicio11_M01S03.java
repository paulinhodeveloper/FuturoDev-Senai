package org.sesisenai;

import java.util.ArrayList;

public class Exercicio11_M01S03 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Melancia");
        lista.add("Mamão");
        lista.add("Abacaxi");

        char caractere = 'M'; // Caractere para filtrar

        ArrayList<String> resultado = filtrarStringsPorCaractere(lista, caractere);

        System.out.println("Strings que começam com '" + caractere + "': " + resultado);
    }

    public static ArrayList<String> filtrarStringsPorCaractere(ArrayList<String> lista, char caractere) {
        ArrayList<String> resultado = new ArrayList<>();

        for (String str : lista) {

            if (!str.isEmpty() && str.charAt(0) == caractere) {
                resultado.add(str);
            }
        }

        return resultado;
    }
}
