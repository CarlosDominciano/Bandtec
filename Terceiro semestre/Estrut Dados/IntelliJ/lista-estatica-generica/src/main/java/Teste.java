public class Teste {

    //2. Crie uma classe chamada Teste, e configure para que essa classe tenha o método main.
    //a. Crie um objeto da classe ListaObj para armazenar String.
    //Ex: ListaObj<String> lista = new ListaObj(5);
    //b. Teste os métodos da classe ListaObj.
    public static void main(String[] args) {
        ListaObj<String> lista = new ListaObj<>(5);

        lista.adiciona("Cavalo");
        lista.adiciona("Aoba");
        System.out.println("MOSTRAR");
        lista.exibe();
        lista.busca("Cavalo");
        System.out.println(lista.getTamanho());
        System.out.println(lista.getElemento(1));
        System.out.println(lista.getVetor());

    }

}
