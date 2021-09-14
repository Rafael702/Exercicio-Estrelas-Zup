package br.com.zup.exercicios.lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**12 - Faça um Programa que leia uma lista de 5 números inteiros,
 * mostre a soma,
 * a multiplicação e os números.**/
public class List6_Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int n;
        int totalNumeros = 5;
        int soma = 0;
        int multiplicacao = 0;

        for(int contador = 1; contador <= totalNumeros; contador++){
            System.out.println("Entre com o " + contador + "° número: ");
            n = sc.nextInt();

            numeros.add(n);

            soma += n;

            if(contador == 1){
                multiplicacao = n;
            }else{
                multiplicacao *= n;
            }

        }

        System.out.println("A lista contêm os seguintes numeros: " + numeros);

        System.out.println("A soma total dos números inseridos foi: " + soma);
        System.out.println("A multiplicação dos números, teve o total de: " + multiplicacao);
    }
}
