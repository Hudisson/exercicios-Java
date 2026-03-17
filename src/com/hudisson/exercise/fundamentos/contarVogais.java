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

    // método que retorna as voagais do texto
    public static String vowelsText(String texto){
        String[] letras = texto.toLowerCase().split("");
        StringBuilder vogais = new StringBuilder();

        for(int i = 0; i <= (letras.length -1); i++){
            String ch = letras[i];

          if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")){
                if(vogais.length() > 0){
                    vogais.append("; ");
                }
                vogais.append(letras[i]);
                
          }
        }

        return vogais.toString();
    }

    public static void main(String[] args){

        String txt = "Casinha";

        System.out.println("\n-----Contado vogais em um texto-----");

        System.out.println("\nTexto: "+ txt);
        System.out.println("Quantidade de vogais: "+countVowels(txt));
        System.out.println("Vogais: "+vowelsText(txt));
        System.out.println("\n------------------------------------------------\n");
    }

}
