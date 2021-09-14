package br.com.zup.exercicios.lista6;
/**10 - Faça um Programa que leia 4 notas, mostre as notas e a média na tela.**/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List6_Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> nota = new ArrayList<>();

        int n;
        int media = 0;
        int totalN = 0;

        for(int contador = 1; contador <= 4; contador++){
            System.out.println("Informe a " + contador + "° nota do aluno: ");
            n = sc.nextInt();

            totalN += n;


        }

        media = totalN/4;
        System.out.println("A média do Aluno é: " + media);

    }
}
