package sptech.projetojpadtoquery.controle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import sptech.projetojpadtoquery.repositorio.PassageiroRepository;
import sptech.projetojpadtoquery.resposta.PassageiroSimplesResponse;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class PassageiroControllerTest {

    @Autowired
    private PassageiroController controller;

    @MockBean
    private PassageiroRepository repository;

    @Test
    @DisplayName("Lista vazia 200")
    void getSimples() {
        when(repository.getPassageirosSimples()).thenReturn(List.of(
                new PassageiroSimplesResponse(1, null),
                new PassageiroSimplesResponse(2, null)
        ));
    }

}