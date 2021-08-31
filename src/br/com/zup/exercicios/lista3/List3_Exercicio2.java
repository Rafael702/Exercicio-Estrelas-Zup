package br.com.zup.exercicios.lista3;

import java.util.Scanner;

/**2 - Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 Álcool:
 até 20 litros, desconto de 3% por litro
 acima de 20 litros, desconto de 5% por litro
 Gasolina:
 até 20 litros, desconto de 4% por litro
 acima de 20 litros, desconto de 6% por litro
 Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
 (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
 sabendo-se que o preço do litro da gasolina é R$ 2,50 e o preço do litro do álcool é R$ 1,90.
 ***/
public class List3_Exercicio2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        String combustivel;
        double valorGasolina = 2.50;
        double valorAlcool = 1.90;
        double qtdCombustivel;
        double valorPagar;
        double valorComDesconto;
        double valorTotal = 0;


        System.out.println("Informe o tipo de combustivel que você deseja, sendo A para álcool e G para Gasolina:  ");
        combustivel = sc.next();


        if(combustivel.equals("A")){
            System.out.println("Informe os litros de Alcool desejado: ");
            qtdCombustivel = sc.nextDouble();
            if(qtdCombustivel <= 20){
                valorPagar = valorAlcool * qtdCombustivel;
                valorComDesconto = valorPagar * 0.03;
                valorTotal = valorPagar - valorComDesconto;
            }else if(qtdCombustivel >= 20){
                valorPagar = valorAlcool * qtdCombustivel;
                valorComDesconto = valorPagar * 0.05;
                valorTotal = valorPagar - valorComDesconto;
            }
        }else if(combustivel.equals("G")) {
            System.out.println("Informe os litros de Gasolina desejado: ");
            qtdCombustivel = sc.nextDouble();
            if(qtdCombustivel <= 20){
                valorPagar = valorGasolina * qtdCombustivel;
                valorComDesconto = valorPagar * 0.04;
                valorTotal = valorPagar - valorComDesconto;
            }else if(qtdCombustivel >= 20){
                valorPagar = valorGasolina * qtdCombustivel;
                valorComDesconto = valorPagar * 0.6;
                valorTotal = valorPagar - valorComDesconto;
            }
        }

        System.out.println(valorTotal);

        }
    }

