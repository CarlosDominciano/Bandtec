package sptech.project02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois") //todas as chamadas sarão /herois/<algo>
public class HeroiController {

    private List<Heroi> herois = new ArrayList<>(List.of(
            new Heroi("Moraes", "Minerar Bitcoin", 100.0, true),
            new Heroi("Cindy", "Máfia infinita", 50.7, true),
            new Heroi("Machintosh", "E o nargas?", 20.0, false)
    ));

    @GetMapping("/favorito")
    public Heroi heroiFavorito() {
        Heroi favorito = new Heroi("Brandão Jr", "Ser sobrinho do Brandão", 999.9, true);
        return favorito;
    }

    @GetMapping
    public List<Heroi> getHerois() {
        return herois;
    }

    @GetMapping("/{indice}")
    public Heroi getHeroiPorIndice(@PathVariable int indice) {
        if (indice >= 0 && indice < herois.size()) {
            return herois.get(indice);
        }
            return null;
    }

    @GetMapping("/cadastrar/{nome}/{poder}/{forca}/{vivo}")
    public Heroi cadastraHeroi(@PathVariable String nome,
                                   @PathVariable String poder,
                                   @PathVariable double forca,
                                   @PathVariable boolean vivo) {

        Heroi novoHeroi = new Heroi(nome, poder, forca, vivo);
        herois.add(novoHeroi);

        return novoHeroi;
    }


    @GetMapping("/atualiza/{indice}/{nome}/{poder}/{forca}/{vivo}")
    public Heroi atualizaHeroi(@PathVariable int indice,
                               @PathVariable String nome,
                               @PathVariable String poder,
                               @PathVariable double forca,
                               @PathVariable boolean vivo) {

        if (indice>=0 && indice<herois.size()) {
            Heroi heroiatualizado = new Heroi(nome, poder, forca, vivo);
            herois.set(indice, heroiatualizado);
            return heroiatualizado;
        }
        return null;
    }



}
