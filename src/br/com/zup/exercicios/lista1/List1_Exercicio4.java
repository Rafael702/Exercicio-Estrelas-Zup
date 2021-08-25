package br.com.zup.exercicios.lista1;
//4 - Faça um Programa que recebe o quanto você ganha por hora e o número de
//horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

public class List1_Exercicio4 {
    public static void main(String[] args){
        //Armazenar os dois dados necessários para o processamento
        int qtdHorasTrabalhadas = 40;
        float salarioPorHora = 45.7F;

        //Calcular o salário bruto
        float salarioBruto = qtdHorasTrabalhadas * salarioPorHora;

        //Impressão
        System.out.println("Você trabalhou " + qtdHorasTrabalhadas + "Hrs" + " e você recebe R$" + salarioPorHora + " por hora." );
        System.out.println("O seu salário bruto é: R$" + salarioBruto);
    }
}
