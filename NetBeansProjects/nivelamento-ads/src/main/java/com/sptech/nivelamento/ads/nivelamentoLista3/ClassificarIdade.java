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
public class ClassificarIdade {
    public static void main(String[] args) {
        
        Scanner leitorIdade = new Scanner(System.in);
        Utilitario util = new Utilitario();
        
        System.out.println("Entre com sua idade: ");
        Integer idadeDigitada = leitorIdade.nextInt();
        
        util.classificarIdade(idadeDigitada);
    }
}
