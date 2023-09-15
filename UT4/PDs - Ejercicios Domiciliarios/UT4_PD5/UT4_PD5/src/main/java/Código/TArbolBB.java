/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Código;

/**
 *
 * @author Nacho
 */
public class TArbolBB<T> implements IArbolBB<T> {
    private TElementoAB<T> raiz;

    public TArbolBB() {
        this.raiz = null;
    }

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        if (raiz == null) {
            raiz = unElemento;
            return true;
        } else {
            return raiz.insertar(unElemento);
        }
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (raiz == null) {
            return null;
        } else {
            return raiz.buscar(unaEtiqueta);
        }
    }

    @Override
    public String preOrden() {
        if (raiz == null) {
            return "";
        } else {
            return raiz.preOrden();
        }
    }

    @Override
    public String inOrden() {
        if (raiz == null) {
            return "";
        } else {
            return raiz.inOrden();
        }
    }

    @Override
    public String postOrden() {
        if (raiz == null) {
            return "";
        } else {
            return raiz.postOrden();
        }
    }
    
    public boolean esVacio() {
        return (raiz == null);
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        if (!esVacio()) {
            this.raiz = this.raiz.eliminar(unaEtiqueta);
        }
    }
    
    public int obtenerNivel(Comparable unaEtiqueta){
        if (!esVacio()) {
            return this.raiz.obtenerNivel(unaEtiqueta);
        }
        return -1;
    }
    
    public int obtenerMenorClave(){
        if (!esVacio()) {
            return (int) this.raiz.obtenerMenorClave();
        }
        return -1;
    }
    
    public Comparable obtenerMayorClave(){
        if (!esVacio()) {
            return this.raiz.obtenerMayorClave();
        }
        return -1;
    }
    
    public Comparable obtenerClaveAnterior(Comparable clave){
        if (!esVacio()) {
            return (int) this.raiz.obtenerClaveAnterior(clave);
        }
        return -1;
    }
    
    public int nodoNivel(int nivel) {
        if (!esVacio()) {
            return raiz.nodoNivel(1, nivel);
        }
        return -1;
    }
    
    public void listarHoja() {
        if (!esVacio()) {
            raiz.listarHoja(1);
        }
    }
    
    public boolean verificarArbol() {
        if (!esVacio()) {
            raiz.verificarArbol();
        }
        return false;
    }
}

