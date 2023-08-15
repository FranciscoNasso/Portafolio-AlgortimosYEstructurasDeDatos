public class Main {
    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);
        int dot = s.indexOf('.');
        System.out.println(dot + " digits " +
                "before decimal point.");
        System.out.println( (s.length() - dot - 1) +
                " digits after decimal point.");
    }
}

// Parte 1
// Resultado:  3 digits before decimal point.
//             2 digits after decimal point.

// Parte 2
// Entiendo yo que se imprimen los datos porque tiene que imprima el texto y lo que imprime es cuanto valores ahy antes del punto y despues cuantos hay despues del punto.