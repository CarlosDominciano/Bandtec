import java.util.Date;

public class Engenheiro extends Funcionario {

    // Atributo
    private Double salario;

    // Construtor

    public Engenheiro(String cpf, String nome, String data, Double salario) {
        super(cpf, nome, data);
        this.salario = salario;
    }

    // Métodos

    // Implementação do método abstrato
    public Double calcSalario() {
        return salario;
    }

    // toString()

    @Override
    public String toString() {
        return "Engenheiro{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
