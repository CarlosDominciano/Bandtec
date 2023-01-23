package sptech;

public class Exercicio {

    public static Boolean ehPalindromo(int[] v) {
        Pilha pilha = new Pilha(v.length);

        /* Percorre o vetor, empilhando seus elementos */
        for (int i = 0; i < v.length; i++) {
            pilha.push(v[i]);
        }

        /* Percorre novamente o vetor, comparando cada elemento do
           vetor com o pop() da pilha
           Se algum elemento for direrente do pop, então não é palíndromo
         */
        for (int i = 0; i < v.length; i++) {
            if (v[i] != pilha.pop()) {
                return false;
            }
        }
        /* Se chegou até aqui, é porque é palíndromo */
        return true;
    }

    public static String converteParaBinario(int num) {
        String resultado = "";

        // Cria uma pilha
        Pilha pilha = new Pilha((int)(Math.log(num)/Math.log(2)) + 1);

        // Empilha os restos de num por 2
        // Sempre trocando num por num / 2, até que num seja zero
        while (num != 0) {
            pilha.push(num % 2);
            num /= 2;
        }

        // Esvazia a pilha, concatenando resultado com os pops da pilha
        while (!pilha.isEmpty()) {
            resultado += pilha.pop();
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] vetor1 = {1, 3, 3, 1};
        int[] vetor2 = {10, 20, 30, 40};
        int[] vetor3 = {1, 2, 3, 2, 1};

        System.out.println("vetor1 é palíndromo? " + ehPalindromo(vetor1));
        System.out.println("vetor2 é palíndromo? " + ehPalindromo(vetor2));
        System.out.println("vetor3 é palíndromo? " + ehPalindromo(vetor3));

        System.out.println();
        System.out.println("12 em binário: " + converteParaBinario(12));
        System.out.println("15 em binário: " + converteParaBinario(15));
        System.out.println("73 em binário: " + converteParaBinario(73));
        System.out.println("1024 em binário: " + converteParaBinario(1024));
        System.out.println("6 em binário: " + converteParaBinario(6));


    }
}
