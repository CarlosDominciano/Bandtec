// Renomeie o nome da classe através cliquando com direito na classe e em seguida 'Refactor'
// Obs.: Não pode renomear escrevendo outro nome para classe direto nesse arquivo
public class Personagem {
  //Atributos
  //Adicione os demais atributos de acordo com sua classe sem alterar id e valor
  private int id;
  private Double valor;
  private String nome;
  private Double dano;
  private int vida;
  private int escudo;


  // Obs.: Esse contrutor NÃO deve ser alterado, pois é usado nos testes
  public Personagem(int id, Double valor) {
    this.id = id;
    this.valor = valor;
  }

  // Crie um novo construtor (sobrecarga),
  // Esse deve ser cheio (receber todos os atributos criados na classe)

  public Personagem(int id, Double valor, String nome, Double dano, int vida, int escudo) {
    this.id = id;
    this.valor = valor;
    this.nome = nome;
    this.dano = dano;
    this.vida = vida;
    this.escudo = escudo;
  }

  //Complete os getters e setters sem alterar os existentes
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getDano() {
    return dano;
  }

  public void setDano(Double dano) {
    this.dano = dano;
  }

  public int getVida() {
    return vida;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public int getEscudo() {
    return escudo;
  }

  public void setEscudo(int escudo) {
    this.escudo = escudo;
  }
}
