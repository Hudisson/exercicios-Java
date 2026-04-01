/**
 * @author Hudisson Xavier
 * 
 * Execício 14:
 *   Herança em Java
 */
package com.hudisson.exercise.poo.heranca;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Execício 14 - Herança em Java");

        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> lista = new ArrayList<>();

        int opcao;

        do{
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Cadastrar Desenvolvedor");
            System.out.println("3 - Listar Funcionários");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nomeG = sc.nextLine();
                    System.out.print("Salário: ");
                    double salarioG = sc.nextDouble();
                    System.out.print("Bônus: ");
                    double bonus = sc.nextDouble();
                    lista.add(new Gerente(nomeG, salarioG, bonus));                 
                break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeD = sc.nextLine();
                    System.out.print("Salário: ");
                    double salarioD = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Linguagem: ");
                    String linguagem = sc.nextLine();
                    lista.add(new Desenvolvedor(nomeD, salarioD, linguagem));
                break;

                case 3:
                    if(lista.isEmpty()){
                        System.out.println("Nenhum funcionário cadastrado.");
                    }else{
                        for(Funcionario f: lista){
                            System.out.println("\n-------------------");
                            f.exibirDados();
                            System.out.println("-------------------");
                        }
                    }
                break;

                case 0:
                    System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Opção inválida!");
                break;
            }

        }while (opcao != 0);

        sc.close();
    }

}

