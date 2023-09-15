/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Código;

import java.util.Arrays;

/**
 *
 * @author Nacho
 */
public class Principal {

    public static void main(String[] args) {
        int[] claves = {3, 5, 2, 68, 23, 98, 59, 15, 71, 73, 97, 34};
        TArbolBB arbol = new TArbolBB();
        TElementoAB elemento;
        for(int clave : claves) {
            elemento = new TElementoAB(clave, clave);
            arbol.insertar(elemento);
        }
        arbol.eliminar(3);
        System.out.println(arbol.buscar(15));
        /*
        System.out.println(arbol.inOrden());
        System.out.println(arbol.obtenerMenorClave());
        System.out.println(arbol.obtenerMayorClave());
        System.out.println(arbol.obtenerClaveAnterior(73));
        System.out.println(arbol.nodoNivel(5));
        arbol.listarHoja();
        System.out.println(arbol.verificarArbol());
        */
    }
}
