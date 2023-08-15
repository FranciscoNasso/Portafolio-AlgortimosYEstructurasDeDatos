public class Main {
    public static void main(String[] args) {

        int num = 10; //Aca colocar el numero

        boolean checkIsPrime = Lib.isPrime(num);

        int i = 0;
        int suma = 0;

        if (checkIsPrime) {
            while (i <= num) {
                if (i % 2 == 0) {
                    suma += i;
                }
                i++;
            }
            System.out.println("El numero es primo");
            System.out.println("La suma de los pares hasta el numero es: " + suma);
        }
        else {
            while (i <= num) {
                if (!(i % 2 == 0)) {
                    suma += i;
                }
                i++;
            }
            System.out.println("El numero no es primo");
            System.out.println("La suma de los impares hasta el numero es: " + suma);
        }
    }
}