import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ExemploArquivoTxt {

    public static void gravaRegistro(String registro, String nomeArq) {
        BufferedWriter saida = null;

        try {
            saida = new BufferedWriter(new FileWriter(nomeArq, true));
        } catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            erro.printStackTrace();
        }

        try {
            saida.append(registro + "\n");
            saida.close();
        } catch (IOException erro) {
            System.out.println("Erro ao gravar o arquivo");
            erro.printStackTrace();
        }
    }

    public static void gravaArquivoTxt(List<Aluno> alunos, String nomeArq) {
        int contaRegDados = 0;

        String header = "00NOTA20222";
        header += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        header += "01";

        gravaRegistro(header, nomeArq);

        String corpo;
        for (Aluno a : alunos) {
            corpo = "02";
            corpo += String.format("%-5.5s", a.getCurso());
            corpo += String.format("%-8.8s", a.getRa());
            corpo += String.format("%-50.50s", a.getNome());
            corpo += String.format("%-40.40s", a.getDisciplina());
            corpo += String.format("%5.2f", a.getMedia());
            corpo += String.format("%03d", a.getQtdFalta());

            gravaRegistro(corpo, nomeArq);

            contaRegDados++;
        }

        String trailer = "01";
        trailer += String.format("%010d", contaRegDados);
        gravaRegistro(trailer, nomeArq);
        contaRegDados++;
    }

    public static void leArquivoTxt(String nomeArq) {
        BufferedReader entrada = null;
        String registro, tipoRegistro;
        String ra, nome, curso, disciplina;
        Double media;
        Integer qtdFalta;
        int contaRegDadoLido = 0;
        int qtdRegDadoGravado;

        List<Aluno> listaLida = new ArrayList<>();

        try {
            entrada = new BufferedReader(new FileReader(nomeArq));
        } catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            erro.printStackTrace();
        }

        try {
            registro = entrada.readLine();

            while (registro != null) {
                tipoRegistro = registro.substring(0,2);
                if (tipoRegistro.equals("00")) {
                    System.out.println("Registro de Header");
                    System.out.println("Tipo do arquivo: " + registro.substring(2,6));                    System.out.println("Tipo do arquivo: " + registro.substring(2,6));
                    System.out.println("Ano e semestre: " + registro.substring(6,11));
                    System.out.println("Data e hora da gravação: " + registro.substring(11,30));
                    System.out.println("Versão do documento: " + registro.substring(30,32));

                } else if (tipoRegistro.equals("01")) {
                    System.out.println("Registri de Trailer");
                    qtdRegDadoGravado = Integer.valueOf(registro.substring(2, 12));
                    if (contaRegDadoLido == qtdRegDadoGravado) {
                        System.out.println("Quantidade de registros lidos é compatível com" +
                                " a quantidade de registros gravados");
                    }
                    else {
                        System.out.println("Quantidade de registros lidos NÃO é compatível com" +
                                " a quantidade de registros gravados");
                    }
                } else if (tipoRegistro.equals("02")) {
                    System.out.println("Registri de Corpo");
                    curso = registro.substring(2, 7).trim();
                    ra = registro.substring(7, 15).trim();
                    nome = registro.substring(15, 65).trim();
                    disciplina = registro.substring(65, 105).trim();
                    media = Double.valueOf(registro.substring(105, 110).replace(',', '.'));
                    qtdFalta = Integer.valueOf(registro.substring(110, 113));

                    contaRegDadoLido++;

                    Aluno a = new Aluno(ra, nome, curso, disciplina, media, qtdFalta);
                    listaLida.add(a);

                } else {
                    System.out.println("Tipo de registro inválido!");
                }

                registro = entrada.readLine();
            }
            entrada.close();
        } catch (IOException erro) {
            System.out.println("Erro ao ler arquivo");
            erro.printStackTrace();
        }

        System.out.println("\n Conteúdo da lista lido do arquivo");
        for (Aluno a : listaLida) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("01212057", "Gabriel Damas", "CCO",
                "Cálculo Computacional", 8.5, 5));
        alunos.add(new Aluno("01212110", "Carlos Dominciano", "ADS",
                "Estrutura de Dados", 6.5, 0));
        alunos.add(new Aluno("01212164", "Milena Fazolini", "REDES",
                "Segurança da Informação", 7.0, 0));
        alunos.add(new Aluno("01212321", "Donilo do Nilo", "ADS",
                "Arquitetura Computacional", 7.5, 0));
        alunos.add(new Aluno("01212013", "Index PHP", "ADS",
                "Estrutura de Dados", .0, 50));

        System.out.println("Lista original:");
        for (Aluno a: alunos) {
            System.out.println(a);
        }
        System.out.println();

//        gravaArquivoTxt(alunos, "lista.txt");
        leArquivoTxt("lista.txt");
    }

}
