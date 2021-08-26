package br.com.zup.exercicios.lista2;

import java.util.Scanner;

/***3 - Faça um programa que receba duas notas parciais de um aluno.
 * O programa deve calcular a média alcançada por aluno e apresentar:
 A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 A mensagem "Reprovado", se a média for menor do que sete;
 A mensagem "Aprovado com Distinção", se a média for igual a dez.
***/
public class List2_Exercicio3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite a primeira nota do aluno: ");
        int nota1 = sc.nextInt();

        System.out.println("Por favor, digite a segunda nota do aluno: ");
        int nota2 = sc.nextInt();

        int media = (nota1 + nota2)/2;

        if(nota1 >= 0 & nota1 <= 10 & nota2 >= 0 & nota2 <= 10){
        if(media == 10){
            System.out.println("Aluno aprovado com distinção; Média: " + media);
        }else if(media >=7){
            System.out.println("Aluno aprovado com a média maior que 7; Média: " + media);
        }else{
            System.out.println("Aluno reprovado com a média menor que 7; Média: " + media);
        }
        }else{
            System.out.println("Valor incorreto. Por gentileza, entre com um valor válido de 0 à 10.");
        }
    }
}
