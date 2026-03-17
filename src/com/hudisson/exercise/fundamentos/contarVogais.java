/**
 * @author Hudisson Xavier
 * 
 * Execício 06:
 *     Contar vogais em uma String 
 *     Vogais [a, e, i, o, u]
 */

package com.hudisson.exercise.fundamentos;

public class contarVogais {
    
    // Méto que retorna a quantidade de vogais de uma string
    public static int countVowels(String texto){

        String[] letras = texto.toLowerCase().split("");
        int conatador = 0;

        for(int i = 0; i <= (letras.length -1); i++){
          String ch = letras[i];

          if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")){
            conatador++;
          }

        }
        
        return conatador;
    }

    public static void main(String[] args){

        String txt = "Java"; // sáida 2

        System.out.println("\n-----Contado vogais em um texto-----");

        System.out.println("\nTexto: "+ txt);
        System.out.println("Quantidade de vogais: "+countVowels(txt));
        System.out.println("\n------------------------------------------------\n");
    }

}
