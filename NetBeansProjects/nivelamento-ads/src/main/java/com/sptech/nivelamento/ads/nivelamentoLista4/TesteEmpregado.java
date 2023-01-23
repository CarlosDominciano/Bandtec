/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.nivelamentoLista4;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class TesteEmpregado {
    
    public static void main(String[] args) {
        
        Empregado servidor1 = new Empregado();
        Empregado servidor2 = new Empregado();
        
        servidor1.nome = "João";
        servidor1.salario = 5400.00;
        servidor1.cargo = "Analista de sistemas";
        
        Double porcentagemDoReajuste = 15.0;
        
        servidor1.reajustarSalario(porcentagemDoReajuste);
        
        System.out.println(servidor1.salario);
        
        servidor2.nome = "José";
        servidor2.salario = 100.00;
        servidor2.cargo = "Analista de sistemas";
        
        porcentagemDoReajuste = 100.0;
        
        servidor2.reajustarSalario(porcentagemDoReajuste);
        
        System.out.println(servidor2.salario);
    }
    
}