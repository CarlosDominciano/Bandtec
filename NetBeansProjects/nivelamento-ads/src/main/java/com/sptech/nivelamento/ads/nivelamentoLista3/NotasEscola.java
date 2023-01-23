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
public class NotasEscola {
    public static void main(String[] args) {
        Utilitario util = new Utilitario();
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Entre com a primeira nota: ");
        Double notaUmDigitada = leitorNumero.nextDouble();
        
        System.out.println("Entre com a segunda nota: ");
        Double notaDoisDigitada = leitorNumero.nextDouble();
        
        Double media = util.calcularMedia(notaUmDigitada, notaDoisDigitada);
        String frase = String.format("Sua média foi de %.2f", 
                media);
        
        System.out.println(frase);
        
    }
}
