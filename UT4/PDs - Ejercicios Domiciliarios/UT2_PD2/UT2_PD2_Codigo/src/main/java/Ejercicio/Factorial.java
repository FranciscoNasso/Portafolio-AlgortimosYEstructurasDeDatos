/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ejercicio;

/**
 *
 * @author Nacho
 */
public class Factorial {

    public static void main(String[] args) {
        int[] arr = {};
        
        System.out.println(Factorial(5));
        System.out.println(sumaLineal(arr, 0));
    }

    public static int Factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        return num * Factorial(num - 1);
    }

    public static int sumaLineal(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return arr[n - 1] + sumaLineal(arr, n - 1);
        }
    }

}
