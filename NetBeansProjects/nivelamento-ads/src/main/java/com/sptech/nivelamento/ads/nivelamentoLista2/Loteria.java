/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.nivelamentoLista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Loteria {
    
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Integer numeroDigitado = numero.nextInt();
        
        Integer numeroGerado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer contador = 1;
        while (numeroDigitado != numeroGerado) {
            System.out.println("Errou... O número era " + numeroGerado
                    + " \n\n Tente de novo: \n");
            contador++;
            numeroGerado = ThreadLocalRandom.current().nextInt(0, 11);
            numeroDigitado = numero.nextInt();
        }
        String frase = String.format("Você acerto na %d vez!", contador);
        System.out.println(frase);
        
        if (contador <= 3) {
            System.out.println("Você é MUITO sortudo!");
        } else if (contador <= 10) {
            System.out.println("Você é sortudo!");
        } else {
            System.out.println("É você Tsunade?");
        }
        
    }
    
}
