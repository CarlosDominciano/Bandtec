package sptech.projetojpadtoquery.controle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import sptech.projetojpadtoquery.dominio.Motorista;
import sptech.projetojpadtoquery.repositorio.MotoristaRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class MotoristaControllerTest {

    @Autowired
    private MotoristaController controller;

    @MockBean
    private MotoristaRepository repository;

    @Test
    @DisplayName("Não retorna lista de motorista e retorna o status 204")
    void retornaComFalha() {

        when(repository.findAll()).thenReturn(new ArrayList<>());

        ResponseEntity<List<Motorista>> listaMotoristas = controller.get();

        assertEquals(204, listaMotoristas.getStatusCodeValue());
        assertNull(listaMotoristas.getBody());

    }

    @Test
    @DisplayName("Retorna lista de motorista e retorna o status 200")
    void retornaComSucesso() {

        when(repository.findAll()).thenReturn(List.of(
                new Motorista(),
                new Motorista()
        ));

        ResponseEntity<List<Motorista>> listaMotoristas = controller.get();

        assertEquals(200, listaMotoristas.getStatusCodeValue());
        assertTrue(listaMotoristas.getBody().size() > 0);

    }

}