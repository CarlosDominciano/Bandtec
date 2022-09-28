import java.util.Scanner;

public class Exercicio4 {
    //4.  Elaborar um programa que solicita que o usuário digite 10 valores inteiros e
    // armazene esses valores em um vetor. Depois o programa deve solicitar que o usuário
    // digite um número qualquer e o programa deverá exibir quantas vezes esse número ocorre no vetor.
    //
    //Exemplo:  considere os números 3  7  9  3  7  1  3  3  5  8
    //o número 7 ocorre 2 vezes
    //o número 3 ocorre 4 vezes
    //o número 2 não ocorre nenhuma vez.

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("digita ai po");
            numeros[i] = leitor.nextInt();
        }
        System.out.println("Digita ai tb man");
        int numeroQualquer = leitor.nextInt();
        int qtd = 0;

        for (int i : numeros) {
            if (i == numeroQualquer){
                qtd++;
            }
        }

        System.out.println("O numero "+numeroQualquer+" apareceu " + qtd + " vezes");


    }
}
