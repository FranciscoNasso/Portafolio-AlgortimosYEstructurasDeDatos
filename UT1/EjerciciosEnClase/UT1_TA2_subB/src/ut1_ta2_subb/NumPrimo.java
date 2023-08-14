/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_ta2_subb;

/**
 *
 * @author Luana
 */
public class NumPrimo {
    public static boolean NumPrimo(long n) {
    boolean prime = true;
    long i = 3;
    while ( i <= Math.sqrt(n)){
        i+=2;
        if (n % i == 0) {
        prime = false;
        break;
        }
    }
    if (( n%2 !=0 && prime && n > 2) || n == 2) {
    return true;
    } else {
    return false;
    }
    }
}
