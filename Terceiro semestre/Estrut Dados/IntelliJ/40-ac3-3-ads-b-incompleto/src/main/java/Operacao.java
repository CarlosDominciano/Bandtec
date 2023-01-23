public class Operacao {

  //b) Classe Operacao
  //Nessa classe, é necessário apenas completar o construtor
  //
  //Atributos:
  //id- int
  //valorDeAumento - Double
  //Implemente o construtor cheio
  //Crie setters e getters.


  //Atributos (não alterar)
  private int id;
  private Double valorDeAumento;

  //Construtor (completar)

  public Operacao(int id, Double valorDeAumento) {
    this.id = id;
    this.valorDeAumento = valorDeAumento;
  }

  //Getters & Setters (não alterar)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Double getValorDeAumento() {
    return valorDeAumento;
  }

  public void setValorDeAumento(Double valorDeAumento) {
    this.valorDeAumento = valorDeAumento;
  }
}
