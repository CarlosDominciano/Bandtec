/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.nivelamentoLista3;

import java.util.Scanner;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class ClassesSociais {
    
    public static void main(String[] args) {
        Utilitario util = new Utilitario();
        Scanner leitorRenda = new Scanner(System.in);
        
        System.out.println("Entre com sua renda familiar mensal: ");
        Double rendaDigitada = leitorRenda.nextDouble();
        
        Double salarioMinimo = util.verificarSalarioMinimo(rendaDigitada);
        String classeSocial = util.verificarClasse(salarioMinimo);
          
        String frase = String.format("Você recebe aproximandamente %.1f Salários"
                + "Mínimos \n"
                + "Você pertence a classe social: %s",
                salarioMinimo, classeSocial);
        
        System.out.println(frase);
    }
    
    
}
