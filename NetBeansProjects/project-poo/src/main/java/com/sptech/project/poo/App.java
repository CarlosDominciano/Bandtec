package com.sptech.project.poo;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        Boolean isActivated = true;
        Double saldo = 0.00;
        
        
//        while (isActivated) {   
//            
//            
//            System.out.println("\n\nEscolha uma opção:\n1 - Depositar"
//                    + "\n2 - Sacar\n3 - Sair");
//            Integer escolha = leitorNumero.nextInt();
//            
//            
//            if (escolha == 1) {
//                
//                
//                System.out.println("\n\nValor a ser depositado: ");
//                saldo = leitorNumero.nextDouble();
//                conta1.depositar(saldo);
//                
//                
//            } else if (escolha == 2 && saldo > 0){
//               
//                System.out.println("\n\nValor a ser retirado: ");
//                saldo = leitorNumero.nextDouble();
//                conta1.sacar(saldo);
//                
//                
//            } else if (escolha == 3) {
//                
//                
//                System.out.println("\n\nAté mais!");
//                isActivated = false;
//                
//                
//            } else if (escolha == 2 && saldo == 0.00){
//                
//                
//                System.out.println("Você não tem dinheiro para sacar!");
//                
//                
//            } else {
//                
//                
//                System.out.println("\n\nEscolha uma opção válida, por favor.");
//                
//                
//            }
//            
//            
//           System.out.println(String.format("\n\nVocê tem na sua conta: R$%.2f", 
//                conta1.saldo));
//           
//           
//        }

        System.out.println("Deposite na conta 1:");
        Double valorDigitado = leitorNumero.nextDouble();
        
        conta1.depositar(valorDigitado);
        
        Boolean sucesso = conta1.sacar(5000.0);
        while (!sucesso) {            
            System.out.println("Tente sacar outro valor");
        }
        
       
    }
}
