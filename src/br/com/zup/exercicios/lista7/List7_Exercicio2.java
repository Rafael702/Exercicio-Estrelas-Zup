package br.com.zup.exercicios.lista7;

import java.util.Scanner;

/**2. Faça um programa que leia números inteiros e imprima sua média.**/
public class List7_Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números que você deseja inserir: ");
        int qtdNumeros = sc.nextInt();

        int n;
        int totNumeros = 0;

        for(int contador = 1; contador <= qtdNumeros; contador++){
            System.out.println("Digite o " + contador + "° número: ");
            n = sc.nextInt();

            totNumeros = totNumeros + n;

        }

        double media = totNumeros/qtdNumeros;
        System.out.println("A média dos números inteiros inseridos é: " + media);

    }
}
