/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_ta2_subb;

/**
 *
 * @author Luana
 */
public class Factorial {

    public static int factorial(int n){
            if (n==0){
                return 1;
            }else{
                int resultado = 1;
                for(int i=1; i<=n; i++){
                    resultado*=i;
                }
                return resultado;
            } 
        }
}

