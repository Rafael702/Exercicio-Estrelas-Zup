package br.com.zup.exercicios.complemento.lista2;
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
public class List2_Exercicio2_1 {
    private static final float LITROS_POR_GALAO = 3.6F;
    private static final int LITROS_POR_LATA = 18;
    private static final int VALOR_GALAO = 80;
    private static final int VALOR_LATA = 25;
    private static final int FOLGA = 10;
    private static final int METROS_POR_LITRO = 6;
    private static final int CEM_PORCENTO = 100;

    public static void main(String[] args){

        float metros = 18;

        float totalLitros = metros/METROS_POR_LITRO + 10;
        float folgaEmLitros = totalLitros*FOLGA/CEM_PORCENTO;
        float totalLitrosComFolga = totalLitros + folgaEmLitros;
        float totalTinta;

        totalLitros = metros/METROS_POR_LITRO;
        totalTinta = totalLitros/LITROS_POR_GALAO;

        System.out.println(Math.round(totalTinta));

        metros = 108;

        totalLitros = metros/METROS_POR_LITRO;
        totalTinta = totalLitros/LITROS_POR_LATA;

        System.out.println((int)totalTinta);





    }
}
