package sptech.grife;

public class Grife {

    private String nome;
    private int anoCriacao;
    private double valorAcaoBolsa;
    private String chaveAcesso;

    public Grife(String nome, int anoCriacao, double valorAcaoBolsa, String chaveAcesso) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.valorAcaoBolsa = valorAcaoBolsa;
        this.chaveAcesso = chaveAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public double getValorAcaoBolsa() {
        return valorAcaoBolsa;
    }

    public void setValorAcaoBolsa(double valorAcaoBolsa) {
        this.valorAcaoBolsa = valorAcaoBolsa;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }
}
