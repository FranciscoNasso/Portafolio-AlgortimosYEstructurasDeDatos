/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author Nacho
 * @param <T>
 */
public class Nodo<T> implements INodo<T> {

    private T dato;
    private Nodo<T> siguiente;
    private Comparable etiqueta;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(T dato, Comparable etiqueta) {
        this.dato = dato;
        this.siguiente = null;
        this.etiqueta = etiqueta;
    }

    @Override
    public T getDato() {
        return this.dato;
    }
    
    @Override
    public Nodo<T> getSiguiente() {
        return this.siguiente;
    }
    
    @Override
    public void setSiguiente(Nodo<T> nodo) {
        this.siguiente = nodo;
    }
    
    @Override
    public void imprimir() {
        System.out.println(this.dato);
    }
    
    @Override
    public void imprimirEtiqueta() {
        System.out.println(this.etiqueta);
    }
    
    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }
    
    @Override
    public int compareTo(Comparable etiqueta) {
        return this.etiqueta.compareTo(etiqueta);
    }
}

