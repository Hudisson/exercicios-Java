/**
 * @author Hudisson Xavier
 * 
 * Execício 02:
 *  Receba um número e informe se é par ou ímpar. 
 * 
 * Um número é classificado como par quando o resto da sua divisão por 2 é exatamente 0. 
 * Caso o resto seja diferente de zero (geralmente 1), o número é ímpar.
 * 
 * A paridade de um número inteiro é determinada pelo operador de módulo (%). Se n % 2 == 0, 
 * o valor é par; caso contrário, é ímpar.
 * 
 *  *  D -> Dividendo;
 *  d -> divisor;
 *  q -> quociente;
 *  r -> resto;
 *  
 *  D = d * q + r;
 */
package com.hudisson.exercise.fundamentos;

import java.util.Scanner;

public class EvenOddValidator {

    public static int divisor = 2;
    
    /**
     * Método re retorna um texto informando se um número é par ou impa
     * @param valor
     * @return
     */
    public static String EvenOrOdd(int valor){

        if(valor %divisor == 0){
            return "Par";
        }

        return "Impar";
    }

    /**
     * Método que retorna o quociente (Q) da divisão
     * @param valor
     * @return 
     */
    public static int Quociente(int valor){
        return valor/divisor;
    }

    /**
     * Método que retorna o resto (R) da divisão
     * @param valor
     * @return
     */
    public static int Resto(int valor){
        return valor%divisor;
    }

    public static void main(String[] args){

        System.out.println("=======================Even Or Odd=================================");
        Scanner scan = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite o número: ");
        numero = scan.nextInt();

        System.out.println("O número "+ numero + " é "+ EvenOrOdd(numero));
        System.out.println("Dividendo..(D): "+ numero);
        System.out.println("Divisor....(d): "+ divisor);
        System.out.println("Quociente..(Q): "+ Quociente(numero));
        System.out.println("Resto......(R): "+ Resto(numero));
        System.out.println("D = d * Q + R => "+numero+" = "+divisor+" * "+Quociente(numero)+" + "+ Resto(numero));

        scan.close();
    }

}
