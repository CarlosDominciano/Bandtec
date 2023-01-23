/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.nivelamentoLista4;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class TesteTermometro {
    
    public static void main(String[] args) {
        
        Termometro term1 = new Termometro(1.0,1.0,1.0 );
        
        term1.aumentaTemperatura(1.2);
        
        System.out.println(term1);
        
        term1.diminuiTemperatura(3.9);
        
        System.out.println(term1);
        
        term1.aumentaTemperatura(2.0);
        
        System.out.println(term1);
        
    }
    
    
}
