package br.com.zup.exercicios.lista2;

import java.util.Scanner;

/**4 - Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores
 * e lhe contrataram para desenvolver o programa que calcula os reajustes.
 * Portanto, faça um programa que recebe o salário de um colaborador
 * e o reajuste segundo o seguinte critério, baseado no salário atual:
 Salários até R$ 280,00 (incluindo), receberão aumento de 20%
 Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
 Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
 Salários de R$ 1500,00 em diante, receberão aumento de 5%
 Após o aumento ser realizado, informe na tela:
 O salário antes do reajuste;
 O percentual de aumento aplicado;
 O valor do aumento;
 O novo salário, após o aumento;
 **/
public class List2_Exercicio4 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        float vintePorCento = 0.2F;
        float quinzePorCento = 0.15F;
        float dezPorCento = 0.1F;
        float cincoPorCento = 0.05F;
        float totSalario;
        float percentualSalario;

        System.out.println("Informe o salário do zupper: ");
        float salario = sc.nextFloat();

        if(salario <= 280){
            percentualSalario = salario*vintePorCento;
            totSalario = salario + percentualSalario;
            System.out.println("O salário era de: R$" + salario);
            System.out.println("O percentual de aumento foi de: 20%");
            System.out.println("O aumento foi de: R$" + (int)percentualSalario);
            System.out.println("Sendo assim, o salário do zupper foi aumentado para: R$" + totSalario);

        }else if(salario > 280 & salario <= 700){
            percentualSalario = salario*quinzePorCento;
            totSalario = salario + percentualSalario;
            System.out.println("O salário era de: R$" + salario);
            System.out.println("O percentual de aumento foi de: 15%");
            System.out.println("O aumento foi de: R$" + (int)percentualSalario);
            System.out.println("Sendo assim, o salário do zupper foi aumentado para: R$" + totSalario);

        }else if(salario > 700 & salario <= 1500){
            percentualSalario = salario*dezPorCento;
            totSalario = salario + percentualSalario;
            System.out.println("O salário era de: R$" + salario);
            System.out.println("O percentual de aumento foi de: 10%");
            System.out.println("O aumento foi de: R$" + (int)percentualSalario);
            System.out.println("Sendo assim, o salário do zupper foi aumentado para: R$" + totSalario);


        }else{
            percentualSalario = salario*cincoPorCento;
            totSalario = salario + percentualSalario;
            System.out.println("O salário era de: R$" + salario);
            System.out.println("O percentual de aumento foi de: 5%");
            System.out.println("O aumento foi de: R$" + (int)percentualSalario);
            System.out.println("Sendo assim, o salário do zupper foi aumentado para: R$" + totSalario);

        }

        System.out.println("---------------------Fim do Programa---------------------------------------");
    }
}
