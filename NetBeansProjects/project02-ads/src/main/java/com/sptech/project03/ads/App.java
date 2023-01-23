/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.project03.ads;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class App {
    public static void main(String[] args) {
        
        //Exemplo de Objeto - Instância
          Utilitaria util = new Utilitaria();
//        System.out.println("Diego");
//        util.exibirLinha();
//        System.out.println("-".repeat(30));
//        
//        System.out.println("Moreschino");
//        util.exibirLinha();
//
//        Scanner leitor = new Scanner(System.in);
//        Scanner leitorIdade = new Scanner(System.in);
//        Scanner leitorAltura = new Scanner(System.in);
//        
//        System.out.println("Digite seu nome: ");
//        String nomeDigitado = leitor.nextLine();
//        
//        System.out.println("Digite a idade: ");
//        Integer idadeDigitada = leitorIdade.nextInt();
//        
//        System.out.println("Digite a altura: ");
//        Double alturaDigitada = leitorAltura.nextDouble();
//        
//   
//        util.exibirApresentacao(nomeDigitado, idadeDigitada, alturaDigitada); 
          //chamada de método é invocar metodo
    
        
        Integer numeroUmDigitado = ThreadLocalRandom.current().nextInt(1, 101);
        Integer numeroDoisDigitado = ThreadLocalRandom.current().nextInt(1, 101);
        
        System.out.println(numeroUmDigitado +" + "+ numeroDoisDigitado);
        util.exibirSoma(numeroUmDigitado, numeroDoisDigitado);
        
        Integer soma = util.somar(5, 5);
        
        System.out.println(soma);
    
    
    }
}
