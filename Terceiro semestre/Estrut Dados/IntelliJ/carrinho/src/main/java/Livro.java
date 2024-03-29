public class Livro extends Produto {

    private String autor;
    private String isbn;

    public Livro(String nome, String codigo, Double precoCusto, String autor, String isbn) {
        super(nome, codigo, precoCusto);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public Double getValorVenda() {
        return getPrecoCusto() * 1.1;
    }

    @Override
    public String toString() {
        return "\n" + "-".repeat(30) + "\n" +
                "Livro" + "\n" +
                super.toString() + "\n" +
                "Autor: " + autor + "\n" +
                "ISBN: " + isbn + "\n" +
                "-".repeat(30) + "\n";

    }
}
