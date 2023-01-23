package org.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Herói {

    private String nome;
    private Integer pontos;
    private RankingEnum ranking;

    public Herói(String nome, Integer pontos) {
        this.nome = nome;
        this.pontos = pontos;
        this.ranking = RankingEnum.getPorPontos(pontos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public RankingEnum getRanking() {
        return ranking;
    }

    public void setRanking(RankingEnum ranking) {
        this.ranking = ranking;
    }

    public void registrarVitoria() {
        this.pontos = ThreadLocalRandom.current().nextInt(10, 44);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Herói{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", pontos=").append(pontos);
        sb.append(", ranking=").append(ranking);
        sb.append('}');
        return sb.toString();
    }
}

//        Crie um programa Java que:
//        1. Tenha uma classe Heroi ou Heroina, com as seguintes características:
//
//        Nome
//        Pontos
//        Ranking (ENUM)
//        Métodos:
//
//        registrarVitoria(), deve:
//        aumentar a pontuação: bonus de vitória + (pontuacao atual * numero aleatório (1 e 20);
//        alterar  classe do heroi baseado na nova pontuação
