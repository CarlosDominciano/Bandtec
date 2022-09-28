import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Carrinho c = new Carrinho();
        Scanner leitor = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);

        Boolean isLooping = true;
        String nome;
        String codigo;
        Double precoCusto;
        String autor;
        String isbn;
        String gravadora;
        String descricao;
        Integer quantHoras;
        Double valorHora;
        Livro livro;
        DVD dvd;
        Servico servico;
        int opcao;


        do {
            System.out.println(
                    "1 - Adicionar livro \n" +
                    "2 - Adicionar DVD \n" +
                    "3 - Adicionar Serviço \n" +
                    "4 - Exibir itens do carrinho \n" +
                    "5 - Exibir total de venda \n" +
                    "6 - Fim \n"
            );
            System.out.println("Selecione uma opção:");
            opcao = leitorInt.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro: ");
                    nome = leitor.nextLine();
                    System.out.println("Digite o código do livro: ");
                    codigo = leitor.nextLine();
                    System.out.println("Digite o preço do livro: ");
                    precoCusto = leitorInt.nextDouble();
                    System.out.println("Digite o autor do livro: ");
                    autor = leitor.nextLine();
                    System.out.println("Digite o ISBN do livro: ");
                    isbn = leitor.nextLine();

                    livro = new Livro(nome, codigo, precoCusto, autor, isbn);
                    c.addVendavel(livro);
                    break;
                case 2:
                    System.out.println("Digite o nome do DVD: ");
                    nome = leitor.nextLine();
                    System.out.println("Digite o código do DVD: ");
                    codigo = leitor.nextLine();
                    System.out.println("Digite o preço do DVD: ");
                    precoCusto = leitorInt.nextDouble();
                    System.out.println("Digite o gravadora do DVD: ");
                    gravadora = leitor.nextLine();

                    dvd = new DVD(nome, codigo, precoCusto, gravadora);
                    c.addVendavel(dvd);
                    break;
                case 3:
                    System.out.println("Digite o descrição do serviço: ");
                    descricao = leitor.nextLine();
                    System.out.println("Digite o código do serviço: ");
                    codigo = leitor.nextLine();
                    System.out.println("Digite o quantidade de horas do serviço: ");
                    quantHoras = leitorInt.nextInt();
                    System.out.println("Digite o valor da hora do serviço: ");
                    valorHora = leitorInt.nextDouble();

                    servico = new Servico(descricao, codigo, quantHoras, valorHora);
                    c.addVendavel(servico);
                    break;
                case 4:
                    System.out.println("Mostrando todos os itens do carrinho: ");
                    c.exibeItensCarrinho();
                    System.out.println("Todos os itens foram exibidos");
                    break;
                case 5:
                    System.out.println("Exibindo total de vendas: \n" +
                            c.calculaTotalVenda());
                    break;
                case 6:
                    isLooping = false;
                    break;
                default:
                    System.out.println("\nOpção inválida! \n\tPor favor digite uma opção válida. ");
                    break;
            }

        } while (isLooping);

    }

}
