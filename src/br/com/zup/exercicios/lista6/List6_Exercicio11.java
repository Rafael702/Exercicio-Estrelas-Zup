package br.com.zup.exercicios.lista6;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**11 - Faça um Programa que leia 20 números e armazene-os numa lista.
 * Armazene os números pares na lista PAR e os números ÍMPARES na lista ímpar.
 * Imprima as três listas.
 **/
public class List6_Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();

        int n;
        int totalNumeros = 20;

        for(int contador = 1; contador <= totalNumeros; contador++){
            System.out.println("Entre com o " + contador + "° numero: ");
            n = sc.nextInt();

            numeros.add(n);

            if(n % 2 == 0){
                numerosPares.add(n);
            }else{
                numerosImpares.add(n);
            }
        }

        System.out.println("\nLista de Números: ");
        for (int imprimindoNumeros: numeros) {
            System.out.printf("%10s", imprimindoNumeros);
        }

        System.out.println("\nLista de Numeros Pares:");
        for (int imprimindoNumerosPares: numerosPares) {
            System.out.printf("%10s", imprimindoNumerosPares);
        }
        System.out.println("\nLista de Numeros Impares: ");
        for (int imprimindoNumerosImpares: numerosImpares){
            System.out.printf("%10s", imprimindoNumerosImpares);
        }
    }

}
