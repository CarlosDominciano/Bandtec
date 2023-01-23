/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.sptech.carlos.dominciano.c2;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Medicamento {

    private Integer id;
    private String nomeMedicamento;
    private Integer quantidadeEstoque;
    private Double valorVenda;
    private Double valorTotalVendas;
    private Integer repeat = 50;

    public Integer getId() { return id; }

    public void setId(Integer id) {
          this.id = id;
    }

    public Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {

    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Medicamento(Integer id, String nomeMedicamento) {
        this.id = id;
        this.nomeMedicamento = nomeMedicamento;
        this.quantidadeEstoque = 0;
        this.valorVenda = 0.0;
        this.valorTotalVendas = 0.0;
    }

    @Override
    public String toString() {

        String frase = String.format("\n\n" + "-".repeat(repeat) + "\n"
                + "ID: %d\n"
                + "Nome: %s\n"
                + "Quantidade em estoque: %d\n"
                + "Valor: %.2f\n"
                + "Valor Total de Vendas: %.2f\n"
                + "-".repeat(repeat)
                + "\n",
                id, nomeMedicamento, quantidadeEstoque,
                valorVenda, valorTotalVendas);

        return frase;
    }

}
