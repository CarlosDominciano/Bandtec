package sptech.project02;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    private List<Investimento> investimentos = new ArrayList<>();

    @GetMapping // Método: GET - URI: /investimentos. Agora precisa do Método e da URI.
    public List<Investimento> getInvestimentos() {
        return investimentos;
    }

    @PostMapping // Método: POST - URI: /investimentos.
    public Investimento postInvestimento(@RequestBody Investimento novo) {
        investimentos.add(novo);
        return novo;
    }

    @GetMapping("/{posicao}")
    public Investimento getInvestimento(@PathVariable int posicao) {
        return investimentos.get(posicao);
    }

    @DeleteMapping("/{posicao}")
    public String deleteInvestimento(@PathVariable int posicao) {
         investimentos.remove(posicao);
         return "Excluído com sucesso";
    }

    @PutMapping("/{posicao}")
    public Investimento updateInvestimento(@PathVariable int posicao,
                                           @RequestBody Investimento novo) {
        investimentos.set(posicao, novo);
        return novo;
    }
}
