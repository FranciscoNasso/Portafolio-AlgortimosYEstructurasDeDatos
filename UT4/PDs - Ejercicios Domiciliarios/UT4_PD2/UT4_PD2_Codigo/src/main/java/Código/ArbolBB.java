/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Código;

/**
 *
 * @author Nacho
 */
public class ArbolBB<T> implements IArbolBB<T> {
    private TElementoAB<T> raiz;

    public ArbolBB() {
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

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        
    }
}

