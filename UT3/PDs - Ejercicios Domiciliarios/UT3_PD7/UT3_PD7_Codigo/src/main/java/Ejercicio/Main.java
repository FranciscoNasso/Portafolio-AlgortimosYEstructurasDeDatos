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
        Conjunto<TAlumno> curso1 = new Conjunto<TAlumno>();
        Conjunto<TAlumno> curso2 = new Conjunto<TAlumno>();
        
        TAlumno a1 = new TAlumno("1234", "Marcos", "Gomez");
        TAlumno a2 = new TAlumno("1235", "Julieta", "Ramirez");
        TAlumno a3 = new TAlumno("1236", "Juan", "Amorin");
        TAlumno a4 = new TAlumno("1237", "Ernesto", "Arias");
        TAlumno a5 = new TAlumno("1238", "Javier", "Gonzalez");
        TAlumno a6 = new TAlumno("1239", "Esteban", "Vasquez");
        TAlumno a7 = new TAlumno("1210", "Mirta", "Perez");
        TAlumno a8 = new TAlumno("1211", "Sebastian", "Mendez");
        
        curso1.insertar("a1", a1);
        curso1.insertar("a2", a2);
        curso1.insertar("a3", a3);
        curso1.insertar("a4", a4);
        curso1.insertar("a4", a4);
        
        curso2.insertar("a3", a3);
        curso2.insertar("a3", a3);
        curso2.insertar("a4", a4);
        curso2.insertar("a5", a5);
        curso2.insertar("a6", a6);
        curso2.insertar("a7", a7);
        curso2.insertar("a8", a8);
        
        System.out.println("La union entre conjuntos es:\n" + curso1.union(curso2).imprimir()); 
        System.out.println("La interseccion entre conjuntos es:\n" +curso1.interseccion(curso2).imprimir()); 
    }
}
