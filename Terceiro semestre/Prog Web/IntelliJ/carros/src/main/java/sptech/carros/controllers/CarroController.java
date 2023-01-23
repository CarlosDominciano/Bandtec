package sptech.carros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.carros.models.CarroModel;
import sptech.carros.repositories.CarroRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {


    //b) Para que o JSON seja aceito pelo EndPoint descrito em a),
    // as validações são:
    //    "modelo": é obrigatório e deve ter pelo menos 2 e
    //    no máximo 12 letras
    //    "fabricante": é obrigatório e deve ter pelo menos
    //    2 e no máximo 10 letras
    //    "dataFabricacao": data com valor de hoje ou data
    //    passada. Não é obrigatório
    //    "anoFabricacao": valor inteiro, com valor mínimo
    //    de 1960 e máximo de 2021. Campo obrigatório
    //    "potenciaMotor": valor real, com mínimo 0.2 e
    //    máximo 7.0. Campo obrigatório
    //

    //c) GET /carros, que retorna uma lista de JSON de todos
    // os carros cadastrados. Ele pode não retornar nada no
    // corpo, caso nenhum carro estiver cadastrado na API.
    // Devolva os status HTTP corretos para cada situação.
    //
    //d) GET /carros/{id}, que retorna um JSON do carro
    // cujo "idCarro" for igual ao "id" informado na URI.
    // Ele pode não retornar nada no corpo, caso nenhum carro
    // for encontrado. Devolva os status HTTP corretos para cada
    // situação.

    @Autowired
    private CarroRepository carroRepository;

    @PostMapping
    public ResponseEntity<CarroModel> post(@RequestBody @Valid CarroModel novoCarro) {
        carroRepository.save(novoCarro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCarro);
    }

    @GetMapping
    public ResponseEntity<List<CarroModel>> get(){
        List<CarroModel> lista = carroRepository.findAll();
        return lista.isEmpty()
                ? ResponseEntity.status(HttpStatus.NO_CONTENT).build()
                : ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarroModel> getById(@PathVariable int id){
        return ResponseEntity.of(carroRepository.findById(id));
    }

    @GetMapping("/fabricante-nome")
    public ResponseEntity<List<CarroModel>> getCarrosByFabricanteNome(@RequestParam(required = false) String nome) {
        List<CarroModel> carros = carroRepository.findByFabricanteVeiculosModelNomeContains(nome);
        if (carros.isEmpty())
            return ResponseEntity.status(204).build();
        return ResponseEntity.status(200).body(carros);
    }




}
