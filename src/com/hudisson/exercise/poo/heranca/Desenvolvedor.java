package com.hudisson.exercise.poo.heranca;

public class Desenvolvedor extends Funcionario {
    
    private String linguagem;

    // Construtor
    public Desenvolvedor(String nome, double salario, String linguagem){
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public void exibirDados(){
        System.out.println("=== Desenvolvedor ===");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Salário: R$ " + super.getSalario());
        System.out.println("Linguagem: " + this.linguagem);       
    }
}
