package org.example;
import org.example.listasEntrelazadas.ListasEntrelazada;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ListasEntrelazada lista = new ListasEntrelazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.mostrar();
    }
    public void listaEntrelazada() {
        StringBuilder result= new StringBuilder();
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("!");

        for (String elemento : lista) {
            result.append(elemento);
        }
        System.out.println(result);
    }
}
