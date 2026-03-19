/**
 * @author Hudisson Xavier
 * 
 * Execício 07:
 *    Encontrar o maior e o menor número de um array de números inteiros
 */

package com.hudisson.exercise.estruturasDeDados;

public class ArraySearch {
    
    public static int findMax(int[] valores){
        
        int mairoValor = valores[0];

        for(int i = 1; i < valores.length; i++){
            if(valores[i] > mairoValor){
                mairoValor = valores[i];
            }
        }

        return mairoValor;
    }

    public static int findMin(int[] valores){

        int menorValor = valores[0];

        for(int i = 1; i < valores.length; i++){
            if(valores[i] < menorValor){
                menorValor = valores[i];
            }
        }

        return menorValor;
    }

    public static String readArray(int[] valores){
        
        StringBuilder arrayText = new StringBuilder();

        arrayText.append("[ "); // Isso tem 2 caracteres: [ -> 1; epaço-em-branco -> 1

        for(int i = 0; i < valores.length; i++){
        
            if(arrayText.length() > 2){ // Essa condição serve para saber se já foi adicionado pelo menos um número no array
                arrayText.append("; "); // Se length > 2 -> já tem algum número -> precisa adicionar separador "; "
            }

            arrayText.append(valores[i]);
            
        }

        arrayText.append(" ]");

        return arrayText.toString();
    }

    public static void main(String[] args){

        System.out.println("\n--------Encontrar o maior número de um array---------");

        int[] meuArray = {785, 876, 789, 986, 347, 173, 89, 598};

        System.out.println("\nValore: "+readArray(meuArray));
        System.out.println("Maior valor no array: "+findMax(meuArray));
        System.out.println("Menor valor no array: "+findMin(meuArray));

        System.out.println("\n---------------------------------------------------------");

    }
}
