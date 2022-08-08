package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Struct;
import java.util.concurrent.ThreadLocalRandom;

/*
@RestController -> Isto é uma ANOTAÇÃO (annotation)
Esta anotação indica que a classe será uma Controladora REST.
Ou seja, ela poderá ter CHAMADAS da API.
 */

@RestController
public class FrasesController {
/*
A anotação @GetMapping transforma o método anotado
em uma CHAMADA DA API REST do projeto.
 */
    @GetMapping
    public String cumprimentar() {
        return "CAVALO NA REST API";
    }

    @GetMapping("/despedida") //http://localhost:8080/despedida
    public String despedir() {
        return "IPA TSER AD ODNIAS OLAVAC";
    }

    @GetMapping("/elogiar")
    public String elogiar() {
        return "BELO PAU";
    }

    /*
    Aqui a URI contém PATH PARAMS
    Ou seja, partes dinâmicas que influenciam no resultado
    Os path params aqui são n1 e n2.
    Eles foram assosiados aos parâmetros de mesmo nome do método
    devido às anotações @PathVariable em cada parâmetro.
     */
    @GetMapping("/somar/{n1}/{n2}")
    public String somar(@PathVariable int n1,@PathVariable long n2) {
        return String.format("%d + %d é igual a %d", n1, n2, n1+n2);
    }

    @GetMapping("maior/{n1}/{n2}")
    public String maior(@PathVariable double n1,
                        @PathVariable double n2){

//        String frase = "O maior é ";
//        if (n2 > n1) {
//            return frase + n2;
//        }
        return "o maior é " + Double.max(n1, n2);
    }

    @GetMapping("sorteio/{n1}")
    public String sorteio(@PathVariable int n1){
//        int sorte = ThreadLocalRandom.current().nextInt(0, 10);
//        if (sorte == n1) {
//            return "Parabens, que sorte!" + sorte;
//        }
//        return "Deu ruim" + sorte;

        int sorte = ThreadLocalRandom.current().nextInt(0, 10);
        boolean sortudo = n1 == sorte;

        return sortudo ? "Parabens" + sorte : "Ruim" + sorte;
    }
}
