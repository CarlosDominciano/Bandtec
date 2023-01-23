package sptech.projetojpadtoquery.controle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpadtoquery.dominio.Passageiro;
import sptech.projetojpadtoquery.repositorio.MotoristaRepository;
import sptech.projetojpadtoquery.repositorio.PassageiroRepository;
import sptech.projetojpadtoquery.resposta.MotoristaSimplesResponse;
import sptech.projetojpadtoquery.resposta.PassageiroSimplesResponse;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/passageiros")
public class PassageiroController {

    @Autowired
    private PassageiroRepository passageiroRepository;

    //b) Tenha o EndPoint DELETE /passageiros/{idPassageiro} que desativa um determinado
    // passageiro, conforme o "idPassageiro" enviado.
    //O processo de desativar é apenas mudar o seu "suspenso" para true. Não é para excluir
    // o passageiro! Veja como fazer isso na apostila "Spring JPA com Relacionamentos
    // e Query - Guia de Referência".
    //Para conferir que o passageiro foi desativado, use algum endpoint que já existe
    // ou acesse o h2-console que está habilitado no projeto.
    //
    //Se tudo der certo ele apenas retorna status 200 sem corpo.
    //Caso o "idPassageiro" seja inválido, retorne 404 e sem corpo de resposta.

    @DeleteMapping("/{idPassageiro}")
    public ResponseEntity<Optional<PassageiroSimplesResponse>> deleteSimples(@PathVariable @Valid int idPassageiro) {
        Optional<Passageiro> passageiro = passageiroRepository.findById(idPassageiro);
        if (!passageiro.get().isSuspenso())
            return ResponseEntity.status(404).build();
        passageiro.get().setSuspenso(true);
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/simples")
    public ResponseEntity<List<PassageiroSimplesResponse>> getSimples() {
        return ResponseEntity.status(200).body(passageiroRepository.getPassageiroSimples());
    }




}
