package br.com.zup.exercicios.lista4;

import java.util.Scanner;

/**1 - Faça um programa que mostra na tela os números de 1 a 100.
 **/
public class List4_Exercicio1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int n = 1;


        while (n<=100){
            System.out.println(n);
            n++;
        }

    }
}
