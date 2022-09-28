public class App {

    public static void main(String[] args) {

        Tributo tr = new Tributo();
        Servico s = new Servico("Padeiro", 100.0);
        Alimento a = new Alimento(123, "Banana", 12.2, 2);
        Perfume p = new Perfume(322, "Kaiak", 32.3, "CherrodeCu");

        tr.adicionaTributo(s);
        tr.adicionaTributo(p);
        tr.adicionaTributo(a);

        tr.exibeTodos();

    }


}
