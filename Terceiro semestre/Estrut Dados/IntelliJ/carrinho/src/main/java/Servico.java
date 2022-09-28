public class Servico implements Vendavel{

    private String descricao;
    private String codigo;
    private int quantHoras;
    private double valorHora;

    public Servico(String descricao, String codigo, int quantHoras, double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(int quantHoras) {
        this.quantHoras = quantHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public Double getValorVenda() {
        return getQuantHoras() * getValorHora();
    }

    @Override
    public String toString() {
        return "\n" + "-".repeat(30) + "\n" +
                "Serviço " + "\n" +
                "Descrição: " + descricao + "\n" +
                "Código: " + codigo + "\n" +
                "Quantidade de horas: " + quantHoras + "\n" +
                "Valor da hora: " + valorHora + "\n" +
                "-".repeat(30) + "\n";
    }
}
