public abstract class Produto implements Vendavel{

    private String nome;
    private String codigo;
    private Double precoCusto;

    public Produto(String nome, String codigo, Double precoCusto) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Código: " + codigo + "\n" +
                "Preço de Custo: " + precoCusto;
    }
}
