package br.com.zup.exercicios.lista6;

import java.util.Scanner;

/**5 - Faça um programa que leia 5 números e informe o maior número.
 **/
public class List6_Exercicio5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n;
        int maiorNumero = 0;

        for(int contador = 1; contador <= 5 ; contador++){
            System.out.println("Entre com o " + contador + "° número: ");
            n = sc.nextInt();

            if(contador == 1){
                maiorNumero = n;
            }else{
                if(n >= maiorNumero){
                    maiorNumero = n;
                }
            }

        }

        System.out.println("O maior número é: " + maiorNumero);

    }
}
