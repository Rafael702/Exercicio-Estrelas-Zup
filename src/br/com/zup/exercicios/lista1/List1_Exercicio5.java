package br.com.zup.exercicios.lista1;
/*5 - Faça um programa que peça a temperatura em graus Fahrenheit, transforme e
*mostre a temperatura em graus Celsius.
*/

public class List1_Exercicio5 {
    public static void main(String [] args){
    //Valor de Fahrenheit | Fórmula de conversão de Fahrenheit para Celsisu.
        int F = 50;
        float C = (F - 32) / 1.8F;

        System.out.printf("O seu grau em Celsius é: " + C);

    }
}
