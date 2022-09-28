package sptech.c101212110carloshenriquejosedominciano;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Usuario {

    private String usuario;
    private String senha;
    private String nome;
    @JsonIgnore
    private boolean isAutenticado = false;

    public Usuario(String usuario, String senha, String nome) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setAutenticado(boolean autenticado) {
        isAutenticado = autenticado;
    }

    public boolean isAutenticado() {
        return isAutenticado;
    }

    public boolean validarSenha(String senha) {
        return senha.equals(this.senha);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", isAutenticado=" + isAutenticado +
                '}';
    }
}
