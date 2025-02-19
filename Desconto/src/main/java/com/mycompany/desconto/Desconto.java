/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desconto;

/**
 *
 * @author Damas
 */
    class Desconto {
    private String nome;
    private double preco;
    
public Desconto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
}

    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public double getDesconto(){
        return preco * 0.10;
    }
    
    public double getPrecoComDesconto() {
        return preco - getDesconto();
    }
    
    public static void main(String[] args) {
        Desconto teclado = new Desconto("Redragon fizz 60%", 122.90);
        Desconto mouse = new Desconto("Logitech G pro X Superlight", 639.20);
        System.out.println("Nome: " + teclado.getNome());
        System.out.println("Preço Original: " + teclado.getPreco());
        System.out.println("Valor do desconto: " + teclado.getDesconto());
        System.out.println("Valor do Produto com Desconto: " + teclado.getPrecoComDesconto());
        System.out.println("Nome: " + mouse.getNome());
        System.out.println("Preço Original: " + mouse.getPreco());
        System.out.println("Valor do desconto: " + mouse.getDesconto());
        System.out.println("Valor do Produto com Desconto: " + mouse.getPrecoComDesconto());
    }
}
