package br.com.zup.exercicios.lista7;
/**
 1 - Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes.
 A primeira vez com "for" e a segunda com "while".
 **/
public class List7_Exercicio1 {
    public static void main(String[] args) {

        int n = 1;

        System.out.println("Com o while: ");
        while(n <= 100){
            System.out.println(n);
            n++;
        }

        System.out.println("Com o for: ");
        for(n = 1; n <= 100; n++){
            System.out.println(n);
        }
    }
}
