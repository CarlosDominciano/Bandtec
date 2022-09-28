import java.util.Date;

public abstract class Funcionario {

    // Atributos
    private String cpf;
    private String nome;
    private String data;

    // Construtor

    public Funcionario(String cpf, String nome, String data) {
        this.cpf = cpf;
        this.nome = nome;
        this.data = data;
    }


    // Métodos

    // Método abstrato
    public abstract Double calcSalario();

    // toString()

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    // Getter do cpf (necessário para o buscaFunc da classe Empresa)
    public String getCpf() {
        return cpf;
    }
}
