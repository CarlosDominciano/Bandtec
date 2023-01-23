package sptech.projetojpadtoquery.controle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import sptech.projetojpadtoquery.repositorio.AvaliacaoMotoristaRepository;
import sptech.projetojpadtoquery.repositorio.MotoristaRepository;
import sptech.projetojpadtoquery.repositorio.PassageiroRepository;
import sptech.projetojpadtoquery.resposta.PassageiroSimplesResponse;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;
@SpringBootTest
class AvaliacaoMotoristaControllerTest {

    @Autowired
    private AvaliacaoMotoristaController controller;

    @MockBean
    private AvaliacaoMotoristaRepository avalicaoRepository;

    @MockBean
    private MotoristaRepository motoristaRepository;

    @MockBean
    private PassageiroRepository passageiroRepository;

    @Test
    @DisplayName("Verifica média avaliação presente")
    void mediaAvaliacaoExiste(){
        when(avalicaoRepository.getMediaAvaliacoes(anyInt()))
                .thenReturn(Optional.of(25.0));

        ResponseEntity<Double> mediaAvaliacoes =
                controller.getMediaAvaliacoes(1);

        assertEquals(200, mediaAvaliacoes.getStatusCodeValue());
        assertNotNull(mediaAvaliacoes.getBody());

    }

    @Test
    @DisplayName("Verifica média avaliação não presente")
    void mediaAvaliacaoNaoExiste(){
        when(avalicaoRepository.getMediaAvaliacoes(anyInt()))
                .thenReturn(Optional.empty());

        ResponseEntity<Double> mediaAvaliacoes =
                controller.getMediaAvaliacoes(1);

        assertEquals(404, mediaAvaliacoes.getStatusCodeValue());
        assertNull(mediaAvaliacoes.getBody());

    }

    @Test
    @DisplayName("Verifica motorista e passageiro valido")
    void motoristaEPassageiroExistem(){
        when(repository.getPassageirosSimples()).thenReturn(List.of(
                new PassageiroSimplesResponse(1, null),
                new PassageiroSimplesResponse(2, null)
        ));

        ResponseEntity<Double> mediaAvaliacoes =
                controller.getMediaAvaliacoes(1);

        assertEquals(404, mediaAvaliacoes.getStatusCodeValue());
        assertNull(mediaAvaliacoes.getBody());

    }



    //1. No projeto que usamos em aula hoje, implemente
    // os seguintes cenários de teste para o método post() da classe AvaliacaoMotoristaController:
    //
    //a) Deve ocorrer uma ResponseStatusException caso o id do passageiro não exista no banco
    //
    //b) Deve ocorrer uma MotoristaNaoExisteException caso o id do motorista não exista no banco
    //
    //c) Caso os id do passegeiro e do motorista existirem no banco, o retorno do método deve
    // ser um ResponseEntity com:
    //     c.1) status 201
    //     c.2) corpo não nulo
    //     c.3) o atributo "nota" do objeto do corpo da resposta deve ser igual ao
    //     atributo "nota" enviado no corpo da requisição
}