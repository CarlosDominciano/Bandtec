import java.util.Arrays;
import java.util.stream.IntStream;

public class ListaEstatica {

    //Crie um projeto chamado lista-estatica-generica.
    //a. Dentro desse projeto, crie uma classe chamada ListaObj
    //b. Copie o código da classe ListaEstatica (que foi feito para armazenar int) para
    //dentro da classe ListaObj.
    //c. Na declaração da classe (public class ListaObj), acrescente <T> antes do {.
    //public class ListaObj <T> {
    //d. Na declaração do vetor, troque o tipo int por T.
    //private T[] vetor;
    //e. Dentro do construtor, na criação do vetor (new), troque a palavra int por Object, e
    //acrescente (T[ ]) antes do new.
    //vetor = (T[]) new Object[tam];
    //f. Troque o tipo do argumento recebido pelos métodos adiciona, busca e
    //removeElemento para T.
    //public void adiciona (T valor){
    //// idem para o método busca e removeElemento
    //g. Troque no método busca, o operador de comparação == por .equals
    //h. Implemente o método getTamanho() na classe ListaObj, que retorna o tamanho da
    //lista, ou seja, retorna o valor de nroElem. O tipo de retorno deste método deve ser
    //o mesmo tipo usado para nroElem.
    //i. Implemente também o método getElemento(), que recebe um índice e retorna o
    //elemento de tipo T, que está armazenado no vetor[índice]. Se o índice recebido for
    //menor do que zero ou maior ou igual a nroElem, retorna null. Senão retorna o
    //elemento do vetor correspondente a esse índice.
    //j. Implemente o método limpa(), void, que limpa a lista, atribuindo zero a nroElem.
    //2. Crie uma classe chamada Teste, e configure para que essa classe tenha o método main.
    //a. Crie um objeto da classe ListaObj para armazenar String.
    //Ex: ListaObj<String> lista = new ListaObj(5);
    //b. Teste os métodos da classe ListaObj.

    // 01) Declarar vetor de int:
    // É inicializado no construtor

    int[] vetor;

    // 02) Criar atributo nroElem:
    // Tem dupla função: representa quantos elementos foram adicionado no vetor
    // Também o índice de onde será adicionado o próximo elemento

    int nroElem;

    // 03) Criar Construtor:
    // Recebe como argumento o tamanho máximo do vetor
    // Cria vetor com tamanho máximo informado
    // Inicializa nroElem

    public ListaEstatica(int vetor) {
        this.vetor = new int[vetor];
        this.nroElem = 0;
    }


    // 04) Método adiciona:
    // Recebe o elemento a ser adicionado na lista
    // Se a lista estiver cheia usar IllegalStateException();

    public void adiciona(int elemento){
        if (nroElem >= vetor.length)
            throw new IllegalStateException();
        else
            vetor[nroElem++] = elemento;
    }

    // 05) Método busca:
    // Recebe o elemento a ser procurado na lista
    // Retorna o índice do elemento, se for encontrado
    // Retorna -1 se não encontrou

    public int busca(int elemento) {
        return IntStream.range(0, nroElem).filter(i -> vetor[i] == elemento).findFirst().orElse(-1);
    }

    // 06) Método removePeloIndice:
    // Recebe o índice do elemento a ser removido
    // Se o índice for inválido, retorna false
    // Se removeu, retorna true

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem)
            return false;
        else {
            for (int i = indice; i < nroElem; i++){
                vetor[i] = vetor[i+1];
            }
            IntStream.range(indice, nroElem).forEachOrdered(i -> vetor[i] = vetor[i + 1]);
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

    public boolean removeElemento(int elemento) {
        return removePeloIndice(busca(elemento));
    }

    // 08 Método exibe:
    // Exibe os elementos da lista

    public void exibe() {
        if (nroElem == 0) System.out.println("Corno");
        else
            Arrays.stream(vetor, 0, nroElem).forEach(System.out::println);
    }


    //Métodos getVetor e getNroElem
    //São usados nos testes
    public int getNroElem() {
        return nroElem;
    }

    public int[] getVetor() {
        return vetor;
    }
}
