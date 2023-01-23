package com.sptech.projeto02;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    public static void main(String[] args) {
        
        Math.random();
        //Existe o mérodo random() da classe
        //Math igualmente no Javascripto <3
        
        //Podemos gerar aleatórios com o objeto
        // da classe Random
        //Random alet = new Random();
        //Double aleat = alet.nextDouble();
        
        Integer numeroGerado = ThreadLocalRandom.current().nextInt(0, 101);
      //  System.out.println(numeroGerado);
        
        System.out.println(String.format("Número %d", numeroGerado));
        
//        String teste = numeroGerado + "";
        String teste = numeroGerado.toString();
        
        String numeroConvertidoAmem = String.valueOf(numeroGerado);
        Integer numeroConvertidoNumero = Integer.valueOf(
        numeroConvertidoAmem);
        
        System.out.println(numeroConvertidoAmem + numeroConvertidoAmem);
        
        
        
        
                
        
        
    }
    
}
