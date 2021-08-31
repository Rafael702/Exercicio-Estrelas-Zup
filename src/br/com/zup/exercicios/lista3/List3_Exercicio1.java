package br.com.zup.exercicios.lista3;

import java.util.Scanner;

/**1 - Faça um programa para o cálculo de uma folha de pagamento,
 * sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo)
 * e 10% para o INSS
 * e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
 * O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário
 * o valor da sua hora e a quantidade de horas trabalhadas no mês.
 Desconto do IR:
 Salário Bruto até 900 (inclusive) - isento
 Salário Bruto até 1500 (inclusive) - desconto de 5%
 Salário Bruto até 2500 (inclusive) - desconto de 10%
 Salário Bruto acima de 2500 - desconto de 20%
 Imprima na tela as informações.
 ***/
public class List3_Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao programa de: Folha De Pagamento");
        System.out.println("Prezado, informe o valor da sua hora trabalhada");
        double valorHoraTrabalhada = sc.nextDouble();

        System.out.println("Informe o total de horas trabalhadas no último mês: ");
        double totalHorasTrabalhadas = sc.nextDouble();

        double salarioBruto = valorHoraTrabalhada * totalHorasTrabalhadas;

        System.out.printf("%20s", "Salário Bruto:" );
        System.out.printf("("+(int)valorHoraTrabalhada+"*"+(int)totalHorasTrabalhadas+")");
        System.out.printf("%24s", "R$"+ salarioBruto +"\n");

        double percentualIrDesconto = 0.0;

        if(salarioBruto > 0 & salarioBruto <= 900){
            System.out.printf("%25s", "Sem desconto do IR:");
            System.out.printf("%23s", "R$"+ percentualIrDesconto);
        }else if(salarioBruto <= 1500){
            percentualIrDesconto = salarioBruto * 0.05;
            System.out.printf("%18s", "(-) IR (5%):");
            System.out.printf("%30s", "R$"+ percentualIrDesconto);
        }else if(salarioBruto <= 2500){
            percentualIrDesconto = salarioBruto * 0.1;
            System.out.printf("%18s", "(-) IR (10%):");
            System.out.printf("%30s", "R$"+ percentualIrDesconto);
        }else if(salarioBruto > 2500){
            percentualIrDesconto = salarioBruto * 0.2;
            System.out.printf("%18s", "(-) IR (20%):");
            System.out.printf("%30s", "R$"+ percentualIrDesconto);
        }else{
            System.out.println("Valores negativos. Verifique os valores inseridos abaixo e corrija-os.");
        }

        double percentualInssDesconto = salarioBruto * 0.1;
        System.out.printf("\n" + "%20s","(-) INSS (10%)");
        System.out.printf("%29s", "R$" + percentualInssDesconto);

        double percentualFgst = salarioBruto * 0.11; // FGTS é o que a empresa deposita.
        System.out.printf("\n" + "%15s","FGTS(11%)");
        System.out.printf("%35s", "R$"+ percentualFgst +"\n");

        double totalDesconto =  percentualInssDesconto + percentualIrDesconto ;
        System.out.printf("%26s","Total de Descontos: ");
        System.out.printf("%24s", "R$"+ totalDesconto +"\n");

        double salarioLiquido = salarioBruto - totalDesconto;
        System.out.printf("%22s","Salário Liquido:");
        System.out.printf("%27s","R$"+ salarioLiquido);








    }
}
