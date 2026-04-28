package com.hudisson.exercise.poo.anagramas;

public class App {
    
    public static void main(String[] args){

        System.out.println("\n-----------Verificar se duas palavras são anagramas------------\n");

        String palavra1 = "amor";
        String palavra2 = "roma";

        String palavra3 = "Arara";
        String palavra4 = "Araraquara";

        Anagramas.saoAnagramas(palavra1, palavra2);

        Anagramas.saoAnagramas(palavra3, palavra4);

    
        System.out.println("\n---------------------Fim do exercício-------------------------\n");
    }
}