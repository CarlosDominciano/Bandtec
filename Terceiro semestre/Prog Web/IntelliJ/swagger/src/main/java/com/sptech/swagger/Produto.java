package com.sptech.swagger;

public class Produto {

    private String nome;
    private double precoUnitario;
    private int quantidadeEstoque;

    public Produto(String nome, double precoUnitario, int quantidadeEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double getValorEmEstoque() {
        return precoUnitario*quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean validarNome(){
        if (nome.length() >= 2)
            return true;
        return false;
    }

    public boolean validarQuantidadeEstoque(){
        if (quantidadeEstoque >= 1)
            return true;
        return false;
    }

    public boolean validarPrecoUnitario(){
        if (precoUnitario >= 0.01)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoUnitario=" + precoUnitario +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", valorEmEstoque=" + getValorEmEstoque() +
                '}';
    }
}
