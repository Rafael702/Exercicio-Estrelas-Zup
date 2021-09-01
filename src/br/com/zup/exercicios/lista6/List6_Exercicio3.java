package br.com.zup.exercicios.lista6;

import java.util.*;

/**3 - Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 *  O usuário deve informar de qual número ele deseja ver a tabuada.
 *
 */
public class List6_Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer>tabuada = new ArrayList<>();
        Map<Integer, Integer>numero = new HashMap<Integer, Integer>();

        tabuada.add(1);
        tabuada.add(2);
        tabuada.add(3);
        tabuada.add(4);
        tabuada.add(5);
        tabuada.add(6);
        tabuada.add(7);
        tabuada.add(8);
        tabuada.add(9);
        tabuada.add(10);


        System.out.println("Informe o valor da tabuada que você deseja ver: ");
        int valorTabuada = sc.nextInt();

        int calcTabuada = 0;

        numero.put(1, valorTabuada);

        System.out.println("Tabuada de " + numero.get(1) + ":");
        for(int contador = 0; contador <= 9; contador++){


            calcTabuada = numero.get(1) * tabuada.get(contador);
            System.out.println(numero.get(1) + " x " + tabuada.get(contador) + " = " + calcTabuada);
        }


    }
}
