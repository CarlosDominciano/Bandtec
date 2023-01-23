package sptech.projetojpa02.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpa02.dominio.AnimalEstimacao;
import sptech.projetojpa02.repositorio.AnimalEstimacaoRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class AnimalEstimacaoController {

    @Autowired
    private AnimalEstimacaoRepository repository;

    @PostMapping
    public ResponseEntity postPet(
            @RequestBody @Valid AnimalEstimacao novoPet) {
        repository.save(novoPet);
        return ResponseEntity.status(201).build();
    }

//    ?cpf=???? -> indice que temos um parametro de requisição
//    O primeiro paramentro de requisição é precedido por "?", os demais são precedidos por "&"
//    Exemplo:
//    ?cpf=45750262049&email=aaa@aa.com&bairro=centro
//    é o mesmo que
//    ?email=aaa@aa.com&cpf=45750262049&bairro=centro

//    Na anotação do @RequestParam o parametro é obrigatorio por padrao, se quiser deixa-lo opcional, usamos
//    'required = false' dentro dele

//    @RequestParam e @PathParam não se misturam, só pode ter um dos dois na sua requisição

    @GetMapping //testar: localhost:8080/pets?cpf=45750262049
    public ResponseEntity getPets(@RequestParam(required = false) String cpf) {
        if (cpf == null)
            return ResponseEntity.status(200).body(repository.findAll());
        else {
            List<AnimalEstimacao> pets = repository.findByCpfDonoContains(cpf);
            return ResponseEntity.status(200).body(pets);
        }
    }
}
