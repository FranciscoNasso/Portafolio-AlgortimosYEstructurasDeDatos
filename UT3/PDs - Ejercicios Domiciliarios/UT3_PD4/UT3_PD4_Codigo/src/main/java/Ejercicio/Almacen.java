/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Nacho
 */
public class Almacen implements IAlmacen {
    
    private String direccion;
    private String telefono;
    private String nombre;
    private Lista<Producto> listaProductos;

    public Almacen(String direccion, String telefono, String nombre) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre = nombre;
        this.listaProductos = new Lista<Producto>();
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Lista<Producto> getListaProductos() {
        return listaProductos;
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        this.listaProductos.insertar(new Nodo<Producto>(unProducto.getEtiqueta(), unProducto));
    }

    @Override
    public boolean eliminar(Comparable clave) {
        return this.listaProductos.eliminar(clave);
    }

    @Override
    public String imprimirProductos() {
        return this.listaProductos.imprimir();
    }

    @Override
    public String imprimirSeparador(String separador) {
        return this.listaProductos.imprimir(separador);
    }

    @Override
    public Boolean agregarStock(Comparable clave, Integer cantidad) {
        Producto producto = this.buscarPorCodigo(clave);
        if (producto != null) {
            producto.setStock(producto.getStock() + cantidad);
            return true;
        }
        return false;
    }

    @Override
    public Integer restarStock(Comparable clave, Integer cantidad) {
        Producto producto = this.buscarPorCodigo(clave);
        if (producto != null) {
            int stockActual = producto.getStock();
            if (stockActual >= cantidad) {
                producto.setStock(stockActual - cantidad);
                return cantidad;
            } else {
                producto.setStock(0);
                return stockActual;
            }
        }
        return 0;
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {
        Nodo<Producto> nodo = this.listaProductos.buscar(clave);
        if (nodo != null) {
            return nodo.getDato();
        }
        return null;
    }

    @Override
    public void listarOrdenadoPorNombre() {
        return null;
    }

    @Override
    public Producto buscarPorDescripcion(String descripcion) {
        Nodo<Producto> actual = this.listaProductos.getPrimero();
        while (actual != null) {
            if (actual.getDato().getNombre().equals(descripcion)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public int cantidadProductos() {
        return this.listaProductos.cantElementos();
        
    }
}

