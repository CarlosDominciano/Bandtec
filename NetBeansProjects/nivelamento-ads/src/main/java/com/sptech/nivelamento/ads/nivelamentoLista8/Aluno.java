/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.nivelamentoLista8;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Aluno {
    
    private String ra;
    private String nome;
    private Integer semestre;
    private Boolean ativo;

    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    
    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        this.semestre = 1;
        this.ativo = true;
    }

    
    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + ", semestre=" + semestre + ", ativo=" + ativo + '}';
    }
    
}
