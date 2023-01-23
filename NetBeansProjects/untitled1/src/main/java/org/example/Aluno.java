package org.example;

public class Aluno {
    private String nome;
    private String id;
    private AssinaturaEnum assinatura;
    private Integer qntCursos;

    public Aluno(String nome, String id, Integer qntCursos) {
        this.nome = nome;
        this.id = id;
        this.qntCursos = qntCursos;
        this.assinatura = AssinaturaEnum.getPorQtdCursos(qntCursos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AssinaturaEnum getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(AssinaturaEnum assinatura) {
        this.assinatura = assinatura;
    }

    public Integer getQntCursos() {
        return qntCursos;
    }

    public void setQntCursos(Integer qntCursos) {
        this.qntCursos = qntCursos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aluno{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", assinatura='").append(assinatura).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
