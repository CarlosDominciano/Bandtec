package sptech.projetojpadtoquery.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpadtoquery.dominio.AvaliacaoMotorista;
import sptech.projetojpadtoquery.repositorio.AvaliacaoMotoristaRepository;
import sptech.projetojpadtoquery.repositorio.MotoristaRepository;
import sptech.projetojpadtoquery.repositorio.PassageiroRepository;
import sptech.projetojpadtoquery.requisicao.NovaAvaliacaoRequest;
import sptech.projetojpadtoquery.resposta.ResumoAvaliacoesMotoristaResponse;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/avaliacoes/motoristas")
public class AvaliacaoMotoristaController {

    //1. Crie uma versão melhorada do projeto "projeto-jpa-dto-query" apresentado na aula de hoje o qual...
    //
    //a) Tenha o EndPoint GET /avaliacoes/motoristas/{idMotorista} que retorna todas as avaliações feitas de
    // um determinado motorista, conforme o "idMotorista" enviado. #ficaDica: Já existe um método na AvaliacaoMotoristaRepository
    // que lhe ajudará a resolver esta questão
    //Caso encontre dados, a resposta deve ter um corpo como deste exemplo:



    //[
    //  {
    //    "id": 15,
    //    "dataHoraAvaliacao": "2022-10-24T18:47:31.038664",
    //    "nota": 3,
    //    "motorista": {
    //        "id": 2,
    //        "nome": "Zé Ruela",
    //        "dataInicio": "2019-01-10",
    //        "suspenso": true
    //    },
    //    "passageiro": {
    //        "id": 1,
    //        "nome": "Lady Gaga",
    //        "suspenso": true
    //    }
    //  },
    //  {
    //    "id": 16,
    //    "dataHoraAvaliacao": "2022-10-24T18:47:31.038664",
    //    "nota": 3,
    //    "motorista": {
    //        "id": 2,
    //        "nome": "Zé Ruela",
    //        "dataInicio": "2019-01-10",
    //        "suspenso": true
    //    },
    //    "passageiro": {
    //        "id": 2,
    //        "nome": "Jojo todinho",
    //        "suspenso": true
    //    }
    //  }
    //]
    //Caso não encontre dados, retorne status 204 e sem corpo de resposta.
    //Caso o "idMotorista" seja inválido, retorne 404 e sem corpo de resposta.
    //
    //
    //

    @Autowired
    private AvaliacaoMotoristaRepository avaliacaoMotoristaRepository;

    @Autowired
    private PassageiroRepository passageiroRepository;

    @Autowired
    private MotoristaRepository motoristaRepository;

    //b)  Tenha o EndPoint GET /avaliacoes/motoristas/{idMotorista}/simples que retorna todas as
    // avaliações feitas de um determinado motorista, conforme o "idMotorista" enviado, porém
    // com um JSON em versão simplificada. Você terá que usar a @Query e algum DTO.
    //Caso encontre dados, a resposta deve ter um corpo como deste exemplo:
    //[
    //  {
    //    "dataHoraAvaliacao": "2022-10-24T18:47:31.038664",
    //    "nota": 3,
    //    "idMotorista": 2,
    //    "idPassageiro": 3
    //  },
    //  {
    //    "dataHoraAvaliacao": "2022-10-11T09:22:31.01234",
    //    "nota": 5,
    //    "idMotorista": 1,
    //    "idPassageiro": 3
    //  }
    //]
    //Caso não encontre dados, retorne status 204 e sem corpo de resposta.
    //Caso o "idMotorista" seja inválido, retorne 404 e sem corpo de resposta.
    //

    @GetMapping("/{idMotorista}/simples")
    public ResponseEntity<Optional<ResumoAvaliacoesMotoristaResponse>> getAvaliacaoMotoristaSimples(@PathVariable @Valid int idMotorista){
        if (!motoristaRepository.existsById(idMotorista))
            return ResponseEntity.status(404).build();
        Optional<ResumoAvaliacoesMotoristaResponse> motoristaAvaliacoesSimples = avaliacaoMotoristaRepository.getResumoAvaliacoesMotorista(idMotorista);

        if (motoristaAvaliacoesSimples.isEmpty())
            return ResponseEntity.status(204).build();

        return ResponseEntity.status(200).body(motoristaAvaliacoesSimples);
    }

    @GetMapping("/{idMotorista}")
    public ResponseEntity<List<AvaliacaoMotorista>> getAvaliacaoMotorista(@PathVariable @Valid int idMotorista) {
        if (!motoristaRepository.existsById(idMotorista))
            return ResponseEntity.status(404).build();

        List<AvaliacaoMotorista> motoristaAvaliacoes = avaliacaoMotoristaRepository.findByMotoristaId(idMotorista);
        if (motoristaAvaliacoes.isEmpty())
            return ResponseEntity.status(204).build();

        return ResponseEntity.status(200).body(motoristaAvaliacoes);

    }

    @GetMapping("/nota-media/{idMotorista}")
    public ResponseEntity<Double> getMediaAvaliacoes(@PathVariable int idMotorista) {
        return ResponseEntity.of(avaliacaoMotoristaRepository.getMediaAvaliacoes(idMotorista));
    }

    @GetMapping("/resumo/{idMotorista}")
    public ResponseEntity<ResumoAvaliacoesMotoristaResponse> getResumoAvaliacoes(@PathVariable int idMotorista) {
        return ResponseEntity.of(avaliacaoMotoristaRepository.getResumoAvaliacoesMotorista(idMotorista));
    }

    @PostMapping
    public ResponseEntity<AvaliacaoMotorista> post(@RequestBody @Valid NovaAvaliacaoRequest novaAvaliacaoRequest) {

        if (!passageiroRepository.existsById(novaAvaliacaoRequest.getIdPassageiro())) {
            return ResponseEntity.status(404).build();
        }
        if (!motoristaRepository.existsById(novaAvaliacaoRequest.getIdMotorista())) {
            return ResponseEntity.status(404).build();
        }

        AvaliacaoMotorista novaAvaliacao = new AvaliacaoMotorista();

        novaAvaliacao.setPassageiro(
                passageiroRepository.findById(novaAvaliacaoRequest.getIdPassageiro()).get());
        novaAvaliacao.setMotorista(
                motoristaRepository.findById(novaAvaliacaoRequest.getIdMotorista()).get());

        novaAvaliacao.setNota(novaAvaliacaoRequest.getNota());

        avaliacaoMotoristaRepository.save(novaAvaliacao);

        return ResponseEntity.status(201).body(novaAvaliacao);
    }
}
