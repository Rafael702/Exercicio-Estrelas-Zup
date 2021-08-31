package br.com.zup.exercicios.lista5;
/**3 - Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e mostrar
 * a quantidade de números pares e a quantidade de números ímpares desses números.
 **/
import java.util.Scanner;

public class List5_Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int qtdNumeros;

        System.out.println("Informe a quantidade de números que você deseja inserir neste programa: ");
        qtdNumeros = sc.nextInt();

        int contador = 1;
        int n;
        int qtdNumerosPares = 0;
        int qtdNumerosImpares = 0;

        while(contador <= qtdNumeros){
            System.out.println("Entre com o " + contador + "° numero: ");
            n = sc.nextInt();

            if(n % 2 == 0){
                qtdNumerosPares += 1;
            }else{
                qtdNumerosImpares+= 1;
            }
            contador++;
        }

        System.out.println("A quantidade de Números pares é de: " + qtdNumerosPares);
        System.out.println("A quantidade de Números impares é de: " + qtdNumerosImpares);
    }
}
