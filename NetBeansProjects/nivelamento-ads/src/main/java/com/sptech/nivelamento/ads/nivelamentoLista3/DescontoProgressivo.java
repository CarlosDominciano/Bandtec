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
public class DescontoProgressivo {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Utilitario util = new Utilitario();
        
        System.out.println("Digite o valor do produto:");
        Double valorDigitado = leitor.nextDouble();
        
        System.out.println("Digite a quantidade de produtos: ");
        Integer quantidadeDeProdutosDigitado = leitor.nextInt();
        
        Double calculo = util.calcularDesconto(valorDigitado, 
                quantidadeDeProdutosDigitado);
        
        String frase = util.exibirNotaFiscal(valorDigitado,
                quantidadeDeProdutosDigitado, calculo);
        System.out.println(frase);
        
    }
}
