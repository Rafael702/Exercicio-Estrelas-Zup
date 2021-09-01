package br.com.zup.exemplos.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**8 - Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.**/
public class Aula7_Exemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> numeros = new ArrayList<>();
        int contador = 1;
        int totalDeNumeros = 5;
        double valorDigitadoPeloUsuario = 0;

        while (contador <= totalDeNumeros){
            System.out.println("Por favor, digite o " + contador + "° numero: ");
            valorDigitadoPeloUsuario = sc.nextDouble();
            if(valorDigitadoPeloUsuario >= 0) {
                numeros.add(valorDigitadoPeloUsuario);
                contador++;
            }else{
                System.out.println("Valor inválido.");

        }

//        for (Double referencia: numeros) {
//            System.out.println(referencia);
//            }
//
//
       }


    }
}
