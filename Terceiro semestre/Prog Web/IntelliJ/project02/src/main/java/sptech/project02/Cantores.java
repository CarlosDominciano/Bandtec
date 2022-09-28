package sptech.project02;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Random;
import java.util.UUID;

public class Cantores {

    private Integer id;
    private String nome;
    private String categoria;
    private Double cache;
    private boolean constaNoSpotify;
    @JsonIgnore
    private String senha;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getCache() {
        return cache;
    }

    public boolean isConstaNoSpotify() {
        return constaNoSpotify;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCache(Double cache) {
        this.cache = cache;
    }

    public void setConstaNoSpotify(boolean constaNoSpotify) {
        this.constaNoSpotify = constaNoSpotify;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
