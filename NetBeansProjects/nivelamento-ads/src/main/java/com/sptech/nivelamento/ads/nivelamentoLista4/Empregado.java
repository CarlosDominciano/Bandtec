/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.nivelamentoLista4;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Empregado {
    
    String nome;
    String cargo;
    Double salario = 1000.0;
    
    void reajustarSalario(Double porcentagemDoReajuste){
        
        salario = salario + (salario * porcentagemDoReajuste / 100);
    }
    
}