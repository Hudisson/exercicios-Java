/**
 * @author Hudisson Xavier
 * 
 * Execício 15:
 *   Interface Java
 */

package com.hudisson.exercise.poo.interfaces;

public class app {
    
    public static void main(String[] args) throws Exception{

        /**
         * Exemplos de chaves PIX
         * 
         * 1. CPF:"874.192.560-03",
         * 2. CNPJ: "12.345.678/0001-95",  
         * 3. E-MAIL: "teste@email.com", 
         * 4. TELEFONE: "+5582999999999", 
         * 5. ALEATÓRIA: "3f9a1c7e-8b2d-4a6f-9c31-5d7e2f8b4a90"
         */

        String ch = "3f9a1c7e-8b2d-4a6f-9c31-5d7e2f8b4a90"; 
        double valor = 0.001;

        Pix p1 = new Pix(ch, valor);

        if(p1.validarChave()){
            System.out.println("Ok, chave válida ");
        }else{
            System.out.println("Erro, chave inválida");
        }


        System.out.println("TIPO de CHAVE: "+p1.getTipoChave());

        // Retorno dos tipos de chave

        if(p1.getTipoChave() == 1){
            System.out.println("Chave - CPF: "+ ch);
        }

        if(p1.getTipoChave() ==  2){
            System.out.println("Chave - CNPJ: "+ ch);
        }

        if(p1.getTipoChave() == 3){
            System.out.println("Chave - E-MAIL: "+ ch);
        }

        if(p1.getTipoChave() == 4){
            System.out.println("Chave - TELEFONE: "+ ch);
        }

        if(p1.getTipoChave() == 5){
            System.out.println("Chave - ALEATÓRIA: "+ ch);
        }
        
        if(p1.getTipoChave() == 0){
            System.out.println("Chave INVÁLIDA: "+ ch);
        }

        // Retono da validação de valor

        if(p1.pagar() && (p1.getTipoChave() >=1 && p1.getTipoChave() <= 5)){

            System.out.println("Valor enviado: R$ "+ valor);

        }else if(p1.pagar() && !(p1.getTipoChave() >=1 && p1.getTipoChave() <= 5)){

            System.out.println("Atenção, não é possível enviar para uma chave inválida! " );

        }else{
            System.out.println("Valor muito baixo: R$"+ valor + " Só é permitido valores apartir de R$ 0,01" );
        }

    }
}
