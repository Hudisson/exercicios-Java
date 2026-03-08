/**
 * @author Hudisson Xavier
 * 
 * Exercíco 03
 *  Verificar se um número é (primo; positivo; negativo; e  calcular a sua quantidade de divisores)
 * 
 * OBS.: A quantidade de divisores de um número negativo é o dobro da quantidade de divisores positivos do seu valor absoluto, pois cada divisor positivo possui também o seu correspondente negativo.
 * Exemplo:
 * Os divisores de 6 são: (1, 2, 3, 6).
 * Os divisores de −6 são: (−1, 1, −2, 2, −3, 3, −6, 6).
 * 
 * Um número primo é um número natural maior que 1 que possui apenas dois divisores distintos: o número 1 e ele mesmo.
 * Exemplo: Os 10 primeiros números primos são: (2; 3; 5; 7; 11; 13; 17; 19; 23; 29)
 */

package com.hudisson.exercise.fundamentos;

public class NumberClassifier {

    public static int quantidadeDeDivisores = 0;
    public static String divisores = "";

    public static int numberOfDivisors(int numero) {

        if (numero < 0) {

            numero *= (-1);

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    quantidadeDeDivisores++;
                }
            }

            return quantidadeDeDivisores *= 2;
        }

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                quantidadeDeDivisores++;
            }
        }

        return quantidadeDeDivisores;
    }

    public static String getDivisors(int numero) {
        StringBuilder divisores = new StringBuilder();

        if(numero < 0){

            numero *= (-1);

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    if (divisores.length() > 0) {
                        divisores.append("; ");
                    }
                    divisores.append(i);
                    divisores.append("; ");
                    divisores.append(-i);
                }
            } 
            
            return divisores.toString();
        }

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                if (divisores.length() > 0) {
                    divisores.append("; ");
                }
                divisores.append(i);
            }
        }

        return divisores.toString();
    }

    public static String isPrimeNumber(int numero, String divisores){

        String primo = "1; "+ numero;
        if(primo.equals(divisores)){
            return "SIM";
        }

        return "NÃO";
        
    }

    public static String PositiveOrNegative(int numero) {

        if (numero < 0) {
            return "NEGATIVO";
        }

        if (numero > 0) {
            return "POSITIVO";
        }

        return "NULO";
    }

    public static void main(String[] args) {

        int valor = -6;

        System.out.println("O número " + valor + " possui " + numberOfDivisors(valor)+" divisores");
        System.out.println("Os divisores de " + valor + " são: { " + getDivisors(valor) + " }");
        System.out.println("O número " + valor + " é " + PositiveOrNegative(valor));
        System.out.println("É primo: "+ isPrimeNumber(valor, getDivisors(valor)));

    }

}
