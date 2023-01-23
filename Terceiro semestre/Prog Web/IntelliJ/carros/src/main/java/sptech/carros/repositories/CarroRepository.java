package sptech.carros.repositories;

import antlr.ParserSharedInputState;
import org.springframework.data.jpa.repository.JpaRepository;
import sptech.carros.models.CarroModel;

import java.util.List;

public interface CarroRepository extends JpaRepository<CarroModel, Integer> {

    List<CarroModel> findByFabricanteVeiculosModelIdFabricante(int id);
    List<CarroModel> findByFabricanteVeiculosModelNome(String nome);
    List<CarroModel> findByFabricanteVeiculosModelNomeContains(String nome);

}
