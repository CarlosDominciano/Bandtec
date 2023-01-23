/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bandtec.projeto.lista.desafio;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class TesteList {
    public static void main(String[] args) {
        ListaUtil l = new ListaUtil();
        
        Integer oi = null;
        l.add(oi);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(-60);
        l.add(-60);
        
        System.out.println(l);
        
        l.remove(4);
        
        System.out.println(l);
        
        System.out.println(l.count());
        System.out.println(l.countImpares());
        System.out.println(l.countPares());
        System.out.println(l.somar());
        System.out.println(l.getMaior());
        System.out.println(l.getMenor());
        System.out.println(l.hasDuplicidade());
        
    }
}
