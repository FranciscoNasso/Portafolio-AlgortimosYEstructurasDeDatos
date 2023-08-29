/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio;

import java.util.Arrays;

/**
 *
 * @author Nacho
 */
public class Main {

    public static void main(String[] args) {
        Expresion expresion = new Expresion();
        String[] cadenaVacia = {};
        String[] cadenaBien = {"{", "}", "{", "{", "}", "}"};
        String[] cadenaMal = {"{", "{", "}", "{", "{", "}"};
        
        if (expresion.controlCorchetes(cadenaBien)) {
            System.out.println("La cadena es correcta");
        } else {
            System.out.println("La cadena es incorrecta");
        }
               
    }
}
