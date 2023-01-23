/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto02;

import java.util.Scanner;

public class LacosRepeticao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Laços de repetição");
        for (Integer i = 0; i < 10; i++) {
            System.out.println(String.format("Número %d", i));
        }
        
        for (Integer i = 10; i > 0; i--) {
            System.out.println(String.format("Número %d", i));
        }
        
        
        System.out.println("Exemplo 03: While - acerte o número ");
        System.out.println("Acerte o número: ");
        Integer numeroDigitado = leitor.nextInt();
        
        while (numeroDigitado != 42) {            
            System.out.println("Errou... tente novamente: ");
            numeroDigitado = leitor.nextInt();
        }
        System.out.println("Acerto mizeravi");
        
        System.out.println("Exemplo 04: While 0 a 10");
        
        Integer contador = 0;
        while (contador != 10) {            
            System.out.println(contador);
            contador++;
        }
        
        System.out.println("Exemplo 05: While de 10 a 0");
        
        Integer contadorNegativo = 10;
        
        while (contadorNegativo > -1) {            
            System.out.println(contadorNegativo);
            contadorNegativo--;
        }
        
        System.out.println("Exemplo 06: do while - acerte o número");
        
        Integer numeroDigitadoDois;
        
        do {            
            System.out.println("Acerte o número (do while)");
            numeroDigitadoDois = leitor.nextInt();
            System.out.println("Errou...");
        } while (numeroDigitadoDois != 40);
    }
}
