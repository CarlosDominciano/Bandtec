package sptech.projetojpa02.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.projetojpa02.dominio.AnimalEstimacao;

import java.util.List;

public interface AnimalEstimacaoRepository
                        extends JpaRepository<AnimalEstimacao, Long> {

    /*
    Aqui estamops usando Dynamic Finders
     */
    List<AnimalEstimacao> findByCpfDono(String cpf);

    List<AnimalEstimacao> findByCpfDonoAndEmailDono(String cpf, String email);

    List<AnimalEstimacao> findByCpfDonoAndEmailDonoOrderByNome(String cpf, String email);

    List<AnimalEstimacao> findByCpfDonoAndEmailDonoOrderByDataNascimentoDesc(String cpf, String email);

    List<AnimalEstimacao> findByCpfDonoContainsAndEmailDonoContains(String cpf, String email);

    List<AnimalEstimacao> findByCpfDonoContains(String cpf);

}
