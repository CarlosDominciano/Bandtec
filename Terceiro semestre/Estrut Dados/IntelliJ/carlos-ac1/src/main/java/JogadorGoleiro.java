public class JogadorGoleiro extends Jogador{


    private int golsSofridos;
    private int penaltisDefendidos;

    public JogadorGoleiro(String nome, String codigo, int numJogos, int golsSofridos, int penaltisDefendidos) {
        super(nome, codigo, numJogos);
        this.golsSofridos = golsSofridos;
        this.penaltisDefendidos = penaltisDefendidos;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public int getPenaltiesDefendidos() {
        return penaltisDefendidos;
    }

    public void setPenaltiesDefendidos(int penaltiesDefendidos) {
        this.penaltisDefendidos = penaltiesDefendidos;
    }

    @Override
    public double getPremio() {
        return getDesempenho()*300;
    }

    @Override
    public double getDesempenho(){
        return (penaltisDefendidos - golsSofridos) / getNumJogos();
    }

    //A classe JogadorGoleiro deve ter os atributos: codigo, nome, nroJogos,
    // golsSofridos, penaltiesDefendidos, um método getDesempenho() e um método
    // getPremio(), que calcula e retorna a premiação do goleiro, que é o cálculo
    // do seu desempenho * 300. O desempenho do goleiro é calculado fazendo penaltiesDefendidos
    // menos golsSofridos, e dividindo o resultado dessa subtração pelo nroJogos.


    @Override
    public String toString() {
        return "Jogador Goleiro: \n" +
                super.toString() +
                "Gols sofridos= " + golsSofridos + "\n" +
                "pênaltis defendidos= " + penaltisDefendidos + "\n" +
                "Prêmio= R$" + getPremio() + "\n\n";
    }
}
