public class TesteAluno {

    public static void main(String[] args) {
        Escola e = new Escola("Pirokinha");
        AlunoGraduacao ag = new AlunoGraduacao("01812981","José",10., 5.);
        AlunoGraduacao ag1 = new AlunoGraduacao("0181291","CJ",1., 10.);
        AlunoFundamental af = new AlunoFundamental("01212110","Antonio",10., 10.,9.,9.);
        AlunoPos ap = new AlunoPos("763834","Maria",5., 2.,2.);

        e.adicionaAlunos(ag);
        e.adicionaAlunos(af);
        e.adicionaAlunos(ap);
        e.adicionaAlunos(ag1);

        System.out.println("Exibe todos");
        e.exibeTodos();
        System.out.println("Busca por RA");
        e.buscaAluno("01812981");
        System.out.println("Exibe Grad");
        e.exibeAlunosGraduacao();
        System.out.println("Exibe aprovados");
        e.exibeAlunosAprovados();
    }

}
