/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.soul.reaver;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Personagens {
    private String nome;
    private String clan;
    private String ability;

    public String getNome() {
        return nome;
    }

    public Personagens(String nome, String clan, String ability) {
        this.nome = nome;
        this.clan = clan;
        this.ability = ability;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
    
    
    
}
