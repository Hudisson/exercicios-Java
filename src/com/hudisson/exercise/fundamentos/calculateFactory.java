/**
 * @author Hudisson Xavier
 * 
 * Execício 04:
 *   Faça um programa que calcule o fatorial de um número.
 *   O fatorial é uma operação matemática que multiplica um número inteiro positivo por todos 
 *   os inteiros positivos menores que ele até 1.
 *   Definição - Para um número inteiro não negativo n:
 *         n! = n×(n−1)×(n−2)×⋯×1
 *   Exemplo:
 *      Calcular o fatorial de 5 (5!):
 *          5! = 5 * 4 * 3 * 2 * 1 = 120
 */
package com.hudisson.exercise.fundamentos;

public class calculateFactory {

    public static int calcularFatorial(int numero){

        int fatorial = 1;

        // O fatorial é definido apenas para inteiros não negativos
        if(numero < 0){
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }

        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args){

        System.out.println("=======================Calcular Fatorial=================================");

        int numero = 5;

        System.out.println("\nO fatorial de  "+ numero + " é "+ calcularFatorial(numero) + "\n");
    }

}
