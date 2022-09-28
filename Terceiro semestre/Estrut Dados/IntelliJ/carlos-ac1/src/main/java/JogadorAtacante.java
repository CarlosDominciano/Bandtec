public class JogadorAtacante extends Jogador{



    private int golsMarcados;
    private int assistencias;

    public JogadorAtacante(String nome, String codigo, int numJogos, int golsMarcados, int assistencias) {
        super(nome, codigo, numJogos);
        this.golsMarcados = golsMarcados;
        this.assistencias = assistencias;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }

    @Override
    public double getDesempenho(){
        return (golsMarcados + assistencias) / getNumJogos();
    }

    @Override
    public double getPremio() {
        return getDesempenho()*200;
    }



//A classe JogadorAtacante deve ter os atributos: codigo, nome, nroJogos,
// golsMarcados, assistencias, um método getDesempenho() e um método getPremio(),
// que calcula e retorna a premiação do atacante, que é o cálculo do seu desempenho
// * 200. O desempenho do atacante é calculado somando os golsMarcados e
// as assistências, e dividindo o resultado da soma pelo nroJogos.


    @Override
    public String toString() {
        return "Jogador Atacante: \n" +
                super.toString() +
                "Gols marcados= " + golsMarcados + "\n" +
                "Assistências= " + assistencias + "\n" +
                "Prêmio= R$" + getPremio() + "\n\n";

    }
}
