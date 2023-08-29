/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

import java.util.ArrayList;

/**
 *
 * @author Nacho
 */
public class ListaSucursal {
    private final ArrayList<String> listaSucursales;
    
    public ListaSucursal(){
        this.listaSucursales = new ArrayList<String>();
    }
    
    public void agregarSucursal(String sucursal){
        this.listaSucursales.add(sucursal);
    }
    
    public boolean buscarSucursal(String sucursal){
        return this.listaSucursales.contains(sucursal);
    }
    
    public void quitarSucursal(String sucursal){
        this.listaSucursales.remove(sucursal);
    }
    
    public String listarSucursales(){
        String resultado = "";
        for (String sucursal : this.listaSucursales){
            resultado += sucursal + "\n";
        }
        return resultado;
    }
    
    public String listarSucursalesSeparador(String separador){
        String resultado = "";
        for (String sucursal : this.listaSucursales){
            resultado += sucursal + separador;
        }
        if (resultado.length() > 0) {
            resultado = resultado.substring(0, resultado.length() - separador.length());
        }
        return resultado;
    }
    
    public int cantidadSucursales(){
        return this.listaSucursales.size();
    }
    
    public boolean haySucursales(){
        return this.listaSucursales.isEmpty();
    }
}
