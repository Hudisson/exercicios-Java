/**
 * Exercício 17: Contagem de Frequência de Palavras
 *      Dado um texto, conte a frequência de cada palavra e exiba o resultado.
 */

package com.hudisson.exercise.poo.WordFrequency;

import java.util.ArrayList;

public class wordFrequency {
    
    // Atributos
    private String text;
    ArrayList<String> words = new ArrayList<>(); // Lista para armazenar as palavras únicas
    ArrayList<Integer> frequency = new ArrayList<>(); // Lista para armazenar a frequência de cada palavra

    // Construtor
    public wordFrequency(String text) {
        this.text = text.toLowerCase(); // Convertendo para minúsculas para contar palavras de forma case-insensitive
    }

    // Métodos

    // Método para contar a frequência de palavras
    public void countFrequency() {

        String[] splitText = text.split(" "); // Dividindo o texto em palavras usando espaço como delimitador

        for (String word : splitText) { // Iterando sobre cada palavra

            if (words.contains(word)) { // Verificando se a palavra já está na lista de palavras únicas

                int index = words.indexOf(word); // Obtendo o índice da palavra na lista de palavras únicas

                frequency.set(index, frequency.get(index) + 1); // Incrementando a frequência da palavra no índice correspondente

            } else { // Se a palavra não estiver na lista de palavras únicas, adicionar à lista e inicializar sua frequência como 1

                words.add(word); // Adicionando a nova palavra à lista de palavras únicas
                frequency.add(1); // Inicializando a frequência da nova palavra como 1  
            } 
        }  
    } 

}
