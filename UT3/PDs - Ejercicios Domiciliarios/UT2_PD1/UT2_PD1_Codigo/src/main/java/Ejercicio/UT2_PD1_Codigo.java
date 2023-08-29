/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio;

import java.util.Arrays;

/**
 *
 * @author Nacho
 */
public class UT2_PD1_Codigo {

    public static void main(String[] args) {
        myFunction();
    }
    
    public static void myFunction(){
        String[] lines = ManejadorArchivosGenerico.leerArchivo("..\\UT2_PD1_Codigo\\src\\main\\java\\Ejercicio\\numeros.txt");
        int N = Integer.parseInt(lines[0]);
        int counter = 0;
        for(int i = 1; i <= N-1; i++){
            for (int j = N; j >= i+1; j--){
                if(Integer.parseInt(lines[j]) < Integer.parseInt(lines[j-1])){
                    //Intercambia
                    String temp = lines[j];
                    lines[j] = lines[j-1];
                    lines[j-1] = temp;
                    //Contador
                    counter++;
                }
            }
        }
        System.out.println("Largo del arreglo: " +N);
        System.out.println("Cantidad de sorts: " +counter);
        System.out.println("Valor minimo: " +lines[1]);
        System.out.println("Valor maximo: " +lines[lines.length-1]);
    }
}
