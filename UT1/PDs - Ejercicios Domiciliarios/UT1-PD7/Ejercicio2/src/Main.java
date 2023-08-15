public class Main {
    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "Hola";
        if ( s1 == s2 ) {
            System.out.println( "True" );
        } else {
            System.out.println( "False" );
        }

        // En este caso se ejecuta True

        String s3 = new String("Hola");
        String s4 = "Hola";
        if ( s1 == s2 ) {
            System.out.println( "True" );
        } else {
            System.out.println( "False" );
        }

        // Se ejecuta el caso true

    }

    // Parte 2
    // codigo correcto

    /*String s1 = "Hola";
    String s2 = "Hola";
        if ( s1.equals(s2) ) {
        System.out.println( "True" );
    } else {
        System.out.println( "False" );
    }

     */
}