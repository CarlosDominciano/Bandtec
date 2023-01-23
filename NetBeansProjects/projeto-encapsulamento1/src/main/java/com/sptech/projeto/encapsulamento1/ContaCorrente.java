/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.encapsulamento1;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class ContaCorrente {
    private String nomeTitular;
    private Double saldo;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 1000.0;
    }
    
    void depositar(Double saldo){
        this.saldo += saldo;
    }
    
    void sacar(Double saldo){
        this.saldo -= saldo;
    }
    
     
}
