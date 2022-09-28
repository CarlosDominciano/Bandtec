import java.util.Scanner;

public class Exercicio3 {

    //3.  Escreva um programa que cria um vetor para armazenar 10 Strings.
    // O programa deve solicitar que o usuário digite 10 nomes, que devem ser armazenados nesse vetor.
    //Depois, o programa deve pedir que se digite um nome qualquer.
    // O programa deverá pesquisar se esse nome está no vetor.
    //Se estiver, deve exibir a mensagem: “Nome encontrado no índice x”,
    // sendo x o índice do nome no vetor, senão deve exibir uma mensagem de “Nome não encontrado”.

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite o "+ i +" nome: ");
            nomes[i] = leitor.nextLine();
        }

        System.out.println("Digite um nome:");
        String nome = leitor.nextLine();
        boolean wasFound = false;
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equalsIgnoreCase(nome)){
                System.out.println("nome encontrado no indice " + i);
                wasFound = true;
            }
        }
        if (wasFound)
            System.out.println("Nome não encontrado!");
    }

}
