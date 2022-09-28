public class AlunoFundamental extends Aluno {

    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;

    public AlunoFundamental(String ra, String nome, Double nota1, Double nota2, Double nota3, Double nota4) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
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

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }

    @Override
    public Double calcMedia() {
        return (nota1+nota2+nota3+nota4)/4;
    }

    @Override
    public String toString() {
        return  "-".repeat(80) + "\n" +
                "Aluno Fundamental: \n" +
                "nota1= " + nota1 + "\n" +
                "nota2=" + nota2 + "\n" +
                "nota3=" + nota3 + "\n" +
                "nota4=" + nota4 + "\n" +
                "media=" + calcMedia() + "\n" +
                super.toString();
    }
}
