import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercicio5 {

    //5.  Elaborar um programa que solicita que o usuário digite os nomes de 5 modelos de carros
    // (exemplo: Gol, Vectra, HB20, etc), que deverão ser armazenados em um vetor. Depois, o usuário
    // deverá digitar o rendimento desses carros, ou seja, quantos quilômetros cada um deles faz com
    // um litro de combustível. O rendimento de cada modelo deverá ser
    // armazenado em outro vetor. O programa deverá exibir qual o modelo de carro mais econômico.

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);
        String[] carros = new String[5];
        int[] rendimentos = new int[5];

        IntStream.range(0, carros.length).forEach(i -> {
            System.out.print("Digite o nome do " + (i + 1) + " carro: ");
            carros[i] = leitor.nextLine();
        });

        IntStream.range(0, rendimentos.length).forEach(i -> {
            System.out.print("Digite o rendimento do " + carros[i] + ": ");
            rendimentos[i] = leitorInt.nextInt();
        });

        int maiorRedimento = Integer.MIN_VALUE;
        int indice = -1;

        for (int i = 0; i < rendimentos.length; i++) {
            if (rendimentos[i] > maiorRedimento){
                maiorRedimento = rendimentos[i];
                indice = i;
            }
        }
            System.out.println("O carro mais economico é o "+ carros[indice]);

    }

}
