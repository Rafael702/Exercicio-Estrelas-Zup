package br.com.zup.exercicios.lista6.levelup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Resolucao_Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> alunos = new HashMap<String, String>();
        boolean chave = true;

        System.out.println("--------Seja Bem Vindo-------------");
        sc.nextLine();

        int opcao = 0;
        while (chave == true){

            System.out.println("Digite 1: Para cadastrar um aluno: ");
            System.out.println("Digite 2: Para exibir a lista: ");
            System.out.println("Digite 3: Para remover um aluno da lista, informe o email do aluno: ");
            System.out.println("Digite 4: Para sair do Menu");


            if(opcao == 1){
                System.out.println("Por favor, digite o nome Completo do Aluno: ");
                String nome = sc.nextLine();
                System.out.println("Por favor, digite o telefone do Aluno: ");
                String telefone = sc.nextLine();
                System.out.println("Por favor, digite o email do Aluno: ");
                String email = sc.nextLine();

            } else if(opcao == 2){
                for (String chaveAluno: alunos.keySet()) {
                    System.out.println("Contato: " + alunos.get(chaveAluno) + " Email: " + chaveAluno);
                }

            }else if(opcao == 3){
                System.out.println("Por favor, digite o email a ser deletado: ");
                String emailDeletado = "";
                String emailASerDeletado = sc.nextLine();

                for (String emailAluno : alunos.keySet()){
                    if(emailAluno.equals(emailASerDeletado)){
                        System.out.println("Email deletado com Sucesso. ");
                        //alunos.remove(emailASerDeletado);
                        //break; Outra possibilidade
                        emailDeletado = emailASerDeletado;

                    }
                }

            }else if(opcao == 4){
                chave = false;
            }else{
                System.out.println("Valor inválido,  insira um valor de acordo com o menu de opções.");
            }

        }





    }
}
