/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut1_ta2_subb;

/**
 *
 * @author Luana
 */
public class UT1_TA2_subB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new NumPrimo();
        new Factorial();
        System.out.println(NumPrimo.NumPrimo(20));
        System.out.println(NumPrimo.NumPrimo(7));
        System.out.println(NumPrimo.NumPrimo(0));
        
        System.out.println(Factorial.factorial(5));
        System.out.println(Factorial.factorial(0));
    }
    
}
