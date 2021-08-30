package br.com.zup.exercicios.lista5;

import java.util.Scanner;

/**1 - Faça um programa para ler uma quantidade de números (N) digitada pelo usuário
 * e mostrar a quantidade de números pares desses números.
 */
public class List5_Exercicio1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int qtdNumeros;

        System.out.println("Informe a quantidade de números que você deseja entrar: ");
        qtdNumeros = sc.nextInt();

        int contador = 1;
        int qtdNumerosPares = 0;
        int n;


        while(contador <= qtdNumeros){
            System.out.println("Digite o " + contador + "° número: ");
            n = sc.nextInt();

            if(n % 2 == 0){
                qtdNumerosPares = qtdNumerosPares + 1;
            }
            contador++;
        }

        System.out.println("A quantidade de números pares inseridos é: " + qtdNumerosPares);


    }
}
