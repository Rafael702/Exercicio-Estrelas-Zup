package br.com.zup.exercicios.lista2;

public class List2_Exercicio2 {

    public static void main(String[] args){

        float metros = 16, tintaLitros = 18, tintaGaloes = 3.6F;
        int valorLitros = 80, valorTintaGaloes = 25;

        float totalTinta = metros/tintaGaloes, valorTotal;
        //3,6Litros
        valorTotal = Math.round(totalTinta * valorTintaGaloes);
        System.out.println(Math.round(totalTinta)+ " R$" + valorTotal);

        //18 Litros
        metros = 36;

        totalTinta = metros/tintaLitros;
        valorTotal = totalTinta * valorLitros;

        System.out.println( (int)totalTinta + " R$" + valorTotal);

        metros = 30;
        float tintaMisturada;

        totalTinta = (metros - tintaLitros)/tintaGaloes;
        valorTotal = valorTintaGaloes * totalTinta;
        tintaMisturada = valorTotal + valorLitros;

        System.out.println("Total de tintas: " + (int)totalTinta + " e o valor em dinheiro ficou: R$" + (int)tintaMisturada);





    }
}
