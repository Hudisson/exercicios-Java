/**
 * @author Hudisson Xavier
 * 
 * Execício 05:
 *     Inverter uma String
 */

package com.hudisson.exercise.fundamentos;

public class textReverse {
    
    public static String StringReverse(String txt){

        return new StringBuilder(txt).reverse().toString();
    }

     public static void main(String[] args){


        String meuTexto = "Java"; // saída -> avaJ

        System.out.println("\nInverter um texto");

        System.out.println(meuTexto+ " -> "+StringReverse(meuTexto)); 

     }
}
