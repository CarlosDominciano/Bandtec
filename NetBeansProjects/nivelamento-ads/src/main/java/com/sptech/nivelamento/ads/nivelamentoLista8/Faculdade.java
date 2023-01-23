/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.nivelamento.ads.nivelamentoLista8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Faculdade {
    
    private String nome;
    private List<Aluno> alunos; 

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    
    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void cancelarAluno(String ra){
        
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equalsIgnoreCase(ra)) {
                alunos.get(i).setAtivo(false);
            }
        }
    }
    
    public void exibirAlunos() {
        for (Aluno alunoDaVez : alunos) {
            System.out.println(alunoDaVez);
        }
    }
    
    public void exibirAlunosPorSemestre(Integer semestre) {
        
        for (Aluno alunoDaVez : alunos) {
            
            if (alunoDaVez.getSemestre().equals(semestre)) {
                 System.out.println(alunoDaVez);
            }
            
        }
        
    }
    
    public void exibirCancelados() {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getAtivo().equals(false)) {
                System.out.println(alunos.get(i));
            }
        }
    }
    
    
    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", alunos=" + alunos + '}';
    }
    
}
