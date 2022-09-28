package sptech.correcao01;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Usuario {

    @NotBlank(message = "aoba")
    @Size(min = 4,max = 12)
    private String usuario;
    @NotBlank(message = "CAVALO")
    @Size(min = 8, max = 20)
    private String senha;

    private String nome;
    private boolean autenticado;

    public boolean autenticar(String usuario, String senha) {
        autenticado = usuario.equals(this.usuario) && senha.equals(this.senha);
        return autenticado;
    }

    public boolean isValido() {
        return usuario!=null && usuario.length() >= 3
                && senha!=null && senha.length() >= 3;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
}
