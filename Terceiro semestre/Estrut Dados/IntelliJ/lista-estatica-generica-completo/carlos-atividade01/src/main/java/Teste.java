import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Integer opcao = 0;
        String nomeArq;
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNl = new Scanner(System.in);
        System.out.println("Bem vindo ao PetShop CAVALO!");

        ArquivosConfig arq = new ArquivosConfig();

        ListaObj<Animal> animalListaObj = new ListaObj<>(5);

        do{
            System.out.println("Escolha a opção desejada: (digite 1, 2 ou 3)\n" +
                    "1 - Adicionar o Animal\n" +
                    "2 - Exibir Animais Cadastrados (na lista)\n" +
                    "3 - Gravar no arquivo\n" +
                    "4 - Ler do arquivo\n" +
                    "5 - Sair");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.printf("Digite o identificador: ");
                    int id = leitor.nextInt();

                    System.out.printf("Digite o nome do pet: ");
                    String nome = leitorNl.nextLine();

                    System.out.printf("Digite o valor da consulta: ");
                    Double valorConsulta = leitor.nextDouble();

                    System.out.printf("Digite o tipo do(a) %s (gato, cachorro...): ", nome);
                    String tipoAnimal = leitorNl.nextLine();

                    System.out.printf("Digite se o(a) %s é castrado: ", nome);
                    boolean isCastrado = leitor.nextBoolean();

                    animalListaObj.adiciona(new Animal(id,nome, valorConsulta, isCastrado, tipoAnimal));

                    System.out.println("Animal adicionado!");
                    break;
                case 2:
                    System.out.printf("%-6s %-12s %-10s %15s %9s \n", "CÓDIGO", "NOME_PET","TIPO_PET", "VALOR_CONSULTA", "CASTRADO");
                    for (int i = 0; i < animalListaObj.getTamanho(); i++){
                        Animal a = animalListaObj.getElemento(i);
                        System.out.printf("%06d %-12s %-10s %15.2f %9b \n", a.getId(),a.getNome(), a.getTipoAnimal(),a.getValorConsulta(), a.isCastrado());
                    }
                    break;
                case 3:
                    System.out.printf("Digite o nome do novo arquivo: ");
                    nomeArq = leitorNl.nextLine();
                    arq.gravaArquivoCsv(animalListaObj, nomeArq);
                    break;
                case 4:
                    System.out.printf("Digite o nome do arquivo que deseja ler: ");
                    nomeArq = leitorNl.nextLine();
                    arq.leExibeArquivoCsv(nomeArq);
                    break;
                case 5:
                    System.out.println("Obrigado pela preferência =)");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao != 5);
    }
}
