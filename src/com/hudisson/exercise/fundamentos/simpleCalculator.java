/**
 * @author Hudisson Xavier
 * 
 * Execício 01: 
 *      Crie um programa que receba dois números e uma operação (+ - * /) e retorne o resultado.
 */
package com.hudisson.exercise.fundamentos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class simpleCalculator {
 
    public static double Addition(double a, double b){
        return a + b;
    }

    public static double Subtraction(double a, double b){
        return a - b;
    }

    public static double Multiplication(double a, double b){
        return a * b;
    }

    public static double Division(double a, double b){

        // Não é permitido divisão por zero
        if (b == 0) {
            return Double.NaN;
        }

        return a/b;
    }

    public static void main(String[] args){

        System.out.println("=======================Simple Calculator=================================");

        Scanner scan = new Scanner(System.in);

        double valor_a, valor_b;

        System.out.println("Digite o primeiro valor: ");
        valor_a = scan.nextDouble();

        System.out.println("Digite o segundo valor: ");
        valor_b = scan.nextDouble();

        System.out.println("Escolha uma operação: (+, -, *, /)");
        String operacao = scan.next();

        DecimalFormat df = new DecimalFormat("#.00");
        
        switch (operacao) {
            case "+":
               System.out.println("Resultado: "+ df.format(Addition(valor_a, valor_b)));
               break;
            case "-":
                
                System.out.println("Resultado: "+ df.format(Subtraction(valor_a, valor_b)));
                break;
            
            case "*":
                System.out.println("Resultado: "+ df.format(Multiplication(valor_a, valor_b)));
                break;

            case "/":
                System.out.println("Resultado: "+ df.format(Division(valor_a, valor_b)));
                break;

            default:
                System.out.println("Operação inválida");
                break;
        
        }

        System.out.println("=============================================================");

        scan.close();

    }
}
