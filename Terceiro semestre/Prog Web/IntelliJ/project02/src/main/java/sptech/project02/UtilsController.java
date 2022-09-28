package sptech.project02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilsController {

    @GetMapping
    public String cavalo() {
        return "<div style='display: flex; justify-content: center; " +
                "align-items: center; background: midnightblue; color: white; flex-wrap: wrap; " +
                "font-size: 100px;' id='cavalo'></div> " +
                "<input type='text' oninput='registrar()' id='input'>" +
                "<script>" +
                "function registrar() { cavalo.innerHTML = input.value }" +
                "</script>";
    }

    @GetMapping("/pode-votar/{idade}")
    public String podeVotar(@PathVariable int idade) {

        return idade >= 18 ? "Você pode votar (true)" : "Você não pode votar (false)";
    }

    @GetMapping("/imc/{peso}/{altura}")
    public Double imc(@PathVariable double peso, @PathVariable double altura) {
        Double imc = peso / Math.pow(altura, 2);
        return imc;
    }

    @GetMapping("/campanha/{vit}/{emp}/{derr}")
    public String campanha(@PathVariable int vit, @PathVariable int emp, @PathVariable int derr ) {
        int pontosPossiveis = (vit + emp + derr) * 3;
        int pontosObtidos = vit*3 + emp;
//        No java a divisão entre dois inteiros,
//        Sempre result em inteiro (seja int ou Integer)
        double aproveitamento = (double) pontosObtidos / pontosPossiveis * 100;

        return String.format("O aproveitamento" +
                " da campanha do time foi de %.2f%%", aproveitamento);
    }

}
