package br.com.zup.exemplos;

import java.util.Scanner;

public class Aula5_Exemplo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int qtdNumerosPares = 0;
        int contador = 1;

        System.out.println("Digite a quantidade de números que você quer digitar: ");
        double qtdNumeros = sc.nextDouble();

        while (contador <= qtdNumeros){

            System.out.println("Digite o número " + contador + "° :");
            double valorDigitadoPeloUsuario = sc.nextDouble();

            if(valorDigitadoPeloUsuario % 2 == 0){
                qtdNumerosPares = qtdNumerosPares + 1;
            }

            contador++;
        }

        System.out.println("A quantidade de números pares é: " + qtdNumerosPares);
    }
}
