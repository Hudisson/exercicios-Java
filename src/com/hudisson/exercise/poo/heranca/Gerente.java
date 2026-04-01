package com.hudisson.exercise.poo.heranca;

public class Gerente extends Funcionario {
    
    private double bonus;

    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void exibirDados(){
        System.out.println("=== Gerente ===");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Salário: R$ " + super.getSalario());
        System.out.println("Bônus: R$ " + this.bonus);       
    }
}
