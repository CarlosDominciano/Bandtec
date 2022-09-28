import java.util.Date;

public class Vendedor extends Funcionario {

    // Atributos
    private Double vendas;
    private Double taxa;

    // Construtor

    public Vendedor(String cpf, String nome, String data, Double vendas, Double taxa) {
        super(cpf, nome, data);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    // Métodos

    public Double calcSalario() {
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "vendas=" + vendas +
                ", taxa=" + taxa +
                ", salário=" + calcSalario() +
                "} " + super.toString();
    }
}
