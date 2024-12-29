package org.example.listasEntrelazadas;

public class ListasEntrelazada {
    //Listas entrelazadas de manera refactorings
    Nodo cabeza;
    // Añadir un nodo al final de la lista
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
