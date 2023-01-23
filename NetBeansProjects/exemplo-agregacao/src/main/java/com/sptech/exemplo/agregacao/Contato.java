/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.exemplo.agregacao;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Contato {
    
    private String nome;
    private String telefone;
    private Boolean bloqueado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }
    
    
    public void bloquear(){
        if (this.bloqueado) {
            this.bloqueado = !this.bloqueado;
        }
    }
    
    public void desbloquear(){
        if (!this.bloqueado) {
            this.bloqueado = !this.bloqueado;
        }
    }

    @Override
    public String toString() {
        String bloqueadoTexto;
        if (this.bloqueado) {
            bloqueadoTexto = "Bloqueado";
        } else {
            bloqueadoTexto = "Desbloqueado";
        }
        String toStringVar = String.format(
                "/Contato\\\n"
                + "Nome: %s\n"
                + "Telefone: %s\n"
                + "Situação: %s\n\n"
                ,nome, telefone, bloqueadoTexto);
        return toStringVar;
    }

    
    
}
