package br.com.zup.exemplos.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aula7_Exemplo1 {
    public static void main(String[] args) {
        //Estrutura List
        List<String> alunos = new ArrayList<>();

        alunos.add("André");
        alunos.add("Paulo");

        //Estrutura foreach
        for(String referencia: alunos){
            System.out.println(referencia);
        }

        //Criando uma estrutura HashMap.
          //(K)Chave (V)Valor
        Map<String,String> contatos = new HashMap<String, String>();

        contatos.put("03456789","Rafael");
        contatos.put("457626253", "Roberto");

        for (String referencia: contatos.keySet()){
            System.out.println(referencia);
        }

        for (String referencia: contatos.values()){
            System.out.println(referencia);
        }

    }
}
