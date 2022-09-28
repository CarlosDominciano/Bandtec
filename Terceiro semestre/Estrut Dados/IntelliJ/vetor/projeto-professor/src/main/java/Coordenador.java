public class Coordenador extends Funcionario{

    public Coordenador(String nome, Integer qtdHorasSemana, double valorHora) {
        super(nome, qtdHorasSemana, valorHora);
    }

    @Override
    public String toString() {
        return "Coordenador{} " + super.toString();
    }

    @Override
    public Double getValorBonus(int qtdHorasSemana, double valorHora) {
        return null;
    }
}
