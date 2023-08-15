public class Main {
/*


  Codigo con errores

  public static void main(String[] args) {
// this program requires two
// arguments on the command line
        if (args.length == 3) {
// convert strings to numbers
            float a = (Float.value (args[0])).floatValue();
            float b = (Float.valueOf(args[1])).float ();
// do some arithmetic
            System.out.println("a + b = " +
                    (a + b));
            System.out.println("a - b = " +
                    (a - b));
            System.out.println("a * b = " +
                    (a * b));
            System.out.println("a / b = " +
                    (a / b));
            System.out.println("a % b = " +
                    (a % b));
        } else {
            System.out.println("This program " +
                    "requires two command-line arguments.");
        }
    }

}

 */

// Codigo Solucionado:

    public static void main(String[] args) {
// this program requires two
// arguments on the command line
        if (args.length == 3) {
// convert strings to numbers
            float a = (Float.valueOf(args[0])).floatValue();
            float b = (Float.valueOf(args[1])).floatValue();
// do some arithmetic
            System.out.println("a + b = " +
                    (a + b));
            System.out.println("a - b = " +
                    (a - b));
            System.out.println("a * b = " +
                    (a * b));
            System.out.println("a / b = " +
                    (a / b));
            System.out.println("a % b = " +
                    (a % b));
        } else {
            System.out.println("This program " +
                    "requires two command-line arguments.");
        }
    }
}


// Parte 1: El resultado es el siguiente:
//  a + b = 79.5
//  a - b = -52.7
//  a * b = 886.14
//  a / b = 0.20242468
//  a % b = 13.4


// Parte 2

/*
public class ValueOfDemo {
    public static void main(String[] args) {
    // this program requires two
    // positive integer arguments on the command line
    if (args.length == 2) {
    // convert strings to numbers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a >= 0 && b >= 0) {
            // do some arithmetic
            System.out.println("a + b = " +
            (a + b));
            System.out.println("a - b = " +
            (a - b));
            System.out.println("a * b = " +
            (a * b));
            if (b != 0) {
                System.out.println("a / b = " +
                (a / b));
                System.out.println("a % b = " +
                (a % b));
            } else {
                System.out.println("Cannot divide by zero");
                }
        } else {
            System.out.println("Both arguments must be positive integers");
        }
        } else {
            System.out.println("This program " +
            "requires two positive integer command-line arguments.");
        }
    }
}


 */