public abstract class Funcionario implements Bonavel{

    private String nome;
    private Integer qtdHorasSemana;
    private double valorHora;

    public Funcionario(String nome, Integer qtdHorasSemana, double valorHora) {
        this.nome = nome;
        this.qtdHorasSemana = qtdHorasSemana;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasSemana() {
        return qtdHorasSemana;
    }

    public void setQtdHorasSemana(Integer qtdHorasSemana) {
        this.qtdHorasSemana = qtdHorasSemana;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", qtdHorasSemana=" + qtdHorasSemana +
                ", valorHora=" + valorHora +
                '}';
    }

    public abstract Double getValorBonus(int qtdHorasSemana, double valorHora);
}