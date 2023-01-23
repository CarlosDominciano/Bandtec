/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.exemplo.agregacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Grupo {
    
    private String nome;
    private List<Contato> contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }
    
    
    public void adiciona(Contato contato){
        if (contatos.contains(contato)) {
            System.out.println("Já tem");
        } else {
            contatos.add(contato);
        }
    }
    
//    public void adiciona(String nome, String telefone, Boolean bloqueado) {
//        this.contatos.add(new Contato(nome, telefone, bloqueado));
//        Contato contato = new Contato(nome, telefone, bloqueado);
//    }
    
    public void remove(Contato contato){
        if (contatos.contains(contato)) {
            contatos.remove(contato);
        } else {
            System.out.println("Não tem");
        }
    }

    @Override
    public String toString() {
        String frase = String.format("/Informações do grupo\\\n"
                + "Nome: %s\n"
                + "Quantidade de integrantes: %d\n\n", nome, contatos.size());
        return frase;
    }
    
    
    
}
