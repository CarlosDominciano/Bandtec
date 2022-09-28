public abstract class Aluno  {
    private String ra;
    private String nome;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public abstract Double calcMedia();

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "-".repeat(40) + "\n" +
                "Aluno: \n" +
                "ra= '" + ra + '\n' +
                "nome= '" + nome + '\n' +
                "-".repeat(80);
    }
}
