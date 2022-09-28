import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercicio7 {

    public static void retorna(String[] alunos, int aux){
        Arrays.stream(alunos, 0, aux).forEach(System.out::println);
        System.out.println("");
    }

    public static void main(String[] args) {
        //Faça um algoritmo que leia os nomes de 10 alunos e de qual turma eles pertencem: "T1" ou "T2".
        //O algoritmo deve criar 2 vetores, um contendo os nomes dos alunos da "T1" e o
        // outro contendo os nomes dos alunos da "T2".
        //Exiba a quantidade de alunos de cada vetor e os nomes dos alunos de cada turma no final.
        //OBS.: Nâo é para utilizar List ou ArrayList. É para usar vetor mesmo!!!
        //           Não é para deixar "buracos" nos vetores.

        Scanner leitor = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);

        String[] alunosA = new String[10];
        String[] alunosB = new String[10];

        int auxA = 0;
        int auxB = 0;
        String turma;

        for (int i = 0; i < 10; i++) {
            System.out.println(
                    String.format("Digite qual é a turma do aluno %d \nDigite (A) ou (B):", i+1)
            );
            turma = leitor.nextLine().toLowerCase();

            switch (turma){
                case "a": {
                    System.out.println("Digite qual o nome do aluno que estará na turma A:");
                    alunosA[auxA++] = leitor.nextLine();
                }
                    break;
                case "b": {
                    System.out.println("Digite qual o nome do aluno que estará na turma B:");
                    alunosB[auxB++] = leitor.nextLine();
                }
                    break;
                default: {
                    System.out.println("Turma invalida, vtnc");
                    i--;
                }
                break;
            }

        }

        if (auxA > 0) {
            System.out.println(String.format("A turma A tem %d Alunos", auxA));
            retorna(alunosA, auxA);
        }
        else {
            System.out.println("A turma A não tem nenhum aluno");
        }

        if (auxB > 0) {
            System.out.println(String.format("A turma B tem %d Alunos", auxB));
            retorna(alunosB, auxB);
        }
        else {
            System.out.println("A turma B não tem nenhum aluno");
        }
    }

}
