package sptech.project03;

import java.util.UUID;

public class Fruta {

    private UUID id = UUID.randomUUID();
    private String nome;
    private double preco;
    //BigDecimal eh melhor pra money


    public Fruta(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
}
