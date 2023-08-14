/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut1_ta1.ejercicios;

/**
 *
 * @author albin
 */
public class UT1_TA1Ejercicios {

    public static void main(String[] args) {
        //int num = ";ut"; /* Da error ya que no se puede poner un string en una variable que es un entero */
    //String new = "45"; /* Da error, ya que no se puede la palabra new como nombre de una variable ya que es una palabra reservada.*/
    //int MAYUSCULAS  = 35; /*No da un error en si, pero esta mal ya que no se puede poner todo en mayuscula la variable, debido a que no cumple con la nomenclatura correcta. */ 
    //int +valor = 22;
    
    
    
    
    /*---------Ejercicio 2----------*/
    int result = 1 + 2;
    /* int result = 3 ;*/
    System.out.println(result);
    result = result - 1;
    /*result -= 1; */
    System.out.println(result);
    result = result * 2; 
    /* result *= 2 ; */
    System.out.println(result);
    result = result / 2;
    // result /= 2;
    System.out.println(result);
    result = result + 8;
    // result += 8;
    result = result % 7;
    // result %= 7;
    System.out.println(result);
    
    int a = 5;
    //int i = 3;
    //System.out.println(a+=++i); //Da 9.
    
    
    int i = 3;
    i++;
    System.out.println(i); //Da 4
    ++i;
    System.out.println(i); // Da 5
    System.out.println(++i); // Da 6
    System.out.println(i++); // Da 6
    System.out.println(i); // Da 7
    
    
    // -------Ejercicio 3 ----------
    
    /* Identifique los tipos de las siguientes sentencias:
1. aValue = 8933.234; -> Respuesta = b
2. aValue++; -> Respuesta = a
3. System.out.println("Hello World!"); -> Respuesta = d 
4. Bicycle myBike = new Bicycle(); - > Respuesta = c
a) Incremento
b) Asignación
c) Creación de objeto
d) Invocación de método 

//Ejercicio 4

if (aNumber >= 0)
if (aNumber == 0)
System.out.println("first string");
else System.out.println("second string");
System.out.println("third string");

a) se imprime second stirng y third string

b)
*/  int aNumber = 3;
    if (aNumber >= 0)
        if (aNumber == 0)
            System.out.println("first string");
        else 
            System.out.println("second string");
    System.out.println("third string");
    }
    /* Imprime second string y third string, debido a que entra al primer if, despues al segundo if no entra por lo tanto entra al else e imprime el second third y luego imprime el third string debido a que no se encuentra dentro de ningun if y lo va a imprimir sin importar el valor de aNumber. */

    /*  int aNumber = 3;
        if (aNumber >= 0)
            if (aNumber == 0)
                System.out.println("first string");
            else 
                System.out.println("second string");
        System.out.println("third string");*/

    /*
        int aNumber = 3;
        if (aNumber >= 0){
            if (aNumber == 0){
                System.out.println("first string");
            }
            else{ 
                System.out.println("second string");
                }
        }
        System.out.println("third string");
    */

}
