package com.sptech.projeto.encapsulamento1;

public class Aluno {

    /*
        Existem alguns modificadores de acesso, são eles:
            default
            public
            private 
            protected
    
     */
    private String ra;    //Identificador deixar em String por problema de 0 a esquerda.
    private String nome;
    private String curso;
    private Double nota1;
    private Double nota2;

    public Aluno(String ra, String nome, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    /*
        GET...
        SET...
     */
    
    public Boolean isAprovado(){
        return getMedia() >= 6;
    }
    public Double getMedia() {
        Double media = (nota1 + nota2) / 2;
        return media;
    }

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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        if (nota1 >= 0.0 && nota1 <= 10.0) {
            this.nota1 = nota1;
        }
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        if (nota2 >= 0.0 && nota2 <= 10.0) {
            this.nota2 = nota2;
        }
    }

    @Override
    public String toString() {
        return "ra: " + ra + "\nnome: " + nome + "\ncurso: " + curso
                + "\nnota1: " + nota1 + "\nnota2: " + nota2;
    }

}
