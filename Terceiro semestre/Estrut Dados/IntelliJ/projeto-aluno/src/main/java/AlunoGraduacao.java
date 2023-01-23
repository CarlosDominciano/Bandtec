public class AlunoGraduacao extends Aluno{

    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(String ra, String nome, Double nota1, Double nota2) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public Double calcMedia() {
        return (nota1*0.4)+(nota2*0.6);
    }

    @Override
    public String toString() {
        return  "-".repeat(80) + "\n" +
                "Aluno Graduação: \n" +
                "nota1=" + nota1 + "\n" +
                "nota2=" + nota2 + "\n" +
                "Média=" + calcMedia() + "\n" +
                super.toString();
    }
}