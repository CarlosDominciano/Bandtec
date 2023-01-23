package sptech.carros.models;

import javax.persistence.*;

@Entity
public class FabricanteVeiculosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFabricante;

    @Column(length = 15)
    private String nome;

    public Integer getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(Integer idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}