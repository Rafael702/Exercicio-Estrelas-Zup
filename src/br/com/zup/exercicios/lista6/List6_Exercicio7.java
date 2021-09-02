package br.com.zup.exercicios.lista6;

import java.util.Scanner;

/**7 - Faça um programa que receba dois números inteiros
 * e gere os números inteiros que estão no intervalo compreendido por eles.
 **/
public class List6_Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int primeiroNumero = sc.nextInt();

        System.out.println("Informe o segundo número, acima de " + primeiroNumero);
        int segundoNumero = sc.nextInt();

        if(primeiroNumero < segundoNumero) {
            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                System.out.printf("%3s", i);
            }
        }else{
            System.out.println("O valor do segundo número é menor do que o primeiro número.");
        }
    }
}
