package br.com.zup.exercicios.lista6;

import java.util.Scanner;

/**4 - Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia.
 * Um número primo é aquele que é divisível apenas por um e por ele mesmo.
 * Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
**/
 public class List6_Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int numero = sc.nextInt();

        if(numero == 2){
            System.out.println("O número " + numero + " é primo, pois só é divisível por um e ele mesmo.");
        }else if(numero % 1 == 0 & numero % numero == 0){
                if(numero % 3 ==0 | numero % 3 != 0) {
                  if(numero % 2 !=0){
                      System.out.println("Este número é primo.");
                  }else{
                      System.out.println("O número " + numero + " não é um número primo," +
                              " pois, ele é par. " +
                              "E os números primos são impares com a excessão do número 2.");
                  }
                    }
            }
        }


    }

