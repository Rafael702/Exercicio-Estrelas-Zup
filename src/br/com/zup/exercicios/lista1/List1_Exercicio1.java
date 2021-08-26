package br.com.zup.exercicios.lista1;
//1 - Faça um programa que mostre a mensagem "Alô mundo" na tela.

import java.util.Scanner;

public class List1_Exercicio1 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String mensagem;

        System.out.println("Digite uma mensagem para o Java: ");


        System.out.println(mensagem = sc.nextLine());

    }
}
