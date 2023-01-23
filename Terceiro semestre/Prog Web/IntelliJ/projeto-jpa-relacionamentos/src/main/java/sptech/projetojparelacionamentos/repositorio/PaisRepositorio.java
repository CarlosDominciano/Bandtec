package sptech.projetojparelacionamentos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sptech.projetojparelacionamentos.dominio.Pais;

import java.util.List;

public interface PaisRepositorio extends JpaRepository<Pais, Integer> {

    List<Pais> findByContinenteIdContinente(int id);
    List<Pais> findByContinenteNome(String nome);
    List<Pais> findByContinenteNomeContains(String nome);
}
