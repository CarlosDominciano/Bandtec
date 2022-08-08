package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemons") //indica o inicio de todos as chamadas dessa classe
public class PokemonController {

    List<String> pokemons = new ArrayList<>();

    @GetMapping
    public String home(){
        return "Bem vindos à API Pokemon" + pokemons.size();
    }

    @GetMapping("/cadastrar/{pokemon}")
    public String cadastrar(@PathVariable String pokemon){
        pokemons.add(pokemon);
        return "Pokemon cadastrado!";
    }

    @GetMapping("/get")
    public List<String> getPokemons() {
        return pokemons;
    }

    @GetMapping("/get/{n1}")
    public String getPokemons(@PathVariable int n1) {
        boolean isValid = n1 >=  pokemons.size() || n1 < 0;
        return isValid ? "invalido" : pokemons.get(n1);
    }

    @GetMapping("/remove/{n1}")
    public String removePokemons(@PathVariable int n1) {
        boolean isValid = n1 >=  pokemons.size() || n1 < 0;
        if (isValid) {
            pokemons.remove(n1);
            return "pokemon removido";
        }
        return "Pokemon inválido";
    }

    @GetMapping("/update/{n1}/{nome}")
    public String updatePokemons(@PathVariable int n1, @PathVariable String nome) {
        boolean isValid = n1 >=  pokemons.size() || n1 < 0;
        if (!isValid) {
            pokemons.set(n1, nome);
            return "pokemon atualizado";
        }
        return "Pokemon inválido";
    }
}
