/**13 - João Papo-de-Pescador, homem de bem,
 * comprou um microcomputador para controlar o rendimento diário de seu trabalho.
 * Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de
 * São Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente.
 * João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
 * Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa
 * que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
 * **/
package br.com.zup.exercicios.lista6;

import java.util.Scanner;


public class List6_Exercicio13 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        double pesoDePeixes;
        double excessoDePeso = 50;
        double multaExcesso = 4.00;
        double totalExcesso = 0;
        double totalMulta = 0;

        System.out.println("Informe o peso de Peixes: ");
        pesoDePeixes = sc.nextDouble();

        if(pesoDePeixes > 50){
            totalExcesso =   pesoDePeixes - excessoDePeso;
            totalMulta = multaExcesso * totalExcesso;

            System.out.println("O Peso de Peixes foi de: " + pesoDePeixes + "qu");
            System.out.println("Excedeu: " + totalExcesso + "qu");
            System.out.println("O limite é de: " + excessoDePeso +
                    ". Portanto, a multa foi de: R$" + totalMulta);
        }else if(pesoDePeixes >= 0 & pesoDePeixes <= 50){
            System.out.println("O peso de Peixes está na medida: " + pesoDePeixes + "qu");
        }else {
            System.out.println("Valor incorreto! Insira um valor ácima de 0.");
        }


    }
}
