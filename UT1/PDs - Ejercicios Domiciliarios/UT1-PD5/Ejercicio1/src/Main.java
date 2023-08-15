public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    // Parte 1
    enum DiasDeLaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
    }

    DiasDeLaSemana[] dias = DiasDeLaSemana.values();



    // Parte 2
    enum TipoDeLetra {
        VOCALES, CONSONANTES;
    }
    TipoDeLetra obtenerTipoDeLetra(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return TipoDeLetra.VOCALES;
        } else {
            return TipoDeLetra.CONSONANTES;
        }
    }

    void contarVocalesYConsonantes(String frase) {
        int numVocales = 0;
        int numConsonantes = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            TipoDeLetra tipo = obtenerTipoDeLetra(c);

            if (tipo == TipoDeLetra.VOCALES) {
                numVocales++;
            } else {
                numConsonantes++;
            }
        }

        System.out.println("Número de vocales: " + numVocales);
        System.out.println("Número de consonantes: " + numConsonantes);
    }


}