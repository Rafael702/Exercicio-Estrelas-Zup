package br.com.zup.exercicios.lista6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**2 - Faça um Programa que leia um número e exiba o dia correspondente da semana.
 * (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 **/
public class List6_Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, String>diaDaSemana = new HashMap<>();

        diaDaSemana.put(1,"Domingo");
        diaDaSemana.put(2,"Segunda");
        diaDaSemana.put(3,"Terça");
        diaDaSemana.put(4,"Quarta");
        diaDaSemana.put(5,"Quinta");
        diaDaSemana.put(6,"Sexta");
        diaDaSemana.put(7,"Sábado");

        System.out.println("Segue abaixo os dias da semana: ");
        for (int semana: diaDaSemana.keySet()) {
            System.out.printf("%17s", semana + "-" + diaDaSemana.get(semana));
        }

        System.out.println("\nEscolha um dia da semana: ");
        int diaEscolhido = sc.nextInt();

        if(diaEscolhido >= 1 & diaEscolhido <=7) {
            System.out.println("O dia escolhido da semana foi : " + "\n" + diaEscolhido + " - "
                    + diaDaSemana.get(diaEscolhido));
        }else{
            System.out.println("Valor inválido");
        }

        sc.close();



    }
}
