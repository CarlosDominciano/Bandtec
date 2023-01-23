public class Banco {

    // Atributos
    PilhaObj<Operacao> pilhaOperacao = new PilhaObj(10);
    FilaObj<Operacao> filaOperacao = new FilaObj(10);
    // Contador de operações empilhadas
    Integer contadorOperacao = 0;

    // Métodos

    /* Método debitar - recebe o valor a ser debitado e o objeto conta bancária
       Se o débito ocorreu com sucesso, cria um objeto Operacao com os valores adequados
       e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
     */
    public void debitar(Double valor, ContaBancaria conta) {
        Boolean resultado = conta.debitar(valor);

        if (resultado) {
            pilhaOperacao.push(new Operacao(conta, "Débito", valor));
            contadorOperacao++;
        }
    }

    /* Método depositar - recebe o valor a ser debitado e o objeto conta bancária
       Executa o depósito, cria um objeto Operacao com os valores adequados
       e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
     */
    public void depositar(Double valor, ContaBancaria conta) {
        conta.depositar(valor);
        pilhaOperacao.push(new Operacao(conta, "Depósito", valor));
        contadorOperacao++;
    }

    /* Método desfazerOperacao - recebe a quantidade de operações a serem desfeitas
       Se essa quantidade for inválida, lança IllegalArgumentException
       Senão, "desfaz" a quantidade de operações passadas como argumento
       e atualiza o contadorOperacao
     */
    public void desfazerOperacao(Integer qtdOperacaoDesfeita) {
        if (qtdOperacaoDesfeita <= 0 || qtdOperacaoDesfeita > contadorOperacao) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < qtdOperacaoDesfeita; i++) {
            Operacao operacao = pilhaOperacao.pop();
            switch (operacao.getTipoOperacao()) {
                case "Débito":
                    operacao.getContaBancaria().depositar(operacao.getValor());
                    contadorOperacao--;

                    break;

                case "Depósito":
                    operacao.getContaBancaria().debitar(operacao.getValor());
                    contadorOperacao--;

                    break;
            }
        }
    }


    /* Método agendarOperacao - recebe o tipo da operaçõa, o valor e o objeto conta bancária
       Se um dos argumentos for inválido, lança IllegalArgumentException.
       Senão, cria um objeto Operacao e insere esse objeto na fila.
    */
    public void agendarOperacao(String tipoOperacao, Double valor, ContaBancaria conta) {
        if (tipoOperacao.equals("Débito") || tipoOperacao.equals("Depósito")) {
        } else {
            throw new IllegalArgumentException();
        }

        if (valor <= 0.0 || conta == null) {
            throw new IllegalArgumentException();
        }

        filaOperacao.insert(new Operacao(conta, tipoOperacao, valor));

    }

    /* Método executarOperacoesAgendadas
       Se não houver operações na fila, exibe mensagem de que não há operações agendadas.
       Senão, esvazia a fila, executando cada uma das operações agendadas.
    */
    public void executarOperacoesAgendadas() {
        if (filaOperacao.isEmpty()) {
            System.out.print("Não há operações agendadas");
        }

        while (!filaOperacao.isEmpty()) {
            Operacao operacao = filaOperacao.poll();

            switch (operacao.getTipoOperacao()) {
                case "Débito":
                    operacao.getContaBancaria().debitar(operacao.getValor());
                    contadorOperacao++;

                    break;

                case "Depósito":
                    operacao.getContaBancaria().depositar(operacao.getValor());
                    contadorOperacao++;
                    break;
            }
        }

    }

    // Gettens

    public PilhaObj<Operacao> getPilhaOperacao() {
        return pilhaOperacao;
    }

    public FilaObj<Operacao> getFilaOperacao() {
        return filaOperacao;
    }

    public Integer getContadorOperacao() {
        return contadorOperacao;
    }
}
