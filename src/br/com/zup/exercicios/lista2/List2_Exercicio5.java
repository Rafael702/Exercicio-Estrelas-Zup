package br.com.zup.exercicios.lista2;

import java.util.Scanner;

/**5 - Faça um Programa que receba um número e exiba o dia correspondente da semana.
 * (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer a mensagem “valor inválido”.
 */
public class List2_Exercicio5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Segue abaixo, os dias da semana com os seus respectivos números:");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-Feira");
        System.out.println("3 - Terça-Feira");
        System.out.println("4 - Quarta-Feira");
        System.out.println("5 - Quinta-Feira");
        System.out.println("6 - Sexta-Feira");
        System.out.println("7 - Sábado");

        System.out.println("Digite um número de acordo com o respectivo dia da semana: ");
        int diaEscolhido= sc.nextInt();

        if(diaEscolhido == 1){
            System.out.println("Você escolheu Domingo!!!");
        }else if(diaEscolhido == 2){
            System.out.println("Você escolheu Segunda-Feira!!!🙀'Eu Odeio as Segundas' - Garfield ");
        }else if(diaEscolhido == 3){
            System.out.println("Você escolheu Terça-Feira!!Falta Muito para Sexta?");
        }else if(diaEscolhido == 4){
            System.out.println("Você escolheu Quarta-Feira!!! Metade da semana ainda!!!!");
        }else if(diaEscolhido == 5){
            System.out.println("Você escolheu Quinta-Feira!!! Aff Sexta não chega");
        }else if(diaEscolhido == 6){
            System.out.println("Você escolheu Sexta-Feira!!! 'Ainda bem que hoje Sexta-Feira Emm!!!😈'");
        }else if(diaEscolhido == 7){
            System.out.println("Você escolheu Sábado!!! Sábado de Aleluia!!!");
        }else{
            System.out.println("Entre com um número válido, de acordo com a lista dos dias da semana.");
        }


    }
}
