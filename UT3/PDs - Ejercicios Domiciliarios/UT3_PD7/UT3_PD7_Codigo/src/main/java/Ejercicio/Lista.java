package Ejercicio;

public class Lista<T> implements ILista<T> {
    
    private Nodo<T> primero;

    public Lista() {
        this.primero = null;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
        if (this.esVacia()) {
            this.primero = nodo;
        } else {
            Nodo<T> actual = this.primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }
    }

    @Override
    public void insertar(Comparable etiqueta, T dato) {
        Nodo<T> nodo = new Nodo<T>(etiqueta, dato);
        this.insertar(nodo);
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        Nodo<T> actual = this.primero;
        while (actual != null && actual.getEtiqueta().compareTo(clave) != 0) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        boolean eliminado = false;
        if (!this.esVacia()) {
            if (this.primero.getEtiqueta().compareTo(clave) == 0) {
                this.primero = this.primero.getSiguiente();
                eliminado = true;
            } else {
                Nodo<T> actual = this.primero.getSiguiente();
                Nodo<T> anterior = this.primero;
                while (actual != null && !eliminado) {
                    if (actual.getEtiqueta().compareTo(clave) == 0) {
                        anterior.setSiguiente(actual.getSiguiente());
                        eliminado = true;
                    } else {
                        anterior = actual;
                        actual = actual.getSiguiente();
                    }
                }
            }
        }
        return eliminado;
    }

    @Override
    public String imprimir() {
        String resultado = "";
        Nodo<T> actual = this.primero;
        while (actual != null) {
            resultado += actual.getEtiqueta() + "\n";
            actual = actual.getSiguiente();
        }
        return resultado;
    }

    @Override
    public String imprimir(String separador) {
        String resultado = "";
        Nodo<T> actual = this.primero;
        while (actual != null) {
            resultado += actual.getEtiqueta() + separador;
            actual = actual.getSiguiente();
        }
        
        System.out.println(resultado);
        return resultado;
    }

    @Override
    public int cantElementos() {
        int contador = 0;
        Nodo<T> actual = this.primero;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return this.primero == null;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        this.primero = unNodo;
    }

    @Override
    public Nodo<T> getPrimero() {
        return this.primero;
    }
    
    
}
