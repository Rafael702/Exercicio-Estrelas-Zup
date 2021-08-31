package br.com.zup.exercicios.lista5;

import java.util.Scanner;

/**Faça um programa que receba um conjunto de N números (Digitado pelo usuário) e mostre:
 O menor valor
 O maior valor
 A soma dos valores.
 **/
public class List5_Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números que você deseja inserir: ");
        int qtdNumeros = sc.nextInt();

        int n;
        int contador = 1;


        int menorNumero = 0;
        int maiorNumero = 0;
        int somaDosNumeros = 0;

        while(contador <= qtdNumeros){

            System.out.println("Entre com o " + contador + "° número: ");
            n = sc.nextInt();

            if(contador == 1){
            maiorNumero = n;
            menorNumero = n;
            }else{
                if(n <= menorNumero){
                    menorNumero = n;
                }else if(n >= maiorNumero){
                    maiorNumero = n;
                }
            }

            somaDosNumeros = somaDosNumeros + n;

            contador++;
        }

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);
        System.out.println("Soma de todos os números: " + somaDosNumeros    );

    }
}
