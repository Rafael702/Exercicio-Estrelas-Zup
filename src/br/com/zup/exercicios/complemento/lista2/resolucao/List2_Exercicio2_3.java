package br.com.zup.exercicios.complemento.lista2.resolucao;
/***2 - Faça um programa para uma loja de tintas.
 * O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
 * Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
 * que custam R $80,00 ou em galões de 3,6 litros, que custam R $25,00.
 *Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
 *comprar apenas latas de 18 litros;
 *comprar apenas galões de 3,6 litros;
 *DESAFIO: Misture latas e galões, de forma que o desperdício de tinta seja menor.
 *Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 ***/
public class List2_Exercicio2_3 {
    public static void main(String [] args){
        double area = 60;
        double qtdDeLitrosNecessaria = area/6;
        double valorLata = 80;
        double valorGalao = 25;

        System.out.print("Você precisará de: ");

        double latasDeTintaNecessarias = qtdDeLitrosNecessaria/18;
        double latasDeTintaInteirasNecessarias = Math.ceil(latasDeTintaNecessarias);

        System.out.println(latasDeTintaInteirasNecessarias + " latas de tintas");

        double galaoDeTintaNecessarios = qtdDeLitrosNecessaria/3.6;
        double galoesDeTintaInteirosNecessarios = Math.ceil(galaoDeTintaNecessarios);

        System.out.print("Você precisará de: ");
        System.out.println("Você pagará: R$"+latasDeTintaInteirasNecessarias * valorLata);
        System.out.println(galoesDeTintaInteirosNecessarios+" galões de tinta");
        System.out.println("Você pagará: R$"+galoesDeTintaInteirosNecessarios * valorGalao);

        double folga = (0.1 * qtdDeLitrosNecessaria);
        double quantidadeTotalComFolga = qtdDeLitrosNecessaria + folga;

        double resultadoComLatas = Math.ceil(quantidadeTotalComFolga / 18);
        double resultadoComGaloes = Math.ceil(quantidadeTotalComFolga / 3.6);

        System.out.println("Você pode comprar " +resultadoComLatas );
        double valorASerPagoNaLataComFolga = resultadoComLatas*valorLata;

        System.out.println("Você precisará pagar "+valorASerPagoNaLataComFolga);

        double valorASerPagoNoGalaoComFolga = resultadoComGaloes*valorGalao;

        System.out.println("Ou você pode comprar " +resultadoComGaloes);
        System.out.println("Você precisará pagar "+valorASerPagoNoGalaoComFolga);

    }

}
