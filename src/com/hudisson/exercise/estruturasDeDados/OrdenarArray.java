/**
 * @author Hudisson Xavier
 * 
 * Execício 11:
 *   Ordenar um array (sem usar sort)
 */

package com.hudisson.exercise.estruturasDeDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdenarArray {
    
    public static List<Integer> ordenarArrayCrescente(List<Integer> arr){
        
        int temp;

        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size() -1; j++){
                if(arr.get(j) > arr.get(j+1)){
                    // Troca os elementos de posição
                    temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }

        return arr;
    }

    public static List<Integer> ordenarArrayDecrescente(List<Integer> arr){

        int temp;

        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size() - 1; j++){
                if(arr.get(j) < arr.get(j+1)){
                    // Troca os elementos de posição
                    temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }


        return arr;
    }


    public static void main(String[] args){

        System.out.println("\n------------Ordenar um array (sem usar sort)-----------");

        List<Integer> meuArray = new ArrayList<>(Arrays.asList(9, 7, 5, 4, 3, 6, 2, 8, 1, 10));

        System.out.println("\nLista não ordenanda..: "+ meuArray);

        System.out.println("Lista ordenada crescente...:" + ordenarArrayCrescente(meuArray));
        System.out.println("Lista ordenada decrescente...:" + ordenarArrayDecrescente(meuArray));

        System.out.println("\n------------------------------------------------------------");

    }

}
