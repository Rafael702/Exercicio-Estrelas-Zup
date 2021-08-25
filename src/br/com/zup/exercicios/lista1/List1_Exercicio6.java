package br.com.zup.exercicios.lista1;
/*6 - Faça um Programa que receba o quanto você ganha por hora e o número de
*horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
*mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o
*INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
*a. Salário bruto.
*b. Quanto pagou ao INSS.
*c. Quanto pagou ao sindicato.
*d. Qual o salário líquido do funcionário.
*/


public class List1_Exercicio6 {

    public static void main(String [] args){

        float salarioPorHora = 53.7F, trabalhoMensal = 70, impostoRenda = 0.11F, inss = 0.08F, sindicato = 0.05F;


        double salarioBruto = salarioPorHora * trabalhoMensal;
        double descontoInss = salarioBruto * inss;
        double descontoImpostoDeRenda = salarioBruto * impostoRenda;
        double descontoSindicato = salarioBruto * sindicato;
        double salarioLiquido = salarioBruto - descontoInss - descontoImpostoDeRenda - descontoSindicato;

        System.out.println("O Salario Bruto é: R$" + salarioBruto);
        System.out.println("O desconto do INSS foi de R$" + descontoInss);
        System.out.println("O desconto do Imposto de Renda foi de:  R$" + descontoImpostoDeRenda);
        System.out.println("O desconto do Sindicato foi de: R$" + descontoSindicato);
        System.out.println("Total do salário líquido é: R$" + salarioLiquido);



    }

}
