/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.carlos.dominciano.ac1;

import java.util.Scanner;


/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class ControleDeTarefas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumeros = new Scanner(System.in);
        
        Boolean notExit = true;
        Integer tarefasPendentesDigitada = null;
        Integer metaDeDesenvolvimentoDigitada = null;
        String frase = null;
        Boolean notViable = true;
        Integer escolherOpcao = null;
        Integer tarefasRealizadasDigitada = null;
        Integer quantidadeAtualDeTarefas = null;
        Integer contador = null;
        String finalizacaoDeTarefasFrase = null;
        Integer totalDeTarefas = null;
        
        while (notExit) {            
            contador = 1;
            while (notViable) {                
                
                System.out.println("Bem-Vindo Gestor!"
                            + " Realize o controle das tarefas do time:\n\n"
                            + "Quantidade de tarefas pendentes: ");
                tarefasPendentesDigitada = leitorNumeros.nextInt();
                totalDeTarefas = tarefasPendentesDigitada;
                if (tarefasPendentesDigitada > 0) {
                    

                    System.out.println("Meta de desenvolvimento (%):");
                    metaDeDesenvolvimentoDigitada = leitor.nextInt();

                    Integer calculoDaMeta = tarefasPendentesDigitada *
                            metaDeDesenvolvimentoDigitada / 100;

                    frase = String.format("Para atingir a meta,"
                            + " o time precisa finalizar %d tarefas", calculoDaMeta);
                    notViable = false;
                } else if (tarefasPendentesDigitada <= 0) {
                    frase = "Operação inválida - Não existem tarefas pendentes!";
                }

                System.out.println(frase);
            }
            System.out.println("Escolha os próximos passos: \n\n"
                    + "1 - Finalizar tarefas\n"
                    + "2 - Sair");
            
            notViable = true;
            
            while (notViable) {                
                escolherOpcao = leitor.nextInt();
                if (escolherOpcao != 1 &&
                        escolherOpcao != 2) {
                    System.out.println("Opção inválida, por favor"
                            + " digite 1 ou 2 para prosseguir!");
                } else {
                    notViable = false;
                }
            }
            if (escolherOpcao == 2 ) {
                notExit = false;
                System.out.println("Até logo!");
            } else if (escolherOpcao == 1 && tarefasPendentesDigitada <= 0) {
                System.out.println("Operação inválida - "
                        + "Não existem tarefas pendentes!");
                notExit = false;
                
            } else {
                
                System.out.println("Digite a quantidade de tarefas realizadas: ");
                tarefasRealizadasDigitada = leitorNumeros.nextInt();
                
                if (tarefasPendentesDigitada < 
                        tarefasRealizadasDigitada) {
                    
                    System.out.println(String.format("O time possui uma"
                            + " quantidade menor de tarefas pendentes!\n"
                            + "Quantidade atual: %d", tarefasPendentesDigitada));
                    
                } else {
                    
                    quantidadeAtualDeTarefas = tarefasPendentesDigitada -
                            tarefasRealizadasDigitada;
                    
                    while (contador <= tarefasRealizadasDigitada) {  
                        
                        System.out.println(String.format(
                                "Finalizando %d° tarefa", contador));
                        contador++;
                        
                    }
                    
                    tarefasPendentesDigitada -= tarefasRealizadasDigitada;
                    finalizacaoDeTarefasFrase = String.format("Você acabou de "
                        + "finalizar %d tarefas!\n"
                        + "Quantidade de tarefas pendentes %d!\n"
                        + "Meta de desenvolvimento: %d%%",
                        tarefasRealizadasDigitada, tarefasPendentesDigitada,
                        metaDeDesenvolvimentoDigitada);
                    System.out.println(finalizacaoDeTarefasFrase);
                    
                    Integer porcentagensEmTarefas = totalDeTarefas *
                            metaDeDesenvolvimentoDigitada / 100;
                    System.out.println("Lembrando que " + 
                            metaDeDesenvolvimentoDigitada + "% das tarefas"
                                    + " é igual a " + porcentagensEmTarefas +
                            "!");
                    
                }
            }
        }
        
    }
}
