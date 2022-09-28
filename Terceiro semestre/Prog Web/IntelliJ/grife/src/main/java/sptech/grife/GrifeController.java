package sptech.grife;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//1. Crie uma API de Grifes de roupa (Hering, Lacoste, Aramis etc) cujas chamadas são:
//
//a) POST /grifes que recebe um JSON como este:
//{
//   "nome": "Aramis",
//   "anoCriacao": 1970,
//   "valorAcaoBolsa": 15.5,
//   "chaveAcesso": "aaawwwhhhqqq"
//}
//
//b) GET /grifes que retorna um vetor de JSONs com todas as grifes cadastradas. Porém,
// no JSON NÃO deve vir o campo "chaveAcesso".
//
//c) PUT /grifes/{posicao}  {JSON de uma grife com a mesma estrutura de a)} que,
// caso exista uma grife na posição indicada (posição na lista, iniciando de 0),
// atualiza o registro com os dados do JSON enviado no corpo da requisição. A chamada deve
// retornar o JSON da grife atualizada SEM o campo "chaveAcesso" caso a posição for válida
// ou nada (null) em caso contrário.
//
//d) DELETE /grifes/{posicao} que, caso exista uma grife na posição indicada (posição na lista,
// iniciando de 0), ele exclui essa grife e retorna a frase "Grife excluída". Caso a posição for
// inválida, retorna "Não encontrada".

@RestController
@RequestMapping("/grifes")
public class GrifeController {

    List<Grife> grifes = new ArrayList<>();

    @PostMapping
    public Grife cadastrarGrife(@RequestBody Grife novo) {

        grifes.add(novo);
        return novo;
    }

}
