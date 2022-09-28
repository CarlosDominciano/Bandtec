package sptech.c101212110carloshenriquejosedominciano;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    List<Usuario> usuarios;

    public UsuarioController() {
        this.usuarios = new ArrayList<>();
    }

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario novo){
        usuarios.add(novo);
        System.out.println(usuarios);
        return novo;
    }

    @PostMapping("/autenticacao/{usuario}/{senha}")
    public Usuario autenticarUsuario(@PathVariable String usuario,
                                     @PathVariable String senha){
        for (int i = 0; i < usuarios.size(); i++) {
//            Usuario novo = usuarios.get(i);
            if (usuarios.get(i).getUsuario().equals(usuario) &&
                    usuarios.get(i).validarSenha(senha)){
                usuarios.get(i).setAutenticado(true);
                return usuarios.get(i);
            }
        }
        return null;
    }

    @GetMapping
    public List<Usuario> usuariosCadastrados() {
        return usuarios;
    }

    @DeleteMapping("/autenticacao/{usuario}")
    public String logoffUsuario(@PathVariable String usuario) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) &&
            u.isAutenticado()) {
                u.setAutenticado(false);
                return "Logoff do usuário "+u.getNome()+" concluído";
            } else if (u.getUsuario().equals(usuario) &&
                    !u.isAutenticado()) {
                return "Usuário "+u.getNome()+" NÃO está autenticado";
            }
        }
        return "Usuário "+usuario+" NÃO encontrado";
    }


}
