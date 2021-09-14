package br.com.zup.exercicios.lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**8 - Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.**/
public class List6_Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        int n;
        int totalNumeros = 5;

        for(int contador = 1; contador <= totalNumeros; contador++){
            System.out.println("Digite o " + contador + "° numero: ");
            n = sc.nextInt();

            if(n >= 0){
                numeros.add(n);
            }

        }
        System.out.println("Lista de numeros: ");
        for (Integer referencia: numeros) {
            System.out.printf("%5s",referencia);
        }

    }
}
