/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Código;

/**
 *
 * @author Nacho
 * @param <T>
 */
public class TElementoAB<T> implements IElementoAB<T> {

    private final Comparable etiqueta;
    private final T datos;
    private TElementoAB<T> hijoIzq;
    private TElementoAB<T> hijoDer;

    public TElementoAB(Comparable etiqueta, T datos) {
        this.etiqueta = etiqueta;
        this.datos = datos;
        this.hijoIzq = null;
        this.hijoDer = null;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        return this.hijoDer;
    }
    
    @Override
    public T getDatos() {
        return datos;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (this.etiqueta.equals(unaEtiqueta)) {
            return this;
        } else if (unaEtiqueta.compareTo(this.etiqueta) < 0) {
            return (this.hijoIzq == null) ? null : this.hijoIzq.buscar(unaEtiqueta);
        } else {
            return (this.hijoDer == null) ? null : this.hijoDer.buscar(unaEtiqueta);
        }
    }
    
    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        boolean resultado = false;
        if (elemento != null) {
            Comparable etiquetaElemento = elemento.getEtiqueta();
            if (etiquetaElemento.compareTo(this.etiqueta) < 0) {
                if (this.hijoIzq == null) {
                    this.hijoIzq = elemento;
                    resultado = true;
                } else {
                    resultado = this.hijoIzq.insertar(elemento);
                }
            } else if (etiquetaElemento.compareTo(this.etiqueta) > 0) {
                if (this.hijoDer == null) {
                    this.hijoDer = elemento;
                    resultado = true;
                } else {
                    resultado = this.hijoDer.insertar(elemento);
                }
            }
        }
        return resultado;
    }
    
    @Override
    public String preOrden() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.etiqueta.toString()).append("-");
        if (this.hijoIzq != null) {
            sb.append(this.hijoIzq.preOrden());
        }
        if (this.hijoDer != null) {
            sb.append(this.hijoDer.preOrden());
        }
        return sb.toString();
    }

    @Override
    public String inOrden() {
        StringBuilder sb = new StringBuilder();
        if (this.hijoIzq != null) {
            sb.append(this.hijoIzq.inOrden());
        }
        sb.append(this.etiqueta.toString()).append("-");
        if (this.hijoDer != null) {
            sb.append(this.hijoDer.inOrden());
        }
        return sb.toString();
    }
    
    @Override
    public String postOrden() {
        StringBuilder str = new StringBuilder();
        if (this.getHijoIzq() != null) {
            str.append(this.getHijoIzq().postOrden());
        }
        if (this.getHijoDer() != null) {
            str.append(this.getHijoDer().postOrden());
        }
        str.append(this.getEtiqueta().toString()).append("-");
        return str.toString();
    }
    
    @Override
    public TElementoAB<T> eliminar(Comparable unaEtiqueta) {
        return null;
    }
}
