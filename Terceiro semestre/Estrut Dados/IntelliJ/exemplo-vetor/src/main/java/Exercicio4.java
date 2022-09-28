import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o "+(i+1)+" número da lista de "+numeros.length+" números: ");
            numeros[i] = leitor.nextInt();
        }
        System.out.print("Digite um número para ver se ele aparece na lista e quantas vezes " +
                "aparece: ");
        int numeroQualquer = leitor.nextInt();
        int qtd = 0;

        for (int i : numeros)
            if (i == numeroQualquer) {
                qtd++;
            }

        if (qtd > 0) {
            System.out.println("O numero " + numeroQualquer + " apareceu " + qtd + " vezes.");
        } else {
            System.out.println("O numero " + numeroQualquer + " não apareceu nenhuma vez.");
        }

    }
}
