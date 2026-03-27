/**
 * @author Hudisson Xavier
 * 
 * Execício 13:
 *   Sistema simples de conta bancária
 */

package com.hudisson.exercise.poo.simpleBank;

public class SimpleBank {
    
    private String titular;
    private double saldo = 0;


    public String depositar(double valor){

        if(valor < 0){
            return "Não é possível depositar valores negativos";
        }

        this.saldo = this.saldo + valor;

        return "Voçê depositou R$ "+ valor;

    }

    public String sacar(double valor){

        if(valor > this.saldo){
            return "Saldo insuficiente";
        }

        this.saldo = this.saldo - valor;

        return "Voçẽ realizou um saque no valor de R$ "+ valor;

    }

    public double verSaldo(){
        return this.saldo;
    }

    public void setTitular(String nome){
        this.titular = nome;
    }

    public String getTitular(){
        return this.titular;
    }

    public static void main(String[] args){

        System.out.println("-----------Sistema simples de conta bancária------------");

        SimpleBank t1 = new SimpleBank();

        t1.setTitular("Fulano");

        System.out.println("Titular: "+ t1.getTitular());
        System.out.println("Saldo R$ " + t1.verSaldo());
        System.out.println("Saque: "+ t1.sacar(100));
        System.out.println("Depósito: "+ t1.depositar(200));
        System.out.println("Saldo R$ " + t1.verSaldo());
        System.out.println("Saque: "+ t1.sacar(80));
        System.out.println("Saldo R$ " + t1.verSaldo());

    }


}
