/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio;

/**
 *
 * @author Nacho
 */
public class Main {

    public static void main(String[] args) {
        
        Nodo nodo1 = new Nodo(123, "nodo1");
        Nodo nodo2 = new Nodo("Hola", "nodo2");
        Lista lista = new Lista();
        
        lista.insertar(nodo1);
        lista.insertar(nodo2);
        
        lista.imprimir();
    }
}
