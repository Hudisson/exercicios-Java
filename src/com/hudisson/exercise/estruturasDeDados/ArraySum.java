/**
 * @author Hudisson Xavier
 * 
 * Execício 08:
 *    Somar todos os números de um array
 */

package com.hudisson.exercise.estruturasDeDados;

public class ArraySum {

    /**
     * Método responsável por realizar a soma dos valore do array
     * @param valores
     * @return 
     */
    public static int somarArray(int[] valores) {

        int soma_dos_valores = 0;

        for (int valor : valores) {
            soma_dos_valores += valor;
        }

        return soma_dos_valores;

    }

    /**
     * Método que ler e retorna os elementos do array no formanto: [ 1; 2; 3; ... etc]
     * @param valores
     * @return
     */
    public static String readArray(int[] valores) {

        StringBuilder arrayText = new StringBuilder();

        arrayText.append("[ "); 

        for (int i = 0; i < valores.length; i++) {

            if (arrayText.length() > 2) { 
                                          
                arrayText.append("; ");
            }

            arrayText.append(valores[i]);

        }

        arrayText.append(" ]");

        return arrayText.toString();
    }

    /**
     * Método que ler e retorna os elementos do array no formanto:  1 + 2 + 3 + ... etc
     * @param valores
     * @return
     */
    public static String operacaoSoma(int[] valores) {

        StringBuilder arrayText = new StringBuilder();

        for (int i = 0; i < valores.length; i++) {

            if (arrayText.length() > 0) {
                arrayText.append(" + ");
            }

            arrayText.append(valores[i]);
        }

        return arrayText.toString();
    }

    public static void main(String[] args) {

        System.out.println("\n------------Somar todos os números de um array-----------");

        int[] meuArray = { 10, 20, 30, 70, 89 };

        System.out.println("\nArray: "+ readArray(meuArray));

        System.out.println("Soma dos valores: " + operacaoSoma(meuArray) + " = " + somarArray(meuArray));

        System.out.println("\n---------------------------------------------------------");
    }

}
