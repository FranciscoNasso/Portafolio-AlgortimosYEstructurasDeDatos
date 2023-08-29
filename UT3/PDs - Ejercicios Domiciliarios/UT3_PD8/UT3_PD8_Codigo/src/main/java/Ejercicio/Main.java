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
        ListaSucursal listaSucursal = new ListaSucursal();
        listaSucursal.agregarSucursal("Montevideo");
        listaSucursal.agregarSucursal("Paysandu");
        listaSucursal.agregarSucursal("Soriano");
        listaSucursal.agregarSucursal("Rio Negro");
        
        System.out.println(listaSucursal.listarSucursales());
    }
}
