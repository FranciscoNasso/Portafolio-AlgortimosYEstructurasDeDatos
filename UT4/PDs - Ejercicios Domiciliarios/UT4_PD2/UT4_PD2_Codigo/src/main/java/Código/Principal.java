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
        /**
         * #2
        ArbolBB arbolBB = new ArbolBB();
        TElementoAB elemento;
        String[] claves = ManejadorArchivosGenerico.leerArchivo("..\\UT4_PD2\\src\\main\\java\\ArchivosPrueba\\clavesPrueba.txt");
        for(String clave : claves){
            elemento = new TElementoAB(Integer.valueOf(clave), clave);
            arbolBB.insertar(elemento);
        }

        //Escribir archivo preorden
        String [] listaPreOrden = arbolBB.preOrden().split("-");
        ManejadorArchivosGenerico.escribirArchivo("..\\UT4_PD2\\src\\main\\java\\ArchivosPrueba\\preorden.txt", listaPreOrden);
        
        //Escribir archivo inorden
        String [] listaInOrden = arbolBB.inOrden().split("-");
        ManejadorArchivosGenerico.escribirArchivo("..\\UT4_PD2\\src\\main\\java\\ArchivosPrueba\\inorden.txt", listaInOrden);
        
        //Escribir archivo postorden
        String [] listaPostOrden = arbolBB.postOrden().split("-");
        ManejadorArchivosGenerico.escribirArchivo("..\\UT4_PD2\\src\\main\\java\\ArchivosPrueba\\postorden.txt", listaPostOrden);
        
        */
        
        /**
         * 3
         */
        
        ArbolBB arbolBB = new ArbolBB();
        TElementoAB elemento;
        String[] claves = ManejadorArchivosGenerico.leerArchivo("..\\UT4_PD2\\src\\main\\java\\ArchivosPrueba\\claves1.txt");
        for(String clave : claves){
            elemento = new TElementoAB(Integer.valueOf(clave), clave);
            arbolBB.insertar(elemento);
        }
        
        if (arbolBB.buscar(10635) != null){
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }
        
        System.out.println(arbolBB.preOrden()); 
    }
}
