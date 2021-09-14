package br.com.zup.exercicios.lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**9 - Faça um Programa que leia uma lista de 10 números e mostre-os na ordem inversa.
 **/
public class List6_Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        int n;

        for(int contador=1; contador <= 10; contador++){
            System.out.println("Digite o " + contador + "° número: ");
            n = sc.nextInt();

            numeros.add(n);
        }

        for(int contadorContrario = 9; contadorContrario >= 0; contadorContrario--){
            System.out.printf("%3s", numeros.get(contadorContrario));
        }



    }
}
