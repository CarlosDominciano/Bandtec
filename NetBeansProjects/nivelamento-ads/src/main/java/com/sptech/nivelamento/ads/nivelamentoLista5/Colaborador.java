/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.nivelamentoLista5;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Colaborador {
    
    private String nome;
    private String cargo;
    private Double salario;

    public Colaborador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 1000.0;
    }
    
     public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        String frase = String.format("\n\nColaborador\n"
                + "Nome: %s.\t Cargo: %s\n"
                + "Salário: %.2f\n\n",
                nome, cargo, salario);
        return frase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
}
