/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.project.poo;

import java.util.Scanner;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class AppBilhete {
    public static void main(String[] args) {
        BilheteUnico bilhete1 = new BilheteUnico();
        Scanner leitor = new Scanner(System.in);
        
        bilhete1.carregar(10.0);
        bilhete1.usar();
        
        System.out.println(bilhete1.saldo);
        
//        System.out.println("Digite seu nome: ");
//        bilhete1.nome = leitor.nextLine();
//        
//        System.out.println("Saldo do Bilhete: ");
//        Double saldoDigitado = leitor.nextDouble();
//        
//        Double valor = bilhete1.carregar(saldoDigitado);
//        
//        bilhete1.usar();
        
        
        
    }
}
