package sptech.projetojparelacionamentos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sptech.projetojparelacionamentos.dominio.Pais;
import sptech.projetojparelacionamentos.repositorio.PaisRepositorio;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisController {

    @Autowired
    private PaisRepositorio paisRepositorio;

    @GetMapping
    public ResponseEntity<List<Pais>> get() {
        return ResponseEntity.status(200).body(paisRepositorio.findAll());
    }

    @PostMapping
    public ResponseEntity<Pais> post(@RequestBody Pais novoPais) {
        paisRepositorio.save(novoPais);
        return ResponseEntity.status(201).body(novoPais);
    }

    @GetMapping("/continente-id/{idContinente}")
    public ResponseEntity<List<Pais>> getCont(@PathVariable int idContinente) {
        List<Pais> paises = paisRepositorio.findByContinenteIdContinente(idContinente);

        return ResponseEntity.status(200).body(paises);
    }

}
