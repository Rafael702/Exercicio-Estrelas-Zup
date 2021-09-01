package br.com.zup.exercicios.lista7;

import java.util.Scanner;

/**
 * LEVEL UP.
 * Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário.
 * O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa deve somar
 * todos os números ímpares contidos neste intervalo. Caso o usuário digite um intervalo inválido
 * (começando por um valor maior que o valor final) deve ser escrito uma mensagem de erro na tela,
 * “Intervalo de valores inválido” e o programa termina.
 **/
public class List7_LevelUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de intervalo inicial: ");
        int valorIntervalorInicial = sc.nextInt();

        System.out.println("Informe o valor de intervalo final acima de " + valorIntervalorInicial + " :");
        int valorIntervalorFinal = sc.nextInt();

        double totalImpares = 0;

        if (valorIntervalorInicial < valorIntervalorFinal) {
            //O valorIntervalorInicial está sendo armazenado dentro da variavel i.
            // Coloquei o valorIntervalorInicial + 1, para não somar o numero incial.
            for (int i = valorIntervalorInicial + 1; i <= valorIntervalorFinal; i++) {

                if (i % 2 != 0) {
                    totalImpares += i;
                }

            }
            System.out.println(totalImpares);
        } else {
            System.out.println("Intervalo de valores inválido. " +
                    "Insira o valor do Intervalo incial com um valor menor que o valor do intervalo final.");
        }

       sc.close();


    }
}
