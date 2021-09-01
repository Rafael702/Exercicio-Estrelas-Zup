package br.com.zup.exercicios.lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**1 - Faça um programa que pergunte o preço de três produtos e informe
 * qual produto você deve comprar,
 * sabendo que a decisão é sempre pelo mais barato.
 */

public class List6_Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> produto = new ArrayList<>();


        int contador = 1;
        int totalProdutos = 3;
        int valoresDosProdutos;
        int produtoBarato = 0;


        while (contador <= totalProdutos) {
            System.out.println("Informe o preço do produto " + contador + " :");
            valoresDosProdutos = sc.nextInt();
            produto.add(valoresDosProdutos);

            if (contador == 1){
                produtoBarato = valoresDosProdutos;
            }else if(contador == 3) {

                totalProdutos = 2;
                for(int contadorProdutos = 0; contadorProdutos <= totalProdutos; contadorProdutos++){

                    if(produto.get(contadorProdutos) <= produtoBarato){
                        produtoBarato = produto.get(contadorProdutos);
                    }
                }
            }
            contador++;
            }

        System.out.println("O produto mais barato é o de : R$" +  produtoBarato);
        }

    }


