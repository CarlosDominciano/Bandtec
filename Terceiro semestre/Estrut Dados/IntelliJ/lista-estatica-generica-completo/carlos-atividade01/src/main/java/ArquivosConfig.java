import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArquivosConfig {

    public void gravaArquivoCsv(ListaObj<Animal> lista, String nomeArquivo) {
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
                Animal p = lista.getElemento(i);
                saida.format("%d;%s;%s;%.2f;%b\n",
                        p.getId(),
                        p.getNome(),
                        p.getTipoAnimal(),
                        p.getValorConsulta(),
                        p.isCastrado());
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

    public void leExibeArquivoCsv(String nomeArq) {
        FileReader arq = null; //objeto que representa o arquivo de leitura
        Scanner entrada = null; //objeto usado para ler do arquivo
        Boolean deuRuim = false;
        nomeArq += ".csv";
        System.out.println("aoba");

        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        //Bloco para ler o arquivo
        try {
            System.out.printf("%-6S %-12S %-10S %15S %9B \n",
                    "CÓDIGO",
                    "NOME_PET",
                    "TIPO_PET",
                    "VALOR_CONSULTA",
                    "CASTRADO");
            while (entrada.hasNext()) {
                int id = entrada .nextInt();
                String nome = entrada.next();
                String tipoAnimal = entrada.next();
                Double valor = entrada.nextDouble();
                boolean castrado = entrada.nextBoolean();
                System.out.printf("%06d %-12s %-10s %15.2f %9b \n",
                        id,
                        nome,
                        tipoAnimal,
                        valor,
                        castrado);
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

}
