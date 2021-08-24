package br.com.zup.exemplos;

public class Aula1_Exemplo1 {
    public static void main(String [] args){

        int idade_do_usuario = 18;
        String nomeDoUsuario = "Leticia";

        //Printando as variáveis declaradas.
        System.out.print("Olá, meu nome é ");
        System.out.print(nomeDoUsuario);
        System.out.print(" e minha idade é ");
        System.out.print(idade_do_usuario);
        System.out.print(" anos.");


        //Printando de forma concatenada as variáveis declaradas.
        System.out.print("Olá, meu nome é " + nomeDoUsuario);

    }
}
