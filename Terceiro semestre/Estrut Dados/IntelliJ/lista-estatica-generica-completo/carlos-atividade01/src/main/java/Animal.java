public class Animal {
  private int id;
  private String nome;
  private Double valorConsulta;
  private boolean isCastrado;

  private String tipoAnimal;

  public Animal(int id, String nome, Double valorConsulta, boolean isCastrado , String tipoAnimal) {
    this.id = id;
    this.nome = nome;
    this.valorConsulta = valorConsulta;
    this.isCastrado = isCastrado;
    this.tipoAnimal = tipoAnimal;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getValorConsulta() {
    return valorConsulta;
  }

  public void setValorConsulta(Double valorConsulta) {
    this.valorConsulta = valorConsulta;
  }

  public boolean isCastrado() {
    return isCastrado;
  }

  public void setCastrado(boolean castrado) {
    isCastrado = castrado;
  }

  public String getTipoAnimal() {
    return tipoAnimal;
  }


  public void setTipoAnimal(String tipoAnimal) {
    this.tipoAnimal = tipoAnimal;
  }

  @Override
  public String toString() {
    return "Animal{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", valorConsulta=" + valorConsulta +
            ", isCastrado=" + isCastrado +
            ", tipoAnimal='" + tipoAnimal + '\'' +
            '}';
  }
}
