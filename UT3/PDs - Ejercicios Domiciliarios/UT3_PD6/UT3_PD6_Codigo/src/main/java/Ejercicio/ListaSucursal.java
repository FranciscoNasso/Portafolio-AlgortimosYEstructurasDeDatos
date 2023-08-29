/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author Nacho
 */
public class ListaSucursal {
    private Lista<String> listaSucursales;
    
    public ListaSucursal(){
        this.listaSucursales = new Lista<String>();
    }
    
    public void agregarSucursal(String sucursal){
        this.listaSucursales.insertar(sucursal, sucursal);
    }
    
    public boolean buscarSucursal(String sucursal){
        Nodo<String> nodo = this.listaSucursales.buscar(sucursal);
        if(nodo != null){
            return true;
        }
        return false;
    }
    
    public void quitarSucursal(String sucursal){
        this.listaSucursales.eliminar(sucursal);
    }
    
    public String listarSucursales(){
        return this.listaSucursales.imprimir();
    }
    
    public String listarSucursalesSeparador(String separador){
        return this.listaSucursales.imprimir(separador);
    }
    
    public int cantidadSucursales(){
        return this.listaSucursales.cantElementos();
    }
    
    public boolean haySucursales(){
        return this.listaSucursales.esVacia();
    }
}
