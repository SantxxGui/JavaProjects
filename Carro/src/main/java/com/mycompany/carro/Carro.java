/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carro;

/**
 *
 * @author LAB 06
 */
public class Carro {
    private String modelo;
    private int velocidade;
    
    
    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getVelocidade() {
        return velocidade;
    }
        private static final int LIMITE_VELOCIDADE = 120;
        private static final int VALOR_MULTA = 240;
        private static final int ADICIONAL = 20;
        
    public void verificarVelocidade(Carro carro) {
        int velocidade = carro.getVelocidade();
        if(velocidade > LIMITE_VELOCIDADE) {
            int excesso = velocidade - LIMITE_VELOCIDADE;
            int multaAdicional = excesso / 10;
            int valorTotal = VALOR_MULTA + (multaAdicional * ADICIONAL);
            System.out.println("O carro " + carro.getModelo() + " Foi multado");
            System.out.println("Velocidade: " + velocidade + " km/h") ;
            System.out.println("Valor da multa: R$ " + valorTotal);
        } else {
            System.out.println("O carro " + carro.getModelo() + " esta dentro do limite");
        }
    }
    

    public static void main(String[] args) {
        Carro mustang = new Carro("Mustang 1978", 120);
        Carro ferrari = new Carro("Ferrari 2015", 130);
        Carro uno = new Carro("Fiat Uno", 210);
    
        Carro carro = new Carro("Mustang 1978", 120);
        carro.verificarVelocidade(mustang);
        carro.verificarVelocidade(ferrari);
        carro.verificarVelocidade(uno);
    }
}

