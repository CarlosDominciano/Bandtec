package sptech.correcao01;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    @PostMapping
    public ResponseEntity postUsuario(@RequestBody Usuario novoUsuario) {
        if (novoUsuario.getNome() == null ||
        novoUsuario.getNome().length() < 3 ||
        novoUsuario.senhaHasCaract()){
            return ResponseEntity.status(400).body("Deve ter nome ou um nome maior doq 3 caracteres");
        }
        return ResponseEntity.status(201).body(novoUsuario);
    }

    @PostMapping("/autenticacao/{usuario}/{senha}")
    public ResponseEntity logonUsuario(@PathVariable String usuario,
                                @PathVariable String senha) {
        for (Usuario usuarioAtual : usuarios) {
            if (usuarioAtual.autenticar(usuario, senha)) {
                return ResponseEntity.status(200).body(usuarioAtual);
            }
        }
        return ResponseEntity.status(401).build();
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuarios() {
        if (usuarios.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(usuarios);
    }

    @DeleteMapping("/autenticacao/{usuario}")
    public ResponseEntity logoffUsuario(@PathVariable String usuario) {
        for (Usuario usuarioAtual : usuarios) {
            if (usuarioAtual.getUsuario().equals(usuario)) {
                if (usuarioAtual.isAutenticado()) {
                    usuarioAtual.setAutenticado(false);
                    return ResponseEntity.status(200).body(String
                            .format("Logoff do usuário %s concluído", usuarioAtual.getNome()));
                } else {
                    return ResponseEntity.status(403).body(String
                            .format("Usuário %s NÃO está autenticado", usuarioAtual.getNome()));
                }
            }
        }
        return ResponseEntity.status(401).build();
    }

    // EndPoints extras:

    @GetMapping("/autenticados")
    public ResponseEntity getUsuariosAutenticados() {
        if (usuarios.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(usuarios.stream()
                .filter(Usuario::isAutenticado)
                .collect(Collectors.toList()));
    }

    @DeleteMapping("/autenticacao")
    public ResponseEntity logoffGeral() {
        for (Usuario usuario : usuarios) {
            usuario.setAutenticado(false);
        }
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/relatorio")
    public ResponseEntity getRelatorio() {
        long autenticados = usuarios.stream()
                                    .filter(Usuario::isAutenticado)
                                    .count();

        return ResponseEntity.status(200).body(String.format(
                "Total de usuários: %s. Autenticados: %d. Não autenticados: %s",
                usuarios.size(), autenticados, usuarios.size() - autenticados
        ));
    }
}

