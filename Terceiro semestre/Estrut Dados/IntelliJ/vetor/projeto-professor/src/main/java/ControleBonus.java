import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    List<Bonavel> bonusList;

    public ControleBonus() {
        this.bonusList = new ArrayList<>();
    }

    public void addBonavel(Bonavel b) {
        bonusList.add(b);
    }

    public void exibeBonavel(){
        bonusList.forEach(System.out::println);
    }

    public void pagarBonus(Bonavel b){
        
    }

    @Override
    public String toString() {
        return "ControleBonus{" +
                "bonusList=" + bonusList +
                '}';
    }
}
