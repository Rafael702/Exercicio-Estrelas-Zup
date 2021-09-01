package br.com.zup.exemplos.collection.list;
/***9 - Faça um Programa que leia uma lista de 10 números e mostre-os na ordem inversa.
 **/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        int contador = 1;
        int contadorExibicao = 9;
        int finalDeExibicao = 0;
        int totalDeNumeros = 10;
        int valorDigitadoPeloUsuario = 0;

        while(contador <= totalDeNumeros){
            System.out.println("Digite o número: " + contador);
            valorDigitadoPeloUsuario = sc.nextInt();
            numeros.add(valorDigitadoPeloUsuario);
            contador++;
        }
//        System.out.println(numeros);

        while (contadorExibicao >= finalDeExibicao){
            System.out.println(numeros.get(contadorExibicao));
            contadorExibicao--;
        }

    }
}
