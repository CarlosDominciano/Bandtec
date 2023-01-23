/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto02;


/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class NovoOperador {
    public static void main(String[] args) {
        
        String nome = "Carlos Dominciano";
        
        Boolean isAluno = true;
        
        String resultado;
        
        if (isAluno) {
            resultado = "Aluno";
        } else {
            resultado = "Não Aluno";
        }
 
        Integer numero = 10;
        
        resultado = isAluno ? "Sim" : "Não";
        System.out.println(resultado);
        
        resultado = numero > 10 ? "Sim" : "Não";
        
        System.out.println(resultado);
    }
}
