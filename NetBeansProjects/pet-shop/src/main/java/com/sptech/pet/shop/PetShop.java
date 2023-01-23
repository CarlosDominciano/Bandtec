/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.pet.shop;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class PetShop {
    private String nome;
    private Double faturamento;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamento = 0.0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    public void darBanho(Pet pet, Double pagamento) {
        
        this.faturamento += pagamento;
        
       
        pet.setQntdVisitas(pet.getQntdVisitas() + 1);
        pet.setValorTotalGasto(pet.getValorTotalGasto() + pagamento);
    }
    
    public void darBanho(Pet pet, Double pagamento, Integer desconto) {
        pagamento -= pagamento * desconto / 100;
        this.faturamento += pagamento;

        pet.setQntdVisitas(pet.getQntdVisitas() + 1);
        pet.setValorTotalGasto(pet.getValorTotalGasto() + pagamento);
    }
    
    @Override
    public String toString() {
        String frase = String.format("Relatório de vendas: \n"
                + "Nome do PetShop: %s\n"
                + "Faturamento total: %.2f", 
                nome, faturamento);
        return frase;
    }
    
    
    
}
