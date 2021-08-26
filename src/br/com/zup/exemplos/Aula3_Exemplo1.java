package br.com.zup.exemplos;

import java.util.Scanner;

public class Aula3_Exemplo1 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Por favor, digite o numero 1: ");
        double numero1 = sc.nextDouble();
        System.out.println("Por favor, digite o numero 1: ");
        double numero2 = sc.nextDouble();

        if(numero1 < numero2){
            System.out.println("O numero 2 é o maior");
        }else{
            System.out.println("O numero 1 é o maior");
        }
    }

}
