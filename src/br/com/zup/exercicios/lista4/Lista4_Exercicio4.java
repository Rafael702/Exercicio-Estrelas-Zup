package br.com.zup.exercicios.lista4;
/***4 - Escreva, usando while, um programa para calcular a média de N números.
 * O valor de N é dado pelo usuário.
 **/
import java.util.Scanner;

public class Lista4_Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int qtdNumeros, contador = 1;

        System.out.println("Informe a quantidade de números que você deseja somar: ");
        qtdNumeros = sc.nextInt();

        int n;
        int totalN = 0;

        while (contador <= qtdNumeros){
            System.out.println("Entre com o " + contador + "° numero: ");
            n = sc.nextInt();

            totalN = totalN + n;

            contador++;

        }

        double media = totalN/qtdNumeros;

        System.out.println("A média dos números inseridos é: " + media);

    }
}
