import java.util.Scanner;

public class Exercicio2 {
    //2.  Escreva um programa que cria um vetor para armazenar 10 inteiros. O programa deve solicitar que o
    // usuário digite 10 números, que devem ser armazenados nesse vetor.
    //O programa deverá calcular a média dos números digitados e exibir a média.
    //Depois, deverá exibir os números que estão no vetor que estão acima da média.

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];
        double media = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = leitor.nextInt();
            media += numeros[i];
        }
        media /= numeros.length;
        System.out.println("Média: "+media);
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media){
                System.out.println("Numero "+ i +": "+numeros[i]);
            }

        }

    }
}
