/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.nivelamentoLista2;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class NumerosPares {
    public static void main(String[] args) {
        
        int i = 0;
        while (i <= 40) {
            if (i % 2 == 0) {
                System.out.println(String.format("Número par: %d", i ));
            }
            i++;
        }
    }
    
}
