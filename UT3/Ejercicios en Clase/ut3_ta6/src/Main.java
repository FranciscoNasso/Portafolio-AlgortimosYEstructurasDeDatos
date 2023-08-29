import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ManejadorArchivosGenerico manejadorArchivosGenerico = new ManejadorArchivosGenerico();
        String[] lineas = manejadorArchivosGenerico.leerArchivo("entradas.txt");
        for (String linea: lineas){
            Lista pila = new Lista();
            for (int i = 0; i < linea.length(); i++){
                if (linea.charAt(i) == '{'){
                    pila.push(new Nodo(3,3));
                } else if (linea.charAt(i) == '}'){
                    if (!pila.esVacia()){
                        pila.pop();
                    } else {
                        System.out.println(false);
                    }
                }

            }
            if(pila.esVacia()){
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        }
    }
}