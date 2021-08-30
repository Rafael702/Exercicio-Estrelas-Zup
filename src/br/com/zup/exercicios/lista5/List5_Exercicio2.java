package br.com.zup.exercicios.lista5;

import java.util.Scanner;

/**2 - Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e mostrar a
 quantidade de números ímpares desses números.
 **/
public class List5_Exercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        int qtdNumeros;

        System.out.println("Informe a quantidade de números que você deseja inserir: ");
        qtdNumeros = sc.nextInt();

        int contador = 1;
        int qtdNumerosImpares = 0;
        int n;

        while (contador <= qtdNumeros){
            System.out.println("Entre com o " + contador + "° número:");
            n = sc.nextInt();

            if(n % 2 !=0){
                qtdNumerosImpares += 1;
            }
            contador++;
        }

        System.out.println("A quantidade de números impares é: " + qtdNumerosImpares);

    }
}
