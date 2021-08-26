package br.com.zup.exercicios.lista1;
//2 - Faça um programa que receba 4 notas bimestrais e mostre a média aritmética

import java.util.Scanner;

public class List1_Exercicio2 {

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;

        System.out.println("Digite a nota 1: ");
        nota1 = sc.nextInt();
        System.out.println("Digite a nota 2: ");
        nota2 = sc.nextInt();
        System.out.println("Digite a nota 3: ");
        nota3 = sc.nextInt();
        System.out.println("Digite a nota 4: ");
        nota4 = sc.nextInt();


        float mediaArit = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.printf("A sua média aritmética é: " + mediaArit);




    }
}
