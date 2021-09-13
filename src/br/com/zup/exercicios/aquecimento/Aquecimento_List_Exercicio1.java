/**
 * 1. Crie um programa para gerenciar uma lista de produtos de um estabelecimento,
 * cada produto tem um nome e um preço.
 * No final do programa, o usuário deve decidir se irá adicionar mais de um produto,
 * exibir todos os produtos cadastrados ou excluir um produto pelo nome.
 **/
package br.com.zup.exercicios.aquecimento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aquecimento_List_Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Map<String, String> produtos = new HashMap<>();

        boolean chave = true;
        int opcao = 0;
        String nomeProduto;
        String valorProduto;

        System.out.println("Bem vindo ao Programa SUPERMERCADO NA TELA.");

        while (chave == true) {
            System.out.println("Escolha umas das opções abaixo: ");
            System.out.println("Digite 1: Para adicionar um produto.");
            System.out.println("Digite 2: Para ver a lista de produtos adicionados.");
            System.out.println("Digite 3: Para excluir um produto da lista.");
            System.out.println("Digite 4: Para sair do programa.");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Informe o nome do produto:");
                nomeProduto = sc.next();

                System.out.println("Informe o valor do produto:");
                valorProduto = sc.next();

                produtos.put(nomeProduto, " Valor do produto: R$" + valorProduto);
            } else if (opcao == 2) {
                System.out.println("Estes produtos estão na Prateleira: ");
                System.out.println("----------------------------------------------------------------------------");
                for (String naPrateleira : produtos.keySet()) {
                    System.out.println("Nome do Produto: " + naPrateleira + "|" + produtos.get(naPrateleira));
                }
                System.out.println("----------------------------------------------------------------------------");
                Thread.sleep(1_000);
            } else if (opcao == 3) {
                System.out.println("Informe o nome do produto que você deseja excluir:");
                String produtoExcluido = "";
                String excluirProduto = sc.next();

                for (String retirar : produtos.keySet()) {
                    if (retirar.equals(excluirProduto)) {
                        System.out.println("Produto removido.");
                        produtoExcluido = excluirProduto;
                    }
                }
                produtos.remove(produtoExcluido);
            } else if (opcao == 4) {
                chave = false;
            }


        }

    }
}
