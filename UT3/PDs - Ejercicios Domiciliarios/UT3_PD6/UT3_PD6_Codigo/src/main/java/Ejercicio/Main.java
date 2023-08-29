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
        
        String suc1 = "..\\UT3_PD6\\src\\main\\java\\Txts\\suc1.txt";
        String suc2 = "..\\UT3_PD6\\src\\main\\java\\Txts\\suc2.txt";
        String suc3 = "..\\UT3_PD6\\src\\main\\java\\Txts\\suc3.txt";
        String sucursales = "..\\UT3_PD6\\src\\main\\java\\Txts\\sucursales.txt";
        
        ListaSucursal listaSucursal = new ListaSucursal();
        cargarSucursales(listaSucursal, suc3);
        
        System.out.println(listaSucursal.listarSucursalesSeparador(";_"));
        
        
        System.out.println("Cantidad Elementos:" +listaSucursal.cantidadSucursales());
        
        /**Prueba del programa
         * 
         * #1
         * Respuesta d) 107 elementos
         * 
         * #2
         * Repuesta c) Shenzhen
         * 
         * #3
         * Respuesta d) Ninguna de las anteriores
         * 
         * #4
         * Falso
         */
    }
    
    public static void cargarSucursales(ListaSucursal listaSucursales, String ruta){
        String[] sucursales = ManejadorArchivosGenerico.leerArchivo(ruta);
        
        for(String sucursal : sucursales){
            listaSucursales.agregarSucursal(sucursal);
        }
    }
}
