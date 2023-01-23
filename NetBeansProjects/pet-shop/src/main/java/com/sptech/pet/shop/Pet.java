/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.pet.shop;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Pet {
    private String nome;
    private String raca;
    private Integer qntdVisitas;
    private Double valorTotalGasto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQntdVisitas() {
        return qntdVisitas;
    }

    public void setQntdVisitas(Integer qntdVisitas) {
        this.qntdVisitas = qntdVisitas;
    }

    public Double getValorTotalGasto() {
        return valorTotalGasto;
    }

    public void setValorTotalGasto(Double valorTotalGasto) {
        this.valorTotalGasto = valorTotalGasto;
    }

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qntdVisitas = 0;
        this.valorTotalGasto = 0.0;
    }

    @Override
    public String toString() {
        String frase = String.format("Informações do Pet:\n\n"
                + "Nome: %s\n"
                + "Raça: %s\n"
                + "Quantidade de visistas: %d\n"
                + "Valor total gasto: %.2f\n"
                + "*-----------/|\\-----------*",
                nome, raca, qntdVisitas, valorTotalGasto);
        return frase;
    }
    
    
    
}
