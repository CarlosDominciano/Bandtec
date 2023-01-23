/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.nivelamentoLista6;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class TestePlanejamento {
    public static void main(String[] args) {
        Planejamento pl1 = new Planejamento("Banner", "Dom", 10);
        
        pl1.setDiasUsados(10);
        
        System.out.println(pl1.calcularTempo());
        
        System.out.println(pl1);
    }
}
