import java.util.ArrayList;
import java.util.List;

public class Repositorio {

  //c) Classe Repositorio
  //A assinatura dos métodos já foi criada, sendo necessário apenas completar
  // de acordo com a descrição do enunciado.
  //Atributos:
  //uma lista, que deve ser um List<TemaLivre>, sendo TemaLivre a classe definida no item (a).
  //uma pilha, que deve ser um objeto de PilhaObj <Operacao>.
  //uma fila, que deve ser um objeto de FilaObj <Integer>.
  //um contador (inteiro) de operações empilhadas.
  //Construtor:
  //O construtor dessa classe não recebe argumentos e deve fazer new da lista usando ArrayList,
  // e um new da pilha e da fila com tamanho 10, e zerar o contador de operações empilhadas.
  //Atributos - não é necessário adicionar novos
  private List<Personagem> objetosPersonagem;
  private PilhaObj<Operacao> pilhaOperacao;
  private FilaObj<Integer> filaIds;
  private int contadorOperacoesPilha;

  //Construtor (completar)
  public Repositorio() {
      objetosPersonagem = new ArrayList<>();
      pilhaOperacao = new PilhaObj<>(10);
      filaIds = new FilaObj<>(10);
      contadorOperacoesPilha = 0;
  }












  //Métodos (completar)
  public void salvar(Personagem objetoAdicionar){
    //salvar(TemaLivre obj) - void - recebe um
    // objeto da classe do item (a) e salva esse objeto na lista.
    if (objetoAdicionar != null) {
      objetosPersonagem.add(objetoAdicionar);
    }
  }

  public void deletarPeloId(int id){
    //deletarPeloId(int id) - void - recebe o id referente ao objeto
    // que deve ser removido da lista
    //Se o id não existir, lance uma IllegalArgumentException.
    //Se o id existir, remova o objeto correspondente da lista.
    int listSize = objetosPersonagem.size();
    for (Personagem personagem : objetosPersonagem) {
      if (personagem.getId() == id)
        objetosPersonagem.remove(personagem);
    }
    if (listSize == objetosPersonagem.size())
      throw new IllegalArgumentException();
  }

  public void aumentarValorPeloId(int id, Double valor){
    //aumentarValorPeloId(int id, Double valorDeAumento) – void -
    // recebe o id do objeto, cujo atributo valor deve ganhar o aumento
    // passado como argumento (valorDeAumento).  Exemplo: imagine que tem
    // um objeto TemaLivre com id= 100 e valor = 50.70. Se o método
    // aumentarValorPeloId(100, 200.0) for chamado, o objeto de id=100 ficará
    // com o valor=250.70, após a execução desse método.

    //Se o id não existir, lance uma IllegalArgumentException, senão execute o aumento solicitado
    //Crie um objeto do tipo Operacao, com o id e o valorDeAumento e empilhe
    // a operação para que ela possa ser desfeita depois (pela operação desfazer).
    // Incremente contador de operações empilhadas.

    int listSize = objetosPersonagem.size();
    for (Personagem personagem : objetosPersonagem) {
      if (personagem.getId() == id) {
        personagem.setValor(personagem.getValor()+valor);
        Operacao novaOperacao = new Operacao(id, valor);
        pilhaOperacao.push(novaOperacao);
        contadorOperacoesPilha++;
      }
    }
    if (listSize == objetosPersonagem.size())
      throw new IllegalArgumentException();
  }

  public void diminuirValorPeloId(int id, Double valor){
    //diminuirValorPeloId(int id, Double valorDeDiminuicao) void -
    // semelhante ao aumentarPorId recebe o id do objeto, e o valor que a ser subtraído,
    // esse método não altera a fila nem a pilha, apenas subtrai o valor do objeto da lista
    // (de id igual ao passado como argumento) e será usado posteriormente para desfazer
    // o aumentarValorPeloId.
    int listSize = objetosPersonagem.size();
    for (Personagem personagem : objetosPersonagem) {
      if (personagem.getId() == id)
        personagem.setValor(personagem.getValor() - valor);
    }
    if (listSize == objetosPersonagem.size())
      throw new IllegalArgumentException();

  }

  public void desfazer(int qtdOperacoesADesfazer) {
    //desfazer(int qtdOperacoesADesfazer) - void - desfaz a
    // qtdOperacoesADesfazer que estão empilhadas.
    //Se qtdOperacoesADesfazer for negativo ou maior que o contador de operações
    // empilhadas, lance uma IllegalArgumentException.
    //Se a pilha estiver vazia, lance uma IllegalStateException.
    //Se a pilha não estiver vazia, desempilhe qtdOperacoesADesfazer,
    // uma por uma, e desfaça cada operação chamando o método diminuirValorPeloId.
    //Não se esqueça de atualizar o valor do contador de operações empilhadas.
    if (qtdOperacoesADesfazer <= 0 || qtdOperacoesADesfazer > contadorOperacoesPilha) {
      throw new IllegalArgumentException();
    }
    else if (pilhaOperacao.isEmpty())
      throw new IllegalStateException();
    else {
      for (int i = 0; i < qtdOperacoesADesfazer; i++) {
        diminuirValorPeloId(pilhaOperacao.getPilha()[contadorOperacoesPilha-1].getId(),
                pilhaOperacao.getPilha()[contadorOperacoesPilha-1].getValorDeAumento());
        pilhaOperacao.pop();
        contadorOperacoesPilha--;
      }
    }
  }

  public void agendarDeletarPorId(int id){
    //agendarDeletarPorId(ind id) - void - essa operação agenda a operação
    // deletarPeloId para ser executado num momento futuro.

    //Recebe o id do objeto a ser deletado e enfileira esse id na fila,
    // para que o deletarPeloId correspondente seja executado posteriormente,
    // pela operação executarAgendado.

    filaIds.insert(id);

  }

  public void executarAgendado(){

    // executarAgendado() - void - esta operação executa UMA
    // operação que está enfileirada, se houver operações enfileiradas.

    //Se a fila estiver vazia, lance uma IllegalStateException.

    //Retire da fila UMA operação e execute-a.

    //As operações enfileiradas são o deletarPeloId. A
    // fila é preenchida no método agendarDeletarPorId.

    if (filaIds.isEmpty())
      throw new IllegalStateException();
    deletarPeloId(filaIds.peek());

  }

  //GETTERS e SETTERS (não remover)
  public List<Personagem> getObjetosPersonagem() {
    return objetosPersonagem;
  }

  public void setObjetosPersonagem(List<Personagem> objetosPersonagem) {
    this.objetosPersonagem = objetosPersonagem;
  }

  public PilhaObj<Operacao> getPilhaOperacao() {
    return pilhaOperacao;
  }

  public void setPilhaOperacao(PilhaObj<Operacao> pilhaOperacao) {
    this.pilhaOperacao = pilhaOperacao;
  }

  public FilaObj<Integer> getFilaIds() {
    return filaIds;
  }

  public void setFilaIds(FilaObj<Integer> filaIds) {
    this.filaIds = filaIds;
  }

  public int getContadorOperacoesPilha() {
    return contadorOperacoesPilha;
  }

  public void setContadorOperacoesPilha(int contadorOperacoesPilha) {
    this.contadorOperacoesPilha = contadorOperacoesPilha;
  }
}
