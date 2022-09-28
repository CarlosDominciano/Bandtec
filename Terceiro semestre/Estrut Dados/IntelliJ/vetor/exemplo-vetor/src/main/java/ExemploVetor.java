import java.util.Scanner;

public class ExemploVetor {

    public static void exibeVetor(int[] vetor ) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Vetor[" + i + "]=" + vetor[i]+"\t");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Criação do primeiro Vetor

        int[] vetor = new int[10];

        //Criação do segundo vetor

        int[] vetor2 = {10, 20, 30, 40, 50, 60, 70};

        //Criação do terceiro Vetor

        String[] vetor3 = new String[4];

        int[] vet5;
        int tamanho;

        //Criação do quarto Vetor

        String[] dias = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};

        // Inicializar os valores do vetor

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i * 10;
        }

        vetor2[2] = 80;

//        //Exibe os valores do vetor
//        exibeVetor(vetor);

//        exibeVetor(vetor2);
        int soma = 0;
        //Solicita os valores ao usuario para o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor do vetor[" + i  + "]");
            vetor[i] = leitor.nextInt();
            soma += vetor[i];
        }
        System.out.println("SOMA = " + soma);
        exibeVetor(vetor);
        for (int v : vetor){
            if (v % 2 == 0) {
                System.out.println(v);
            }

        }

//        for (int i = 0; i < vetor3.length; i++) {
//            System.out.println("Digite o valor do vetor3[" + i  + "]");
//            vetor3[i] = leitor.nextLine();
//        }
//
//        for (String s : vetor3) {
//            System.out.print(s + "\t");
//        }
//        System.out.println();
//        boolean isLooping = true;
//        int num;
//
//        do {
//            System.out.println("Digite um número entre 1 e 7");
//            num = leitor.nextInt();
//            if (num >= 1 && num <= 7) {
//                isLooping = false
//                System.out.println(dias[num - 1]);
//            }
//        } while (isLooping);
        System.out.println("Valor maior ou igual a 2");
        tamanho = leitor.nextInt();
        while (tamanho < 2){
            System.out.println("Valor inválido");
            tamanho = leitor.nextInt();
        }

        vet5 = new int[tamanho];

        for (int i = 0; i < vet5.length; i++) {
            System.out.println("vet"+i);
            vet5[i] = leitor.nextInt();

        }


    }
}
