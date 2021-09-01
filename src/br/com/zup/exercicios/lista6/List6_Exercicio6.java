package br.com.zup.exercicios.lista6;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**6 - Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
 **/
public class List6_Exercicio6 {
    public static void main(String[] args) {

        List<Integer> numero = new ArrayList<>();

        for(int n = 1; n <= 50; n ++){
            if(n % 2 != 0 ){
               numero.add(n);
            }
        }
        System.out.println("Números ímpares: \n" + numero);
    }
}
