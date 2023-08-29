/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

import java.util.Stack;

/**
 *
 * @author Nacho
 */
public class Expresion {

    Stack pila = new Stack();

    public boolean controlCorchetes(String[] cadena) {
        if (cadena.length <= 0){
            return false;
        }
        for (String corchete : cadena) {
            if (corchete == "{") {
                pila.push(corchete);
            } else {
                if(pila.empty()){
                    return false;
                }
                pila.pop();
            }
        }
        return pila.empty();
    }

}
