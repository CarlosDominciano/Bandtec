package sptech;

public class Main {
  public static void main(String[] args) {
    ListaEstaticaOrdenada lista = new ListaEstaticaOrdenada(5);

    System.out.println("Adiciona de maneira ordenada");
    lista.adiciona(3);
    lista.adiciona(4);
    lista.adiciona(2);
    lista.adiciona(1);
    lista.adiciona(5);


    System.out.println("\nExibição");
    lista.exibir();

    System.out.println("\nBusca de elementos");
    System.out.println(lista.busca(1));
    System.out.println(lista.busca(9)+"\n");

    System.out.println("\nRemoção por Indice");
    lista.removePeloIndice(2);
    lista.exibir();

    System.out.println("\nRemoção por elemento");
    lista.removeElemento(4);
    lista.exibir();

    System.out.println("\nSubstituição");
    lista.substitui(2,4);
    lista.exibir();

    System.out.println("\nConta Ocorrencias");
    lista.adiciona(1);
    System.out.println(lista.contaOcorrencias(1));


    System.out.println("\nAdiciona no Inicio");
    lista.adicionaNoInicio(5);
    lista.exibir();  }
}