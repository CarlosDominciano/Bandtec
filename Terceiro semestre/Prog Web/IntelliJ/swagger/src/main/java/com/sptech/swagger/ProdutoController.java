package com.sptech.swagger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    //1. Crie uma API REST que tenha:
    //
    //a) Uma documentação em Swagger / Open API acessível via navegador
    //
    //b) Um EndPoint POST /produto, que recebe um JSON como este:
    //{
    //  "nome": "Batata",
    //  "precoUnitario": 12.50,
    //  "quantidadeEstoque": 200.75
    //}
    //Ele só deve aceitar "nome" com pelo menos 2 letras, e os 2 outros campos com valor >= 0.01.
    //Retorne os status HTTP corretos para o caso de cadastro com sucesso ou erro de validação.
    //
    //Se cadastrado, retorne o JSON do produto recém cadastrado.
    //




    private List<Produto> produtos = new ArrayList<>();

    @PostMapping
    public ResponseEntity cadastrarProduto(@RequestBody Produto novoProduto){
        if (novoProduto.validarNome()
                && novoProduto.validarQuantidadeEstoque()
                && novoProduto.validarPrecoUnitario()){
            produtos.add(novoProduto);
            return ResponseEntity.status(201).body(novoProduto);
        }
        return ResponseEntity.status(401).body("O nome deve ter 2 ou mais caracteres");
    }

    @GetMapping
    public ResponseEntity pegarProdutos(){
        if (!produtos.isEmpty())
            return ResponseEntity.status(200).body(produtos);
        return ResponseEntity.status(204).body("E não veio mais ninguém...");
    }


    @DeleteMapping("/{posicao}")
    public ResponseEntity excluirProduto(@PathVariable int posicao){
        if (!(posicao < produtos.size()))
            return ResponseEntity.status(400).body("Posição inválida");
        return ResponseEntity.status(200).body(produtos.get(posicao));
    }
    //d) Um Endpoint DELETE /produtos/{posicao}, que retorna, caso a "posicao"
    // seja válida, o JSON do produto encontrado.
    //Retorne os status HTTP corretos para cada situação possível.









}
