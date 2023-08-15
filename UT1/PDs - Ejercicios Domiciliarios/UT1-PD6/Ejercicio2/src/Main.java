import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Parte A
        String archivo = "./Ejercicio2.txt";

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            int entero_leido = Integer.parseInt(lector.readLine().trim());
            double flotante_leido = Double.parseDouble(lector.readLine().trim());
            String cadena_leida = lector.readLine().trim();

            System.out.println("El entero leído es: " + entero_leido);
            System.out.println("El número de punto flotante es: " + flotante_leido);
            System.out.println("La cadena leída es: " + cadena_leida);
        } catch (IOException e) {
            System.out.println("No se pudo abrir el archivo " + archivo);
        } catch (NumberFormatException e) {
            System.out.println("El archivo " + archivo + " contiene un formato inválido");
        }

        // Parte B

        double radio = leerEntradaStdin();
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área es: " + area);
        System.out.println("El perímetro es: " + perimetro);
    }
    public static double leerEntradaStdin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        scanner.close();
        return radio;
    }
}

