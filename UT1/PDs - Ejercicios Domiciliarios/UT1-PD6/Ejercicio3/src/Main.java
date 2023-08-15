import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


// Parte a
public class Main {

        public static void main(String[] args) {
            String entrada = "entrada.txt";
            String salida = "salida.txt";

            try {
                Map<Character, String> t9map = transformarT9Texto();
                BufferedReader reader = new BufferedReader(new FileReader(entrada));
                FileWriter writer = new FileWriter(salida);
                String linea;
                while ((linea = reader.readLine()) != null) {
                    for (int i = 0; i < linea.length(); i++) {
                        char caracter = linea.charAt(i);
                        String digitos = t9map.get(Character.toUpperCase(caracter));
                        if (digitos != null) {
                            writer.write(digitos);
                        }
                    }
                    writer.write(System.lineSeparator());
                }
                reader.close();
                writer.close();
            } catch (IOException e) {
                System.out.println("Error al leer o escribir archivos.");
                e.printStackTrace();
            }
        }

        public static Map<Character, String> transformarT9Texto() {
            Map<Character, String> t9map = new HashMap<Character, String>();
            t9map.put('A', "2");
            t9map.put('B', "22");
            t9map.put('C', "222");
            t9map.put('D', "3");
            t9map.put('E', "33");
            t9map.put('F', "333");
            t9map.put('G', "4");
            t9map.put('H', "44");
            t9map.put('I', "444");
            t9map.put('J', "5");
            t9map.put('K', "55");
            t9map.put('L', "555");
            t9map.put('M', "6");
            t9map.put('N', "66");
            t9map.put('O', "666");
            t9map.put('P', "7");
            t9map.put('Q', "77");
            t9map.put('R', "777");
            t9map.put('S', "7777");
            t9map.put('T', "8");
            t9map.put('U', "88");
            t9map.put('V', "888");
            t9map.put('W', "9");
            t9map.put('X', "99");
            t9map.put('Y', "999");
            t9map.put('Z', "9999");
            t9map.put(' ', "0");
            t9map.put('.', "1");
            return t9map;
        }



        // parte B

        /*
        import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {
        String rutaArchivo = "entrada.txt";
        transformarT9Texto(rutaArchivo);
    }

    public static void transformarT9Texto(String rutaArchivo) {
        String[] t9 = { "0", "1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9" };
        Map<Character, String> map = new HashMap<>();

        for (String s : t9) {
            char c = s.charAt(s.length() - 1);
            for (int i = 0; i < s.length() - 1; i++) {
                map.put(s.charAt(i), String.valueOf(c));
            }
        }

        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String reversed = sb.reverse().toString();
        StringBuilder sbT9 = new StringBuilder();
        for (char c : reversed.toCharArray()) {
            sbT9.append(map.get(c));
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"))) {
            bw.write(sbT9.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
}