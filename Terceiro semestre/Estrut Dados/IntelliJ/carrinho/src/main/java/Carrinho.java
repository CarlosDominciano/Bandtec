import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> vendaveis;

    public Carrinho() {
        this.vendaveis = new ArrayList<>();
    }

    public List<Vendavel> getVendaveis() {
        return vendaveis;
    }

    public void setVendaveis(List<Vendavel> vendaveis) {
        this.vendaveis = vendaveis;
    }

    public void addVendavel(Vendavel v) {
        vendaveis.add(v);
        System.out.println("Produto adicionado com sucesso!");
    }

    public double calculaTotalVenda() {
        double totalVenda = 0;
        for (Vendavel v : vendaveis) {
            totalVenda += v.getValorVenda();
        }
        return totalVenda;
    }

    public void exibeItensCarrinho() {
        for (Vendavel v : vendaveis) {
            System.out.println(v);
        }
    }

    public String mostrarTudo() {
        String vendaveisString = "";
        for (Vendavel v : vendaveis){
            vendaveisString += v.toString();
        }
        return vendaveisString;
    }

    @Override
    public String toString() {
        return "\n" + "-".repeat(30) + "\n" +
                "-".repeat(30) + "\n" +
                "Carrinho " + "\n" +
                "Itens no carrinho: " + mostrarTudo() + "\n" +
                "-".repeat(30) + "\n" +
                "-".repeat(30) + "\n";
    }
}
