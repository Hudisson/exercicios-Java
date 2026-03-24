/**
 * @author Hudisson Xavier
 * 
 * Execício 10:
 *    Verificar se uma palavra é palíndromo
 *    Obs.: remove os possíveis acentos das palvras para depois comparar se é um palíndromo
 */

package com.hudisson.exercise.estruturasDeDados;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Palindromo {
    
    /**
     * Método que compara se uma palavra é um palíndromo
     * @param str
     * @return boolean
     */
    public static boolean isPalindromo(String str){

        str = removerAcentos(str).toLowerCase(); // remove os acentos, se houver.

        String rstr = new StringBuilder(str).reverse().toString(); // inverte o texto

        // compara se o palavra invertida é igual à palvara inicial
        if(!rstr.equals(str)){
            return false; // retorna falso se NÃO for um palíndromo
        }

        return true; // retona verdadeiro se for um palíndromo
    }

    /**
     * Método que remover acentos de uma palavra, se houver acentos na palavra
     * @param str
     * @return string
     */
    public static String removerAcentos(String str){

        if (str == null) return null;

        // Normaliza para decompor caracteres acentuados
        String strSemAcentos = Normalizer.normalize(str, Normalizer.Form.NFD);

        // Remove os acentos
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

        return pattern.matcher(strSemAcentos).replaceAll("");
    }

    public static void main(String[] args){

        System.out.println("\n--------Verificar se uma palavra é palíndromo---------");
        
        /**
         * Exemplos:
         * arara -> SIM é um palíndromo
         * café -> NÃO é um palíndromo
         */

        String palavra = "arara"; 

        if(isPalindromo(palavra)){

            System.out.println("\nSIM, a palavra "+palavra+" é um palíndromo");

        }else{

            System.out.println("\nNÃO, a palavra "+palavra+" não é um palíndromo");
        }

        System.out.println("\n---------------------------------------------------------");

    }

}
