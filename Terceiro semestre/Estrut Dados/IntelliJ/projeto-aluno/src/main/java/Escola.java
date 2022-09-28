import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private List<Aluno> Alunos;

    public Escola(String nome) {
        this.nome = nome;
        Alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return Alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        Alunos = alunos;
    }

    public void adicionaAlunos(Aluno aluno) {
        Alunos.add(aluno);
    }

    public void exibeTodos() {
        System.out.println("Lista de Alunos: \n");
        for (Aluno aluno : Alunos){
            System.out.println(aluno);
        }
    }

    public void exibeAlunosGraduacao() {
        System.out.println("Lista de Alunos: \n");
        for (Aluno aluno : Alunos){
            if (aluno instanceof AlunoGraduacao)
                System.out.println(aluno);
        }
    }

    public void exibeAlunosAprovados() {
        System.out.println("Alunos Aprovados:");
        for (Aluno aluno : Alunos){
            if (aluno.calcMedia() >= 6)
                System.out.println(aluno);
        }
    }

    public void buscaAluno(String ra) {
        for (Aluno aluno : Alunos){
            if (aluno.getRa().equalsIgnoreCase(ra)) {
                System.out.println("Aluno Encontrado: ");
                System.out.println(aluno);
                return;
            }
            System.out.println("Aluno não encontrado!");
        }
    }

    @Override
    public String toString() {
        return "Escola{" +
                "nome='" + nome + '\n' +
                "Alunos=" + Alunos +
                '}';
    }
}
