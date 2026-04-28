/**
 * Exercício 18: Verificar se duas palvaras são anagramas
 *   Daso duas palavaras verifique se são anagrams entre si.
 *   Exemplo: roma - amor
 */

package com.hudisson.exercise.poo.anagramas;

import java.util.Arrays;

public class Anagramas {
    
    // Método para verificar se duas palavras são anagramas
    public static boolean isAnagramas(String p1, String p2){
        // Remover espaços e deixar tudo em minúsculos
        p1 = p1.replaceAll("\\s","").toLowerCase();
        p2 = p2.replaceAll("\\s","").toLowerCase();

        // Se tiverem tamanho diferentes, então não são anagras
        if(p1.length() != p2.length()){
            return false;
        }

        // Coverter para array de caracteres
        char[] arr1 = p1.toCharArray();
        char[] arr2 = p2.toCharArray();

        // Ordenar os arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Comparar os array
        return Arrays.equals(arr1, arr2);
    }

    // Método para montar a resposta
    public static void saoAnagramas(String s1, String s2){

        if (isAnagramas(s1, s2)) {
            System.out.println("[ "+ s1 + " e " + s2 +" ] " + "São anagramas!");
        } else {
            
            System.out.println("[ "+ s1 + " e " + s2 +" ] " + "Não são anagramas");
        }

    }

}
