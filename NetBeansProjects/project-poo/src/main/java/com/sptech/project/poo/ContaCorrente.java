package com.sptech.project.poo;

public class ContaCorrente {
    
    //Declarando as caracteristicas da nossa conta.
    //Atributos = Caracteristicas de um objeto.
    String titular;
    Double saldo = 0.0;
    
    //Declarando os comportamentos || habilidades da nossa conta.
    //Métodos.
    void depositar(Double saldoAtual) {
        saldo+=saldoAtual;
    }
    
    Boolean sacar(Double valorDoSaque){
        if (valorDoSaque > saldo) {
            System.out.println("Saldo insuficiente...");
            return false;
        } else {
            saldo -= valorDoSaque;
            System.out.println("Sacou");
            return true;
        }
    }
}
