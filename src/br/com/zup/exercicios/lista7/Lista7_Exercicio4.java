package br.com.zup.exercicios.lista7;

import java.util.Scanner;

/**4. Faça um programa que leia n números inteiros positivos e calcule a soma desses números.**/
public class Lista7_Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números que você deseja inserir: ");
        int qtdNumeros = sc.nextInt();

        int n;
        int somaDosNumeros = 0;

        for(int contador = 1; contador <= qtdNumeros; contador++){
            System.out.println("Entre com o " + contador + "° número inteiro positivo: ");
            n = sc.nextInt();

            somaDosNumeros += n;
        }

        System.out.println("A soma de todos os números é: " + somaDosNumeros);

    }
}
