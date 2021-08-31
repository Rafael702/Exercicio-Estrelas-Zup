package br.com.zup.exercicios.lista7;

import java.util.Scanner;

/***3. Escreva um programa que leia 10 números e escreva o menor valor lido é o maior valor lido.**/
public class List7_Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int maiorNumero = 0;
        int menorNumero = 0;

        for(int contador = 1; contador <=10; contador++){

            System.out.println("Entre com o " +contador+ "° número: ");
            n = sc.nextInt();

            if(contador == 1){
                maiorNumero = n;
                menorNumero = n;
            }else{
                if(n >= maiorNumero){
                    maiorNumero = n;
                }else if(n <= menorNumero){
                    menorNumero = n;
                }
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);

    }
}
