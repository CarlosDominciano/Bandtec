public class DVD extends Produto {

    private String gravadora;

    public DVD(String nome, String codigo, Double precoCusto, String gravadora) {
        super(nome, codigo, precoCusto);
        this.gravadora = gravadora;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public Double getValorVenda() {
        return null;
    }

    @Override
    public String toString() {
        return "\n" + "-".repeat(30) + "\n" +
                "DVD " + "\n" +
                super.toString() + "\n" +
                "Gravadora: " + gravadora + "\n" +
                "-".repeat(30) + "\n";

    }
}
