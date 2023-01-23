/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto02;


import java.util.Scanner;


public class NovaCondicao {
    public static void main(String[] args) {
        
        //jeito padrão para iniciar um objeto Scanner
        //serve para ler, nesse caso, o que é digitado
        //digitado no console.
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Integer numeroDigitado = leitor.nextInt();
        //pega sa bagaça digitada pra mim e coloca em um int faz favo
//        switch (numeroDigitado) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            case 7:
//                System.out.println("Sabado");
//                break;
//            default:
//                System.out.println("Número inválido");
//                break;}

        System.out.println("Digite o ranking 1, 2 ou 3: ");
        Integer numeroEscolhido = leitor.nextInt();
        
        switch (numeroEscolhido) {
            case 1:
                System.out.println("Ganhou um iPhone 13");
                
            case 2:
                System.out.println("Ganhou um PlayStation 5");
                
            case 3:
                System.out.println("Ganhou Marea ");
                break;
                default:
                    System.out.println("Nada");        
        } 
    }
}
