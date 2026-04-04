package com.hudisson.exercise.poo.interfaces;

public class Pix implements PagarComPix{

    private String chave;
    private double valor;
    private int tipo_chave;

    public Pix(String chave, double valor){
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public boolean validarChave() {
        
        if(this.chave.isEmpty() || chave == null ){
            return false;
        }

        this.tipo_chave = tipoChave(this.chave);

        if(this.tipo_chave >= 1 && this.tipo_chave <= 5){
            return true;
        }

        return false;
    }

    @Override
    public boolean pagar() {

        if(this.valor < 0.01){
            return false;
        }

        return true;
    }

    public int tipoChave(String chave) {

        // Remove tudo que não for número e procura correspondêcia se é um cpf
        if(chave.replaceAll("\\D", "").trim().matches("^\\d{11}$")){
           
            return 1;
        }

        // Remove tudo que não for número e procura correspondêcia se é um cnpj
        if(chave.replaceAll("\\D", "").trim().matches("^\\d{14}$")){
            
            return 2;
        }

        // Regex simplificada para e-mail
        if(chave.trim().replace(" ", "").matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")){
            
            return 3;
        }

        // Valida: +55 + DDD (2 dígitos) + 9 (prefixo celular) + 8 dígitos
        // Exemplo: +5511988887777
        if(chave.trim().replace(" ", "").matches("^\\+55\\d{2}9\\d{8}$")){
           return 4;
        }

         // Regex para o padrão UUID (8-4-4-4-12 hexadecimais)
        if(chave.trim().replace(" ", "").matches("^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$")){
            return 5;
        }

        return 0;
    }

    public String getChave() {
        return chave;
    }

    public double getValor() {
        return valor;
    }

    public int getTipoChave() {
        return tipo_chave;
    }

    


}
