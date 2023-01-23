package sptech;

public class Pilha {

    // 01) Atributos
    private int[] pilha;
    private int topo;

    // 02) Construtor
    public Pilha(int capacidade) {
        pilha = new int[capacidade];
        topo = -1;
    }

    // 03) Método isEmpty
    public Boolean isEmpty() {
        return topo == -1;

//        if (topo == -1) {
//            return true;
//        }
//        return false;
    }

    // 04) Método isFull
    public Boolean isFull() {
        return topo == pilha.length - 1;
    }

    // 05) Método push
    public void push(int info) {
        if (isFull()) {
            throw new IllegalStateException("Pilha cheia!");
        }
        pilha[++topo] = info;

//        topo++;
//        pilha[topo] = info;
    }

    // 06) Método pop
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return pilha[topo--];
//        int retorno = pilha[topo];
//        topo--;
//        return retorno;
    }

    // 07) Método peek
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return pilha[topo];
    }

    // 08) Método exibe
    public void exibe() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
        }
        else {
            System.out.println("\nConteúdo da pilha:");
            for (int i = topo; i >= 0; i--) {
                System.out.println(pilha[i]);
            }
        }

    }


    //Getters & Setters (manter)
    public int getTopo() {
        return topo;
    }
}