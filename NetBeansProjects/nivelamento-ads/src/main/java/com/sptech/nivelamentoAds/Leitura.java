/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamentoAds;

import java.util.Scanner;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Leitura {
    public static void main(String[] args) {
        
        // Este é o exemplo de objeto ou 
        // Instância da classe Scanner
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumeros = new Scanner(System.in);
        Scanner leitorNumerosReais = new Scanner(System.in);
        
         System.out.println("Digite sua Altura: ");
        Double altura = leitorNumeros.nextDouble();
        System.out.println("Ala o cara tem " + altura + " kkkk");
        //tem que usar "," no log para o Double
       
       
        
        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitorTexto.nextLine();
     
        System.out.println("Olá, " + nomeDigitado);
        
         System.out.println("Digite sua idade: ");
        Integer idadeDigitada = leitorNumeros.nextInt();
        
       
        
        if (idadeDigitada > 0 && idadeDigitada < 120 ) {
            System.out.println("Sua idade :" + idadeDigitada);
        } else {
            System.out.println("vai ti fude " + nomeDigitado + " kkjjkjjj");
        }
        
        
       
        
    }
    
}
