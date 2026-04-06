/**
 * @author Hudisson Xavier
 * 
 * Execício 16:
 *   Dois números que somam um alvo
 *      Dado um array de inteiros nums e um inteiro alvo, retorne os índices dos dois números de forma que eles se somem para o alvo.
 *      Exemplo:
 *          nums = [2,7,11,15]
 *          target = 9
 *          Saída: [2,7]
 */

package com.hudisson.exercise.poo.TwoSum;

import java.util.ArrayList;

public class app {
    
    public static void main(String[] args) {
        System.out.println("\n-----------Dois números que somam um alvo------------");

        int alvo = 17;
        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(2);
        valores.add(7);
        valores.add(11);
        valores.add(15);

        TwoSumSolver s1 = new TwoSumSolver(alvo, valores);
        
        System.out.println("\nConjunto de valores: " + valores);
        System.out.println("Alvo: " + alvo);
        System.out.println("Resultado: " + s1.solve());


        System.err.println("\n---------------------Fim do exercício--------------------\n");
        
    }

}
