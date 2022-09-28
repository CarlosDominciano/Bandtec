package sptech.project03;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/frutas")
public class FrutaController {

    private List<Fruta> frutas = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Fruta>> getFrutas() {
        if (frutas.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(frutas);
    }

    @PostMapping("/favorita")
    public ResponseEntity<Fruta> favorita(){
        Fruta favorita = new Fruta("Uva", 9.99);
        frutas.add(favorita);
        return ResponseEntity.status(201).body(favorita);
    }

    @PostMapping
    public void adicionarFruta(@RequestBody Fruta novafruta){
        frutas.add(novafruta);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Fruta> frutaNoId(@PathVariable UUID id) {
//        for (Fruta frutaDaVez : frutas){
//            if (frutaDaVez.getId().equals(id)){
//                return ResponseEntity.status(200).body(frutaDaVez);
//            }
//        }
//        return ResponseEntity.status(404).build();
//    }

    @GetMapping("/{posicao}")
    public ResponseEntity<Fruta> frutaNaPosicao(@PathVariable int posicao) {
            if (posicao >=0 && posicao < frutas.size()) {
                return ResponseEntity.status(200).body(frutas.get(posicao));
            }
        return ResponseEntity.status(404).build();
    }

    @PostMapping
    public ResponseEntity post(@RequestBody Fruta novaFruta){
        if (novaFruta.getNome()== null ||
        novaFruta.getNome().isBlank()){
            return ResponseEntity.status(400).body("Nome deve ter uma ou mais letras");
        }
        if (novaFruta.getPreco() != null &&
        novaFruta.getPreco() <0.0){
            return ResponseEntity.status(400).body("Preço deve ser maior que 0");
        }

        frutas.add(novaFruta);
        return  ResponseEntity.status(201).body(novaFruta);

    }




}
