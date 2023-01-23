/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.exemplo.agregacao;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class App {
    public static void main(String[] args) {
        
        Contato c1 = new Contato("Dom", "11968888421");
        Contato c2 = new Contato("Brands", "11969876454");
        Contato c3 = new Contato("Jas", "11987675644");
        Contato c4 = new Contato("Tha", "11965443209");
        
        Grupo g1 = new Grupo("Do pó viestes ao pó voltarás");
        
        System.out.println(g1);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
        g1.adiciona(c1);
        g1.adiciona(c2);
        g1.adiciona(c3);
        g1.adiciona(c4);
        g1.remove(c4);
        g1.adiciona(c4);
        g1.remove(c4);
g1.adiciona(c4);
        g1.remove(c4);

        System.out.println(g1);
        
        
        
    }
}
