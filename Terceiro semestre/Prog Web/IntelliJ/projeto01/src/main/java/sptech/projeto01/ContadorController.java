package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContadorController {
/*
As Controllers no Spring Boot são SINGLETONS (há apenas um, por exemplo um prefeito)
Portanto, os atributos de instãncia são "compartilhados" entre os clientes da API.
 */
    private int contador;

    @GetMapping("/contador")
    public int getContador() {
        contador++;
        return contador;
    }
}
