package sptech;

public class App {

    public static void main(String[] args) {

        Pilha p = new Pilha(3);

        p.push(2);
        p.push(1);
        p.push(2);

        System.out.println(p.isPalindromo());
        System.out.println("-".repeat(50));
        System.out.println(p.converteParaBinario(69));
        System.out.println("-".repeat(50));
    }

}
