
public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB<T> hijoIzq;
    private TElementoAB<T> hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    public TElementoAB<T> getHijoIzq() {
        return hijoIzq;
    }

    public TElementoAB<T> getHijoDer() {
        return hijoDer;
    }

    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
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

    public boolean esHoja() {
        return (this.hijoIzq == null && this.hijoDer == null);
    }

    /**
     * @param unElemento
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        cantidadInserciones++;
        if (unElemento.getEtiqueta().compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().insertar(unElemento);
            } else {
                hijoIzq = unElemento;
                return true;
            }
        } else if (unElemento.getEtiqueta().compareTo(etiqueta) > 0) {
            if (hijoDer != null) {
                return getHijoDer().insertar(unElemento);
            } else {
                hijoDer = unElemento;
                return true;
            }
        } else {
            // ya existe un elemento con la misma etiqueta.-
            return false;
        }
    }

    public boolean insertar(TElementoAB<T> unElemento, int contador) {
        cantidadInserciones = contador;
        return insertar(unElemento);
    }

    public int cantidadInserciones;

    public void getCantidadInserciones() {
        System.out.println(cantidadInserciones);
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

    /**
     * @param unaEtiqueta
     * @return
     */
    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {

        if (unaEtiqueta.equals(etiqueta)) {
            return this;
        } else if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().buscar(unaEtiqueta);
            } else {
                return null;
            }
        } else if (hijoDer != null) {
            return getHijoDer().buscar(unaEtiqueta);
        } else {
            return null;
        }
    }

    public TElementoAB<T> buscar(Comparable unaEtiqueta, int[] comparacion) {

        comparacion[0] = comparacion[0] + 1;

        if (unaEtiqueta.equals(etiqueta)) {
            return this;
        } else if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().buscar(unaEtiqueta, comparacion);
            } else {
                comparacion[0] = -1;
                return null;

            }
        } else if (hijoDer != null) {
            return getHijoDer().buscar(unaEtiqueta, comparacion);
        } else {
            comparacion[0] = -1;
            return null;

        }
    }

    /**
     * @return recorrida en inorden del subArbol que cuelga del elemento actual
     */
    @Override
    public String inOrden() {
        StringBuilder sb = new StringBuilder("");

        // hijoIzq, padre y hijoDer
        if (this.getHijoIzq() != null) {
            sb.append(this.getHijoIzq().inOrden());
        }
        sb.append(this.getEtiqueta() + " ");
        if (this.getHijoDer() != null) {
            sb.append(this.getHijoDer().inOrden());
        }
        return sb.toString();

    }

    @Override
    public void inOrden(Lista<T> unaLista) {
        // hijoIzq, padre y hijoDer
        if (this.getHijoIzq() != null) {
            unaLista.insertar(new Nodo<T>(this.getHijoIzq().getEtiqueta(), this.getHijoIzq().getDatos()));
            this.getHijoIzq().inOrden(unaLista);
        }
        unaLista.insertar(new Nodo<T>(this.getEtiqueta(), this.getDatos()));
        if (this.getHijoDer() != null) {
            unaLista.insertar(new Nodo<T>(this.getHijoDer().getEtiqueta(), this.getHijoDer().getDatos()));
            this.getHijoDer().inOrden(unaLista);
        }
    }

    @Override
    public int obtenerAltura() {
        int alturaIzq = 0;
        int alturaDer = 0;
        if (this == null) {
            return 0;
        }
        if (this.getHijoIzq() != null) {
            alturaIzq = this.getHijoIzq().obtenerAltura();
        }
        if (this.getHijoDer() != null) {
            alturaDer = this.getHijoDer().obtenerAltura();
        }

        return 1 + Math.max(alturaIzq, alturaDer);
    }

    @Override
    public int obtenerTamanio() {
        int tamanoIzq = 0;
        int tamanoDer = 0;
        //para obtener el tamaño de un nodo, se debe tener el tamaño de sus hijos + 1
        //entonces se debe recorrer en post orden(hijoIzq, hijoDer, padre)

        if (this.getHijoIzq() != null) {
            tamanoIzq = this.getHijoIzq().obtenerTamanio();
        }

        if (this.getHijoDer() != null) {
            tamanoDer = this.getHijoDer().obtenerTamanio();
        }

        return tamanoIzq + tamanoDer + 1;
    }

    @Override
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
    
    @Override
    public int obtenerCantidadHojas() {
        if (this.esHoja()) {
            return 1;
        } else {
            int cont = 0;
            if (this.hijoIzq != null) {
                cont = this.hijoIzq.obtenerCantidadHojas();
            }
            if (this.hijoDer != null) {
                cont += this.hijoDer.obtenerCantidadHojas();
            }
            return cont;
        }
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

}
