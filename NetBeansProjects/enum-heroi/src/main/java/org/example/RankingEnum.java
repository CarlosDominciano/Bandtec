package org.example;

public enum RankingEnum {

    S("Lendário"),
    A("Muito forte"),
    B("Mediano"),
    C("Fraco");

    private String descricao;

    RankingEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public static RankingEnum getPorPontos(Integer pontos) {

        if (pontos <= 10000){
            return C;
        } else if (pontos <= 20000) {
            return B;
        } else if (pontos <= 100000) {
            return A;
        } else {
            return S;
        }
    }
}