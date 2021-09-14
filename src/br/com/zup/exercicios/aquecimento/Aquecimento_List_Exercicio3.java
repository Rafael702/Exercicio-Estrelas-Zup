/**
 * 3. Crie um programa para gerenciar o cardápio de um restaurante.
 * Cada prato tem um nome e pode conter diversos ingredientes.
 * No final do programa, o usuário deve decidir se irá adicionar mais de um prato,
 * exibir todos os pratos cadastrados ou excluir um prato pelo nome.
 **/
package br.com.zup.exercicios.aquecimento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aquecimento_List_Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> pratos = new HashMap<>();

        boolean chave = true;
        int opcao = 0;
        String nomePrato;
        String ingredientes;

        System.out.println("Bem vindo ao Programa PRATANDO!!");

        while (chave != false) {
            System.out.println("Escolha umas das opções abaixo: ");
            System.out.println("Digite 1: Para adicionar um prato.");
            System.out.println("Digite 2: Para ver a lista de pratos adicionados.");
            System.out.println("Digite 3: Para excluir os pratos da lista.");
            System.out.println("Digite 4: Para sair do programa.");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do prato:");
                    nomePrato = sc.nextLine();

                    System.out.println("Informe os ingredientes do " + nomePrato);
                    ingredientes = sc.nextLine();

                    pratos.put(nomePrato, " Ingredientes: " + ingredientes);
                    break;
                case 2:
                    System.out.println("--------------------MENU--------------------");
                    if(pratos.isEmpty()){
                        System.out.println("Não contém pratos no menu.");
                    }else{

                    for (String menu : pratos.keySet()) {
                        System.out.println("Prato: " + menu + pratos.get(menu));
                        }
                    }
                    System.out.println("--------------------------------------------");
                    break;
                case 3:
                    System.out.println("Informe o nome do prato que você deseja remover do menu:");
                    String excluirPrato = sc.nextLine();
                    String pratoExluido = "";

                    for (String pratoExcluir : pratos.keySet()) {
                        if (pratoExcluir.equals(excluirPrato)) {
                            System.out.println("Prato retirado do menu.");
                            pratoExluido = excluirPrato;
                        }
                    }

                    pratos.remove(pratoExluido);
                    break;
                case 4:
                    chave = false;
                    break;
                default:
                    System.out.println("Informe um valor válido, de acordo com o Menu de Opções.");
            }

        }


    }
}
