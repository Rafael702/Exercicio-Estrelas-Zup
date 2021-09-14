/**
 * LEVEL UP
 * Crie um programa para gerenciar uma lista de alunos, cada aluno tem nome,
 * telefone e email. No final do programa deve ser exibido a lista de alunos cadastrados.
 * Entrega Mínima: O sistema permite, via terminal, inserir pelo menos 1 aluno em uma lista
 * e retornar o mesmo na tela.
 * Entrega Média: O sistema permite adicionar mais de um aluno e apresenta um menu para decidir
 * se deverá adicionar mais alunos ou encerrar o programa.
 * Entrega Máxima: O Sistema permite excluir um aluno usando como parâmetro o email
 * e não permite inserir um aluno com o email repetido.
 **/
package br.com.zup.exercicios.lista6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class List6_LevelUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sair = 3;
        String nomeAluno;
        String emailAluno;


        Map<String, String> alunos = new HashMap<String, String>();

        String todosEmails;
        String telefoneAluno;

        do {
            System.out.println("Digite o nome do Aluno: ");
            nomeAluno = sc.next();

            System.out.println("Digite o numero do seu telefone: ");
            telefoneAluno = sc.next();

            System.out.println("Digite o e-mail do Aluno: ");
            emailAluno = sc.next();


            if (sair == 3) {
                alunos.put("Email: " + emailAluno, "| Nome do Aluno: " + nomeAluno + "\nTelefone: " + telefoneAluno);
            } else if (sair == 0) {
                if (alunos.containsKey(emailAluno)) {
                    System.out.println("Aluno não cadastrado");
                } else {
                    todosEmails = emailAluno;
                    alunos.put("Email: " + emailAluno, "| Nome do Aluno: " + nomeAluno + "\nTelefone: " + telefoneAluno);
                }
            }

            System.out.println("Deseja sair do Programa? Digite: 3. " +
                    "Para continuar cadastrando alunos, digite: 0");
            sair = sc.nextInt();

        } while (sair != 3);

        System.out.println("Lista de Alunos cadastrados: ");
        for (String referencia : alunos.keySet()) {
            System.out.println(referencia + alunos.get(referencia));
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Deseja excluir algum aluno do sistema?");
        System.out.println("Digite: 0 - Sim ou 3 - Não: ");
        sair = sc.nextInt();

        if (sair != 3) {
            do {
                System.out.println("Exclusão de Alunos do Sistema: ");

                System.out.println("Digite o e-mail do Aluno: ");
                emailAluno = sc.next();

                alunos.remove(emailAluno);

                System.out.println("Deseja sair do Programa? Digite: 3. " +
                        "Para continuar cadastrando alunos, digite: 0");
                sair = sc.nextInt();

            } while (sair != 3);
        }

        for (String referencia : alunos.keySet()) {
            System.out.println("Nome do Aluno: " + alunos.get(referencia) + " | E-mail: " + referencia);
        }
    }
}
