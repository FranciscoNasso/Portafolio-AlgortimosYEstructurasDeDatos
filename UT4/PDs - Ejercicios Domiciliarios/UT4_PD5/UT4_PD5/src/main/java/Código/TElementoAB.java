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
    public TElementoAB eliminar(Comparable unaEtiqueta) {

        if (unaEtiqueta.compareTo(this.getEtiqueta()) < 0) {

            if (this.getHijoIzq() != null) {

                this.setHijoIzq(this.getHijoIzq().eliminar(unaEtiqueta));

            }
            return this;
        }
        if (unaEtiqueta.compareTo(this.getEtiqueta()) > 0) {

            if (this.getHijoDer() != null) {

                this.setHijoDer(this.getHijoDer().eliminar(unaEtiqueta));

            }
            return this;
        }

        return this.quitaElNodo();
    }

    private TElementoAB<T> quitaElNodo() {

        if (this.getHijoIzq() == null) {
            return this.getHijoDer();
        }

        if (this.getHijoDer() == null) {
            return this.getHijoIzq();
        }

        // es un nodo completo
        TElementoAB<T> hijo = this.getHijoIzq();
        TElementoAB<T> padre = this;

        while (hijo.getHijoDer() != null) {
            padre = hijo;
            hijo = hijo.getHijoDer();
        }

        if (padre != null) {
            padre.setHijoDer(hijo.getHijoIzq());
            hijo.setHijoIzq(hijoIzq);
        }

        hijo.setHijoDer(hijoDer);
        return hijo;
    }

    public int obtenerNivel(Comparable unaEtiqueta) {
        if (unaEtiqueta.equals(etiqueta)) {
            return 0;
        } else if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return 1 + getHijoIzq().obtenerNivel(unaEtiqueta);
            } else {
                return 0;
            }
        } else if (hijoDer != null) {
            return 1 + getHijoDer().obtenerNivel(unaEtiqueta);
        } else {
            return 0;
        }

    }

    public Comparable obtenerMenorClave() {
        if (hijoIzq == null) {
            return this.getEtiqueta();
        }
        return hijoIzq.obtenerMenorClave();
    }

    public Comparable obtenerMayorClave() {
        if (hijoDer == null) {
            return this.getEtiqueta();
        }
        return hijoDer.obtenerMayorClave();
    }

    public Comparable obtenerClaveAnterior(Comparable clave) {
        if (clave.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                if (hijoIzq.getEtiqueta().equals(clave)) {
                    return etiqueta;
                }
                return hijoIzq.obtenerClaveAnterior(clave);
            }
        } else if (clave.compareTo(etiqueta) > 0) {
            if (hijoDer != null) {
                if (hijoDer.getEtiqueta().equals(clave)) {
                    return etiqueta;
                }
                return hijoDer.obtenerClaveAnterior(clave);
            }
        }
        return null;
    }

    public int nodoNivel(int n, int nivel) {
        if (n == nivel) {
            return 1;
        }
        int cant = 0;
        if (hijoIzq != null) {
            cant = hijoIzq.nodoNivel(n + 1, nivel);
        }
        if (hijoDer != null) {
            cant += hijoDer.nodoNivel(n + 1, nivel);
        }
        return cant;
    }

    public void listarHoja(int n) {
        if (hijoIzq == null && hijoDer == null) {
            System.out.println("Etiqueta: " + etiqueta + ", Nivel: " + n);
        }
        if (hijoIzq != null) {
            hijoIzq.listarHoja(n + 1);
        }
        if (hijoDer != null) {
            hijoDer.listarHoja(n + 1);
        }
    }

    public boolean verificarArbol() {
        boolean verificar = true;
        if (hijoIzq != null) {
            if (hijoIzq.getEtiqueta().compareTo(etiqueta) > 0) {
                verificar = false;
            } else {
                verificar = hijoIzq.verificarArbol();
            }
        }
        if (hijoDer != null && verificar) {
            if (hijoDer.getEtiqueta().compareTo(etiqueta) < 0) {
                verificar = false;
            } else {
                verificar = hijoDer.verificarArbol();
            }
        }
        return verificar;
    }
}
