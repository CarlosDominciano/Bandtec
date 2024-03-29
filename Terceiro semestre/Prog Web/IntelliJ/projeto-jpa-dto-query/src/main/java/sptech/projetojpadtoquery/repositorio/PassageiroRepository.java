package sptech.projetojpadtoquery.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sptech.projetojpadtoquery.dominio.Motorista;
import sptech.projetojpadtoquery.dominio.Passageiro;
import sptech.projetojpadtoquery.resposta.MotoristaSimplesResponse;
import sptech.projetojpadtoquery.resposta.PassageiroSimplesResponse;

import java.util.List;

public interface PassageiroRepository extends JpaRepository<Passageiro, Integer> {

    @Query("SELECT new sptech.projetojpadtoquery.resposta.PassageiroSimplesResponse(p.id, p.nome) " +
            "FROM Passageiro p WHERE p.suspenso=false")
    List<PassageiroSimplesResponse> getPassageiroSimples();



}
