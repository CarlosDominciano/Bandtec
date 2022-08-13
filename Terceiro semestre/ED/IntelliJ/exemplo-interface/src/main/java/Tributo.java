import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<Tributavel> listaTributavel;

    public Tributo() {
        this.listaTributavel = new ArrayList<>();
    }

    public void adicionaTributo(Tributavel t) {
        listaTributavel.add(t);
    }

    public Double calcTotalTributo() {
        Double tributoTotal = 0.0;
        for (Tributavel t : listaTributavel) {
           tributoTotal += t.getValorTributo();
        }
        return tributoTotal;
    }

    public void exibeTodos(){
        for (Tributavel t : listaTributavel) {
            if (t instanceof Perfume)
                System.out.println(t);
        }
    }


    @Override
    public String toString() {
        return "Tributo{" +
                "listaTributavel=" + listaTributavel +
                '}';
    }
}
