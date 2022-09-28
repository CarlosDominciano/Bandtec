public class Patrocinador implements IPremio{

    private String nome;
    private String nomeEquipe;
    private int vitorias;
    private double valorInvestido;

    public Patrocinador(String nome, String nomeEquipe, int vitorias, double valorInvestido) {
        this.nome = nome;
        this.nomeEquipe = nomeEquipe;
        this.vitorias = vitorias;
        this.valorInvestido = valorInvestido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    @Override
    public double getPremio() {
        int porcentagem = vitorias * 2;
        return valorInvestido * porcentagem / 100;
    }

    //A classe Patrocinador deve ter os atributos: nome, nomeEquipe, vitorias,
    // valorInvestido, e um método getPremio(), que calcula e retorna a premiação
    // do patrocinador, que é uma porcentagem do valorInvestido. A porcentagem é calculada
    // multiplicando o número de vitórias da equipe patrocinada por 2.
    // Por exemplo, se o número de vitórias for 5, a
    // porcentagem é 5 * 2 = 10%.




    @Override
    public String toString() {
        return "Patrocinador: \n" +
                "Nome= " + nome + "\n" +
                "Nome da equipe= " + nomeEquipe + "\n" +
                "Vitórias= " + vitorias + "\n" +
                "Valor investido= " + valorInvestido + "\n" +
                "Prêmio= R$" + getPremio() + "\n\n";
    }
}
