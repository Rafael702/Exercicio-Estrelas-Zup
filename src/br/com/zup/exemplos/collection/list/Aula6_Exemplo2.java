package br.com.zup.exemplos.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Aula6_Exemplo2 {
    public static void main(String[] args) {
        List<Integer>todosOsNumeros = new ArrayList<>();
        List<Integer>numerosPares = new ArrayList<>();
        List<Integer>numerosImpares = new ArrayList<>();


        todosOsNumeros.add(5);
        todosOsNumeros.add(10);
        todosOsNumeros.add(15);
        todosOsNumeros.add(25);

        for(Integer referencia: todosOsNumeros){
            if(referencia % 2 == 0){
                numerosPares.add(referencia);
            }else {
                numerosImpares.add(referencia);
            }
        }

        System.out.println("Lista completa de números: ");
        System.out.println(todosOsNumeros);
        System.out.println("Quantidade de números: ");
        System.out.println(todosOsNumeros.size());

        System.out.println("Lista de números pares: ");
        System.out.println(numerosPares);
        System.out.println("Quantidade de números Pares: ");
        System.out.println(numerosPares.size());

        System.out.println("Lista de números Impares: ");
        System.out.println(numerosImpares);
        System.out.println("Quantidade de números Impares: ");
        System.out.println(numerosImpares.size());

    }
}
