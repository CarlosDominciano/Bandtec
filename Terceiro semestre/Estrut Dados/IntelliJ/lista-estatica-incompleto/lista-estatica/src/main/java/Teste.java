public class Teste {

    // Testar Classe ListaEstatica
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(5);

        System.out.println("exibe ai");
        lista.exibe();

        System.out.println("adiciona");
        lista.adiciona(5);
        lista.adiciona(8);

        System.out.println("exibe");
        lista.exibe();

        System.out.println("Busca");
        lista.busca(8);

        System.out.println("remove");
        lista.removePeloIndice(1);

        System.out.println("exibe ai");
        lista.exibe();


    }
}
