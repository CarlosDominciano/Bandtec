/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.listaNivelamento;

import java.util.Scanner;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class CadastroUsuario {
    public static void main(String[] args) {
        
        Scanner loginDoCliente = new Scanner(System.in);
        Scanner senhaDoCliente = new Scanner(System.in);
        Scanner vezesQuePodeErrar = new Scanner(System.in);
        
        System.out.println("Digite seu login: ");
        String loginDigitado = loginDoCliente.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senhaDigitada = senhaDoCliente.nextLine();
        
        System.out.println("Vezes que pode errar a senha antes de bloquear "
                + "a conta: ");
        Integer vezesQuePodeErrarDigitado = vezesQuePodeErrar.nextInt();
        
        String frase = String.format("Seu login é %s. \n Sua senha é %s. \n"
                + " E você tem %d tentativas antes de ser bloqueado!" 
                , loginDigitado, senhaDigitada, vezesQuePodeErrarDigitado);
        
        System.out.println(frase);
    }
    
}
