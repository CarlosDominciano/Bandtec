/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.carlos.dominciano.c2;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Farmacia {

    private String nome;
    private Integer quantidadeMedicamentoVendidos;
    private Integer quantidadeDescontosAplicados;
    private Integer repeat = 50;

    public Farmacia(String nome) {
        this.nome = nome;
        this.quantidadeMedicamentoVendidos = 0;
        this.quantidadeDescontosAplicados = 0;
    }

    public void realizarVenda(Medicamento medicamento, Double valorVenda) {

        if (medicamento.getQuantidadeEstoque() >= 1) {

            medicamento.setValorVenda(valorVenda);
            medicamento.setValorTotalVendas(medicamento.getValorTotalVendas()
                    + valorVenda);

            medicamento.setQuantidadeEstoque(medicamento.getQuantidadeEstoque()
                    - 1);

            System.out.println(String.format("\n\nRealizando venda sem desconto: %s",
                    medicamento.toString()));

            this.quantidadeMedicamentoVendidos++;

        } else {

            System.out.println("Operação inválida. \n"
                    + "Não há estoque do produto!");

        }

    }

    public void realizarVenda(Medicamento medicamento, Double valorVenda,
            Double valorBonus) {

        if (medicamento.getQuantidadeEstoque() >= 1) {

            Double desconto = valorVenda * valorBonus / 100;
            valorVenda -= desconto;

            medicamento.setValorVenda(valorVenda);
            medicamento.setValorTotalVendas(medicamento.getValorTotalVendas()
                    + valorVenda);

            medicamento.setQuantidadeEstoque(medicamento.getQuantidadeEstoque()
                    - 1);

            System.out.println(String.format("\n\nRealizando venda com desconto: %s"
                    + "Valor do Desconto: %.2f\n"
                    + "-".repeat(repeat),
                    medicamento.toString(), desconto));

            this.quantidadeMedicamentoVendidos++;
            this.quantidadeDescontosAplicados++;

        } else {

            System.out.println("Operação inválida. \n"
                    + "Não há estoque do produto!");

        }

    }

    public void cadastrarEstoque(Medicamento medicamento,
            Integer quantidadeCadastrarEstoque) {

        medicamento.setQuantidadeEstoque(quantidadeCadastrarEstoque);
        System.out.println(String.format("\n\n" + "-".repeat(repeat) + "\n"
                + "O estoque do produto %s foi aumentado!\n"
                + "-".repeat(repeat)
                + "\n\n",
                medicamento.getNomeMedicamento()));

    }

    @Override
    public String toString() {

        String frase = String.format("\n\n" + "-".repeat(repeat) + "\n"
                + "Farmacia %s\n"
                + "Quantidade de vendas: %d\n"
                + "Descontos aplicados: %d\n"
                + "-".repeat(repeat)
                + "\n",
                nome, quantidadeMedicamentoVendidos,
                quantidadeDescontosAplicados);

        return frase;
    }
}
