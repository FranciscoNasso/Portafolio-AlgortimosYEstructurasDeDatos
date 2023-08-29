/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernesto
 * @param <T>
 */
public class Conjunto<T> implements IConjunto<T> {
// MEJOR: public class Conjunto<T> extends ListaOrdenada<T> implements IConjunto {
    private Nodo<T> primero;

    public Conjunto() {
        primero = null;
    }
    
    @Override
    public IConjunto<T> union(IConjunto<T> otroConjunto){
        Conjunto<T> resultado = new Conjunto<T>();
        
        // Copiar los elementos del primer conjunto al resultado
        Nodo<T> actual = this.primero;
        while (actual != null) {
            if (resultado.buscar(actual.getEtiqueta()) == null) {
                resultado.insertar(actual.getEtiqueta(), actual.getDato());
            }
            actual = actual.getSiguiente();
        }
        
        // Copiar los elementos del segundo conjunto al resultado, evitando duplicados
        actual = otroConjunto.getPrimero();
        while (actual != null) {
            if (resultado.buscar(actual.getEtiqueta()) == null) {
                resultado.insertar(actual.getEtiqueta(), actual.getDato());
            }
            actual = actual.getSiguiente();
        }
        
        return resultado;
    }
    
    @Override
    public IConjunto<T> interseccion(IConjunto<T> otroConjunto){
        Conjunto<T> resultado = new Conjunto<T>();
        // Iterar sobre los elementos del primer conjunto
        Nodo<T> actual = this.primero;
        while (actual != null) {
            // Si el elemento también está en el segundo conjunto, agregarlo al resultado
            if (resultado.buscar(actual.getEtiqueta()) == null && otroConjunto.buscar(actual.getEtiqueta()) != null) {
                resultado.insertar(actual.getEtiqueta(), actual.getDato());
            }
            actual = actual.getSiguiente();
        }
        
        return resultado;
    }
    
    public void insertar(Comparable etiqueta, T dato) {
        Nodo<T> nodo = new Nodo<T>(etiqueta, dato);
        this.insertar(nodo);
    }

    @Override
    public void insertar(Nodo<T> unNodo) {
        if (esVacia()) {
            primero = unNodo;
        } else {
            Nodo<T> aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(unNodo);
        }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        if (esVacia()) {
            return null;
        } else {
            Nodo<T> aux = primero;
            while (aux != null) {
                if (aux.getEtiqueta().equals(clave)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if (esVacia()) {
            return false;
        }
        if (primero.getSiguiente() == null) {
            if (primero.getEtiqueta().equals(clave)) {
                primero = null;
                return true;
            }
        }
        Nodo<T> aux = primero;
        if (aux.getEtiqueta().compareTo(clave) == 0) {
            //Eliminamos el primer elemento
            Nodo<T> temp1 = aux;
            Nodo<T> temp = aux.getSiguiente();
            primero = temp;
            return true;
        }
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getEtiqueta().equals(clave)) {
                Nodo<T> temp = aux.getSiguiente();
                aux.setSiguiente(temp.getSiguiente());
                return true;

            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    @Override
    public String imprimir() {
        String aux = "";
        if (!esVacia()) {
            Nodo<T> temp = primero;
            while (temp != null) {
                temp.imprimirEtiqueta();
                temp = temp.getSiguiente();
            }
        }
        return aux;
    }

    @Override
    public String imprimir(String separador) {
        String aux = "";
        if (esVacia()) {
            return "";
        } else {
            Nodo<T> temp = primero;
            aux = "" + temp.getEtiqueta();
            while (temp.getSiguiente() != null) {
                aux = aux + separador + temp.getSiguiente().getEtiqueta();
                temp = temp.getSiguiente();
            }

        }
        return aux;

    }

    @Override
    public int cantElementos() {
        int contador = 0;
        if (esVacia()) {
            System.out.println("Cantidad de elementos 0.");
            return 0;
        } else {
            INodo aux = primero;
            while (aux != null) {
                contador++;
                aux = aux.getSiguiente();
            }
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    @Override
    public Nodo<T> getPrimero() {
        return primero;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        this.primero = unNodo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Alumno alumno;
        if (!esVacia()) {
            Nodo<T> temp = primero;
            alumno = (Alumno) temp.getDato();
            sb.append(alumno.getCodigo()).append(",").append(alumno.getNombre());
            temp = temp.getSiguiente();
            while (temp != null) {
                sb.append(" ");
                alumno = (Alumno) temp.getDato();
                sb.append(alumno.getCodigo()).append(",").append(alumno.getNombre());
                temp = temp.getSiguiente();
            }
        }
        return sb.toString();
    }
}
