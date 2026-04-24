package com.hudisson.exercise.poo.WordFrequency;

public class app {
    
    public static void main(String[] args) {

        System.out.println("\n-----------Contagem de Frequência de Palavras------------\n");

        String text = "Java é legal e java é poderoso";
        wordFrequency wf = new wordFrequency(text);
        wf.countFrequency();
        System.out.println("Texto: " + text);

        System.out.println("Frequência das palavras: ");
        for (int i = 0; i < wf.words.size(); i++) {
            System.out.println(wf.words.get(i) + ": " + wf.frequency.get(i));
        }
       
        System.err.println("\n---------------------Fim do exercício--------------------\n");

    }
    
}
