/**
 * @author Hudisson Xavier
 * 
 * Execício 12:
 *   Criar classe Pessoa com um método apresentar
 */

package com.hudisson.exercise.poo;

public class Pessoa {
    
    private String nome;
    
    private Integer idade;

    public String apresentar(){

        //return "Olá, meu nome é "+ nome+ " e tenho "+ idade;
        return "Olá, meu nome é "+ this.getNome()+ " e tenho "+ this.getIdade();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void SetIdade(int idade){

        if(idade <= 0){
            this.idade = null;
        }

        this.idade = idade;

    }

    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public static void main(String[] args){


        System.out.println("-----------POO em Java------------");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Fulano");
        pessoa.SetIdade(30);

        System.out.println(pessoa.apresentar());


    }

}
