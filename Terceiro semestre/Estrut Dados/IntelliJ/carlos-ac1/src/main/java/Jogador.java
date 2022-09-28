public abstract class Jogador implements IPremio{

    private String nome;
    private String codigo;
    private int numJogos;
    public Jogador(String nome, String codigo, int numJogos) {
        this.nome = nome;
        this.codigo = codigo;
        this.numJogos = numJogos;
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

    public int getNumJogos() {
        return numJogos;
    }

    public void setNumJogos(int numJogos) {
        this.numJogos = numJogos;
    }

    public abstract double getDesempenho();

    @Override
    public String toString() {
        return "Nome= " + nome + "\n" +
                "Código= " + codigo + "\n" +
                "Número de jogos= " + numJogos + "\n";

    }
}
