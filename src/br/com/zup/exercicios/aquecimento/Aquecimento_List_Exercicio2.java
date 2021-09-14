/**
 * 2. Crie um programa para gerenciar uma lista de candidatos de um vestibular,
 * cada candidato tem número de matrícula e uma nota. No final do programa,
 * o usuário deve decidir se irá adicionar mais de um candidato,
 * exibir todos os candidatos cadastrados
 * ou excluir um candidato pelo número de matrícula.
 **/
package br.com.zup.exercicios.aquecimento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aquecimento_List_Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> candidatos = new HashMap<>();

        int opcao = 0;
        boolean chave = true;
        String matricula;
        double nota;

        System.out.println("Bem vindo ao Programa de Adicionar Candidatos!!");

        while (chave != false) {
            System.out.println("Escolha umas das opções abaixo: ");
            System.out.println("Digite 1: Para adicionar um candidato.");
            System.out.println("Digite 2: Para ver a lista de candidatos adicionados.");
            System.out.println("Digite 3: Para excluir candidatos da lista.");
            System.out.println("Digite 4: Para sair do programa.");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe a matricula do candidato:");
                    matricula = sc.next();

                    System.out.println("Informe a nota do candidato:");
                    nota = sc.nextDouble();

                    candidatos.put(matricula, nota);
                    System.out.println("Candidato cadastrado com sucesso!!!");
                    break;
                case 2:
                    System.out.println("Lista de candidatos adicionados:");
                    for (String listagem : candidatos.keySet()){
                        System.out.println("Matricula: " + listagem + " Nota do candidato: " + candidatos.get(listagem));
                    }
                    break;
                case 3:
                    System.out.println("Informe a matricula do candidato: ");
                    String excluirCandidato = sc.next();
                    String candidatoExcluido = "";

                    for (String listagemCandidatos: candidatos.keySet()){
                        if(listagemCandidatos.equals(excluirCandidato)){
                            System.out.println("Candidato excluido com sucesso!!!");
                            candidatoExcluido = excluirCandidato;
                        }
                    }
                    candidatos.remove(candidatoExcluido);
                    break;
                case 4:
                    chave = false;
                    break;
                default:
                    System.out.println("Insira um valor válido!");
            }

        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("Fim do Programa. Agradeço por usar!!!!!");
        System.out.println("-------------------------------------------------------------");

    }
}
