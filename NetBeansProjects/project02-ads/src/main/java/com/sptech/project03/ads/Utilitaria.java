/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.project03.ads;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Utilitaria {
    
    
    void exibirLinha(){ //assinatura de um metodo void que não retorna nada
        System.out.println("-".repeat(20));
    }
    void exibirNome(String nome){ // Assinatura void com argumento
        System.out.println(String.format("--- %s ---", nome));
    }
    
    //Podemos adicionar mais de um argumento
    void exibirNomeEIdade(String nome, Integer idade) {
        System.out.println(String.format("Nome: %s \n Idade: %d",
                nome, idade));
    }
    
    // Recebe 3 Args: nome, idade e altura
    //Faz um sout apresentando o usuário
    void exibirApresentacao(String nome, Integer idade, Double altura){
        System.out.println(String.format("Meu nome é %s"
                + "\nTenho %d anos\nE %.2f de altura", nome, idade, altura));
    }
    
    void exibirSoma(Integer numeroUm, Integer numeroDois) {
        Integer soma = numeroUm + numeroDois;
        System.out.println(String.format("A soma é: %d", soma));
    }
    
    Integer somar(Integer numeroUm, Integer numeroDois) {
        Integer soma = numeroUm + numeroDois;
        return soma;
        
    }
}
