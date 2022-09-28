package sptech.project02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cantores")
public class CantoresController {

    private List<Cantores> cantores = new ArrayList<>();

    @PostMapping
    public Cantores postCantor(@RequestBody Cantores novoCantor){
        novoCantor.setId(cantores.size()+1);
        cantores.add(novoCantor);
        return novoCantor;
    }

    @GetMapping("/{id}")
    public Cantores getCantor(@PathVariable int id) {
        for (Cantores c : cantores) {
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }

//    @GetMapping("/{id}")
//    public Cantores getModerno(@PathVariable int id) {
//        return cantores.stream()
//                .filter(cantor -> cantor.getId() == id)
//                .findFirst().orElse(null);
//    }

    @GetMapping("/celebridades")
    public List<Cantores> getCelebridade() {
        List<Cantores> celebridades = cantores.stream()
                .filter(c -> c.getCache() > 100_000)
                .collect(Collectors.toList());
        return celebridades;
    }

    @PutMapping("/{id}")
    public Cantores putCantor(@PathVariable int id,
                              @RequestBody Cantores update){
       for (Cantores c : cantores) {

           if (c.getId() == id) {
               c.setNome(update.getNome());
               c.setCache(update.getCache());
               c.setCategoria(update.getCategoria());
               c.setConstaNoSpotify(update.isConstaNoSpotify());

               return c;
           }

       }
       return null;
    }


}
