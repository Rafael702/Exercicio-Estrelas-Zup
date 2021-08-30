package br.com.zup.exercicios.lista4;

import java.util.Scanner;

/***3 - Faça um programa para ler 5 números e mostrar o resultado da soma desses números.
 ****/
public class List4_Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, total = 0, contador = 1;

        while (contador <= 5) {
            System.out.println("Entre com o " + contador + "° numero: ");
            n = sc.nextInt();

            total = total + n;

            contador++;

        }
        System.out.println(total);
    }
}
