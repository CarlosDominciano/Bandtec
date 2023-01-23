package sptech;

import java.util.function.BinaryOperator;

public class Pilha {

    // 01) Atributos
    private int[] pilha;
    private int topo;

    // 02) Construtor
    public Pilha(int capacidade) {
        this.pilha = new int[capacidade];
        this.topo = -1;
    }

    // 03) Método isEmpty
    public Boolean isEmpty() {
//        if (topo == -1)
//            return true;
//        return false;
        return topo == -1;
    }

    // 04) Método isFull
    public Boolean isFull() {
//        if (topo == pilha.length-1)
//            return true;
//        return false;
        return topo == pilha.length - 1;
    }

    // 05) Método push
    public void push(int info) {
        if (!isFull())
            pilha[++topo] = info;
        else
            throw new IllegalStateException("Pilha cheia");

    }

    // 06) Método pop
    public int pop() {
        if (isEmpty())
            return -1;
        return pilha[topo--];
    }

    // 07) Método peek
    public int peek() {
        if (isEmpty())
            return -1;
        return pilha[topo];
    }

    // 08) Método exibe
    public void exibe() {
        if (isEmpty())
            System.out.println("Pilha vazia!");
        else {
            System.out.println("\nConteúdo da pilha:");
            for (int i = 0; i <= topo; i++) {
                System.out.println(pilha[i]);
            }
        }
    }

    public boolean isPalindromo() {
        Pilha novaPilha = new Pilha(pilha.length);
        for (int i = 0; i < pilha.length; i++) {
            novaPilha.push(pilha[i]);

        }

        for (int i = 0; i < pilha.length; i++) {
            if (!(novaPilha.pop() == pilha[i])) {
                return false;
            }
        }
        return true;
    }

    public String converteParaBinario(int decimal){
        String resultado = "";

        Pilha novaPilha = new Pilha((int) (Math.log(decimal)/Math.log(2))+1);

        while (decimal != 0) {
            novaPilha.push(decimal % 2);
            decimal /= 2;
        }
        while (!novaPilha.isEmpty()) {
            resultado += novaPilha.pop();
        }
        return resultado;
    }


    //Getters & Setters (manter)
    public int getTopo() {
        return topo;
    }
}