import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListaObj <T> {



    // 01) Declarar vetor de int:
    // É inicializado no construtor

    T[] vetor;

    // 02) Criar atributo nroElem:
    // Tem dupla função: representa quantos elementos foram adicionado no vetor
    // Também o índice de onde será adicionado o próximo elemento

    int nroElem;

    // 03) Criar Construtor:
    // Recebe como argumento o tamanho máximo do vetor
    // Cria vetor com tamanho máximo informado
    // Inicializa nroElem

    public ListaObj(int vetor) {
        this.vetor = (T[]) new Object[vetor];
        this.nroElem = 0;
    }


    // 04) Método adiciona:
    // Recebe o elemento a ser adicionado na lista
    // Se a lista estiver cheia usar IllegalStateException();

    public void adiciona(T elemento){
        if (nroElem >= vetor.length)
            throw new IllegalStateException();
        else
            vetor[nroElem++] = elemento;
    }

    // 05) Método busca:
    // Recebe o elemento a ser procurado na lista
    // Retorna o índice do elemento, se for encontrado
    // Retorna -1 se não encontrou

    public int busca(T elemento) {
        return IntStream.range(0, nroElem).filter(i -> vetor[i].equals(elemento)).findFirst().orElse(-1);
    }

    // 06) Método removePeloIndice:
    // Recebe o índice do elemento a ser removido
    // Se o índice for inválido, retorna false
    // Se removeu, retorna true

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem)
            return false;
        else {
            IntStream.range(indice, nroElem).forEach(i -> vetor[i] = vetor[i + 1]);
            nroElem--;
            return true;
        }
    }


    // 07) Método removeElemento
    // Recebe um elemento a ser removido
    // Utiliza os métodos busca e removePeloIndice
    // Retorna false, se não encontrou o elemento
    // Retorna true, se encontrou e removeu o elemento

    public boolean removeElemento(T elemento) {
        return removePeloIndice(busca(elemento));
    }

    // 08 Método exibe:
    // Exibe os elementos da lista

    public void exibe() {
        if (nroElem == 0) System.out.println("Lista vazia");
        else
            Arrays.stream(vetor, 0, nroElem).forEach(System.out::println);
    }

    public void limpa() {
        IntStream.range(0, nroElem).forEach(i -> vetor[i] = null);
    }


    //Métodos getVetor e getNroElem
    //São usados nos testes

    public T getElemento(int indice) {
        if (indice < 0 || indice >= nroElem)
            return null;
        return vetor[indice];
    }
    public int getTamanho(){
        return nroElem;
    }


    public T[] getVetor() {
        return vetor;
    }


}
