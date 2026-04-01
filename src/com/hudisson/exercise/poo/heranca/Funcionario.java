package com.hudisson.exercise.poo.heranca;

abstract class Funcionario {
    
    // Atributos 
    private String nome;
    private double salario;

    // Contrutor
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    abstract void exibirDados();
}
