/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.project.poo;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class BilheteUnico {

    String nome;
    Double saldo = 0.0;

    void usar() {

        saldo -= 4.4;
     
    }

    void carregar(Double saldoCarregado) {
        
        saldo += saldoCarregado;
  
    }
}
