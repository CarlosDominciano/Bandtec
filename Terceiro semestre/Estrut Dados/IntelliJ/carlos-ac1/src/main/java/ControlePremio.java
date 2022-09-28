import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControlePremio {

    private List<IPremio> premiaveis;

    public ControlePremio() {
        this.premiaveis = new ArrayList<>();
    }

    public String adicionarPremiavel(IPremio p) {
        premiaveis.add(p);
        return String.format("O usuário %s foi inserido com sucesso!", p);
    }

    public double getTotalPremiacoes() {
        double totalPremiacoes = premiaveis
                .stream()
                .mapToDouble(IPremio::getPremio)
                .sum();
        return totalPremiacoes;
    }

    public String getPremiaveis() {
        return premiaveis.stream()
                .filter(e -> e.getPremio()>0)
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining());
    }

    //Neste sistema, também há uma classe ControlePremio, que tem como objetivo controlar
    // o total de prêmio pago considerando os jogadores e os patrocinadores. Essa classe
    // disponibiliza um método que retorna o total de premiação considerando os jogadores
    // e os patrocinadores. Para fazer esse cálculo, essa classe deseja manter
    // em ArrayList os objetos correspondentes a jogadores e patrocinadores.

    public String getFor(){
        String cavalo = premiaveis.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining("" ,"\nInício \n\n","Fim \n"));
        return cavalo;
    }


    @Override
    public String toString() {
        return "Controle de Prẽmio: \n" +
                "Premiáveis= \n" + premiaveis.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining("CAVALO" ,"ANTONIO","AOBA"))+
                "\nFim da lista\n" + "-".repeat(50);
    }
}
