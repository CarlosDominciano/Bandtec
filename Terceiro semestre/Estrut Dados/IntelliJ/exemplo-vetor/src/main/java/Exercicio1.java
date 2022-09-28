import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercicio1 {
    /*1.  Escreva um programa que leia 7 números e armazene-os em um vetor. Depois,
    o programa deve percorrer o vetor exibindo os números na ordem em que foram inseridos.
    E depois, deve percorrer o vetor de trás para frente, exibindo os números na ordem inversa
    em que foram inseridos (dica: utilize o for ao contrário).
    */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer[] numeros = new Integer[7];

        for (int i = 0; i < numeros.length; i++) numeros[i] = leitor.nextInt();

        Arrays.stream(numeros).forEachOrdered(System.out::println);

        int aux = (int) Arrays.stream(numeros).filter(Objects::nonNull).count();

        IntStream.iterate(numeros.length - 1, i -> i >= 0, i -> i - 1).map(i -> numeros[i]).forEach(System.out::println);
    }
}
