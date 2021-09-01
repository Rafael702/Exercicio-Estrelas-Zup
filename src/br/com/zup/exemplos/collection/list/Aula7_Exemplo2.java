package br.com.zup.exemplos.collection.list;

import java.util.HashMap;
import java.util.Map;

public class Aula7_Exemplo2 {
    public static void main(String[] args) {
        System.out.println("Contatos Um: ");
        Map<Integer, String> contatos = new HashMap<Integer, String>();

        contatos.put(1, "Francisco");
        contatos.put(2, "Norbert");
        contatos.put(3, "Lewis");

//        System.out.println("Esta chave é do: " + contatos.get(1));

//        Imprimindo chaves e valor no foreach
//        for(int referencia: contatos.keySet()){
//
//            System.out.println("Chave: " + referencia + "| valor: " + contatos.get(referencia));
//        }

        System.out.println("\nContatos Dois: ");
        Map<String, String> contatos2 = new HashMap<String, String>();

        contatos2.put("rfaek@gmail.com", "Rafael Santos");
        contatos2.put("rafael.lmeida@yahoo.com", "Rafael Almeida");
        contatos2.put("rafael.santos@hotma.co", "Rafael");

        for (String referencia: contatos2.keySet()){
            System.out.println("Chave: " + referencia + "| valor: " + contatos2.get(referencia));
        }

    }
}
