/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.nivelamentoLista2;

import java.util.Scanner;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        Integer numeroDigitado = leitor.nextInt();
        Integer calculo;
        
        for (int i = 0; i <= 10; i++) {
            calculo = numeroDigitado * i;
            System.out.println(String.format("%d X %d = %d", numeroDigitado,
            i, calculo));
        }
    }
}
