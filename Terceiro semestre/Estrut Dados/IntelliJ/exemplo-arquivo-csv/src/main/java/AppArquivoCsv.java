import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppArquivoCsv {

    public static void gravaArquivoCsv(ListaObj<Produto> lista, String nomeArquivo) {
        FileWriter arq = null; //objeto que representa o arquivo de gravação
        Formatter saida = null; //objeto usado para gravar no arquivo
        Boolean error = false;
        nomeArquivo += ".csv";  //acrescenta a extensão .csv ao nome do arquivo

        //Bloco para abrir o arquivo
        try {
            arq = new FileWriter(nomeArquivo, false); //cria ou abre o arquivo
            saida = new Formatter(arq);
        } catch (IOException erro){
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        //Bloco para gravar o arquivo
        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
                Produto p = lista.getElemento(i);
                    if (p.getValorUnitario() > 49) {
                        saida.format("%d;%s;%.2f;%d\n",
                                p.getId(),
                                p.getNome(),
                                p.getValorUnitario(),
                                p.getQuantidadeEstoque());
                    }
            }
        } catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar o arquivo");
            error = true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                error = true;
            }
            if (error) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivoCsv(String nomeArq) {
        FileReader arq = null; //objeto que representa o arquivo de leitura
        Scanner entrada = null; //objeto usado para ler do arquivo
        Boolean deuRuim = false;
        nomeArq += ".csv";

        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        //Bloco para ler o arquivo
        try {
            System.out.printf("%-6S %-14S %10S %7S\n", "código", "nome", "valor", "estoque");
            while (entrada.hasNext()) {
                int id = entrada .nextInt();
                String nome = entrada.next();
                Double valor = entrada.nextDouble();
                int qtdEstoque = entrada.nextInt();
                System.out.printf("%-6d %-14s %10.2f %7d\n", id, nome, valor, qtdEstoque);
            }
        } catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            deuRuim = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }

    }

    public static void main(String[] args) {

        ListaObj<Produto> lista = new ListaObj(10);

        lista.adiciona(new Produto(100, "Mouse sem fio", 50.0, 23));
        lista.adiciona(new Produto(101, "Pendrive", 13.5, 52));
        lista.adiciona(new Produto(102, "Celta", 45.5, 5));
        lista.adiciona(new Produto(103, "Teclado", 123.99, 342));
        lista.adiciona(new Produto(104, "Monitor", 349.90, 12));

        lista.exibe();
        gravaArquivoCsv(lista, "produto");
        leExibeArquivoCsv("produto");
    }

}
