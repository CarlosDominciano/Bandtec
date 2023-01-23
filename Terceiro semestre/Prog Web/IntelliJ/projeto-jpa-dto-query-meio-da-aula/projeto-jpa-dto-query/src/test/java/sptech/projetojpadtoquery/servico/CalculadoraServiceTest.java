package sptech.projetojpadtoquery.servico;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    CalculadoraService calculadoraService = new CalculadoraService();


    @Test
    @DisplayName("calcularPrecoCorrida() deve calcular corretamente")
    void calcularPrecoCorrida_deveCalcularCorretamente() {

        double resultado = calculadoraService.calcularPrecoCorrida(1.0);
        double resultado2 = calculadoraService.calcularPrecoCorrida(2.0);
        double resultado3 = calculadoraService.calcularPrecoCorrida(3.0);
        double resultado4 = calculadoraService.calcularPrecoCorrida(4.0);

        assertEquals(12.0, resultado);
        assertEquals(24.0, resultado2);
        assertEquals(36.0, resultado3);
        assertEquals(48.0, resultado4);
    }

    @Test
    @DisplayName("calcularPrecoCorrida() deve lançar exceção p/ km errada")
    void calcularPrecoCorrida_kmInvalida(){

        assertThrows(ResponseStatusException.class, ()
                -> calculadoraService.calcularPrecoCorrida(-3.5));
        assertThrows(ResponseStatusException.class, ()
                -> calculadoraService.calcularPrecoCorrida(-2.5));
        assertThrows(ResponseStatusException.class, ()
                -> calculadoraService.calcularPrecoCorrida(null));
    }


    @Test
    @DisplayName("calcularPrecoCorrida() deve lançar exceção p/ km errada")
    void calcularPrecoCorrida_kmInvalida_detalhes() {

        ResponseStatusException excesao = assertThrows(ResponseStatusException.class, ()
                -> calculadoraService.calcularPrecoCorrida(-3.5));

        assertEquals("Distância deve ser >= 0", excesao.getReason());
        assertEquals(400, excesao.getRawStatusCode());

        ResponseStatusException excesao2 = assertThrows(ResponseStatusException.class, ()
                -> calculadoraService.calcularPrecoCorrida(null));

        assertEquals("Distância não pode ser nula", excesao2.getReason());
        assertEquals(400, excesao2.getRawStatusCode());
    }

    @Test
    @DisplayName("CalculadoraService está anotada com @Service")
    void testarAnotacaoService() {
        Class classe = calculadoraService.getClass();
//        assertTrue(classe.isAnnotationPresent(Service.class));
        assertTrue(classe.isAnnotationPresent(Service.class),
                "A anotação @Service não foi encontrada");

    }
}