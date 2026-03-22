/**
 * @author Hudisson Xavier
 * 
 * Execício 09:
 *    Remover duplicados de uma lista
 */

package com.hudisson.exercise.estruturasDeDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    /**
     * Método que remove valores duplicados em um lista de inteiros
     * @param duplicados
     * @return
     */
    public static List<Integer> SemDuplicados(List<Integer> duplicados) {

        List<Integer> semDuplicados = new ArrayList<>();

        for(int valor : duplicados){
            if(!semDuplicados.contains(valor)){
                semDuplicados.add(valor);
            }
        }

        return semDuplicados;
    }

    public static void main(String[] args) {

        System.out.println("\n------------Remover duplicados de uma lista-----------");

        List<Integer> meuArray = new ArrayList<>(Arrays.asList(10, 10, 20, 30, 70, 89, 20, 30, 89));

        System.out.println("\nLista com dublicados..: "+ meuArray);

        System.out.println("Lista sem duplicados...:" + SemDuplicados(meuArray));

        System.out.println("\n------------------------------------------------------------");
    }

}
