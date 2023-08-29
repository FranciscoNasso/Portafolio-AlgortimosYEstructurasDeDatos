public class Lista<T>{

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }


    public void push(Nodo<T> nodo) {
        if (esVacia()) {
            primero = nodo;
        } else {
            nodo.setSiguiente(primero);
            primero = nodo;
        }
    }

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

    public void pop() {
        Nodo aux = primero;
        primero = primero.getSiguiente();
        aux.setSiguiente(null);
    }

    public String imprimir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }


    public String imprimir(String separador) {
        String aux = "";
        if (esVacia()){
            return "";
        } else {
            Nodo<T> temp = primero;
            while (temp != null){
                aux = aux + separador + temp.getEtiqueta();
                temp = temp.getSiguiente();
            }
            return aux;
        }
    }


    public int cantElementos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cantElementos'");
    }


    public boolean esVacia() {
        if (primero == null){
            return true;
        } else {
            return false;
        }

    }


    public void setPrimero(Nodo<T> unNodo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrimero'");
    }


    // implementar los metodos indicados en la interfaz
}
