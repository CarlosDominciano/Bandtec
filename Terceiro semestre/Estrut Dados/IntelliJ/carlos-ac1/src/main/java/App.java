public class App {

    public static void main(String[] args) {
        JogadorAtacante ja1 = new JogadorAtacante(
                "Neymar",
                "10",
                23,
                329,
                83
        );
        JogadorAtacante ja2 = new JogadorAtacante(
                "Messi",
                "08",
                24,
                0,
                0
        );
        JogadorGoleiro jg1 = new JogadorGoleiro(
                "Cassio",
                "07",
                12,
                34,
                98
        );
        Patrocinador p1 = new Patrocinador(
                "Rogério",
                "Barcelona",
                230,
                3_000.00
        );
        ControlePremio controle = new ControlePremio();

        controle.adicionarPremiavel(ja1);
        controle.adicionarPremiavel(ja2);
        controle.adicionarPremiavel(jg1);
        controle.adicionarPremiavel(p1);

        System.out.println(jg1.getDesempenho());
        System.out.println(ja1.getDesempenho());
        System.out.println(ja2.getDesempenho());


        System.out.println(jg1.getPremio());
        System.out.println(ja1.getPremio());
        System.out.println(ja2.getPremio());

        System.out.println(controle.getFor());

        System.out.println(controle.getPremiaveis());
        System.out.println("R$"+controle.getTotalPremiacoes());
    }

}
