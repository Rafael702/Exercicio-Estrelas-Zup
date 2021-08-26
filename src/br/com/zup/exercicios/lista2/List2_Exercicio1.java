package br.com.zup.exercicios.lista2;

import java.util.Scanner;

/**
 *1 - Faça um programa que receba dois números e imprima o maior deles.
 *
 */

public class List2_Exercicio1 {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Insira o número 1: ");
        double numero1 = sc.nextDouble();

        System.out.println("Insira o número 2: ");
        double numero2 = sc.nextDouble();

        if(numero1 > numero2){
            System.out.println("O número " + numero1 +  " é o maior número.");
        }else if(numero1 < numero2){
            System.out.println("O numero " + numero2 + " é o maior número.");
        }else{
            System.out.println("Os números são iguais: " + "numero 1: " + numero1 + " ,numero 2: " + numero2);
        }



    }
}
