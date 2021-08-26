package br.com.zup.exercicios.lista2;

import java.util.Scanner;

/***2 - Faça um programa que receba o preço de três produtos
 * e informe qual produto você deve comprar, sabendo que a decisão
 * é sempre pelo mais barato.

 ***/
public class List2_Exercicio2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o preço do produto 1: ");
        double produto1 = sc.nextDouble();
        System.out.println("Informe o preço do produto 2: ");
        double produto2 = sc.nextDouble();
        System.out.println("Informe o preço do produto 3: ");
        double produto3 = sc.nextDouble();

        if(produto1 < produto2 & produto1 < produto3){
            System.out.println("O produto mais barato é o produto 1, valor: R$" + produto1);
        }else if(produto1 > produto2 & produto2 < produto3){
            System.out.println("O produto mais barato é o produto 2, valor: R$" + produto2);
        }else if(produto1 > produto3 & produto2 > produto3 ){
            System.out.println("O produto mais barato é o produto 3, valor: R$" + produto3);
        }else{
            System.out.println("Os produtos estão com os mesmos valores. ");
        }

    }
}
