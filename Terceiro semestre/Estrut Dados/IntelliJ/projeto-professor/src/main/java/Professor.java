public class Professor extends Funcionario{

    public Professor(String nome, Integer qtdHorasSemana, double valorHora) {
        super(nome, qtdHorasSemana, valorHora);
    }

    @Override
    public String toString() {
        return "Professor{} " + super.toString();
    }

    @Override
    public Double getValorBonus(int horas, double valor) {
        return horas*valor;
    }
}
