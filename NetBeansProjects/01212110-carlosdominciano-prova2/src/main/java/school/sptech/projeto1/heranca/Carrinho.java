package school.sptech.projeto1.heranca;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    
    List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }
    
    /**
     * Adiciona um {@link Produto} novo no carrinho.
     * Caso o valor seja {@link null} o {@link Produto} não deve ser adicionado
     * 
     * @param produto Novo {@link Produto} a ser adicionado
     */
    public void adicionarProduto(Produto produto) {
        if (produto != null) {
            produtos.add(produto);
        }
    }

    /**
     * Remove um {@link Produto} do carrinho pelo índice.
     *
     * @param indice Índice do {@link Produto} que será removido
     */
    public void removerProduto(int indice) {
        this.produtos.remove(indice);
    }
    
    /**
     * Calcula o valor total de todos os itens do carrinho.
     * 
     * @return valor total do carrinho
     */
    public Double calcularTotal() {
        Double c = 0.0;
        for (Produto produto : produtos) {
            c += produto.getPreco();
        }
        return c;
    }
    
    /**
     * Calcula o valor das parcelas de acordo com o número de vezes que
     * o usuário deseja parcelar.
     * 
     * @param vezes Número de vezes que o usuário deseja parcelar
     * @return total do carrinho parcelado
     */
    public Double parcelarCompra(Integer vezes) {
        return calcularTotal() / vezes;
    }
    
    /**
     * Encontra um {@link Produto} com o índice desejado.
     * Caso o índice não seja encontrado retorne {@link null}
     * 
     * @param index Índice do {@link Produto}
     * @return {@link Produto} encontrado
     */
    public Produto findProdutoPeloIndice(Integer index) {
        for (int i = 0; i < produtos.size(); i++) {
            if (index == i) {
                return produtos.get(i);
            }
        }
        return null;
    }
    
    /**
     * Encontra um {@link Produto} com o nome desejado ignorando letras 
     * maiúsculas e minúsculas.
     * 
     * Caso um {@link Produto} não seja encontrado retorne {@link null}
     * 
     * @param nome Nome do {@link Produto}
     * @return {@link Produto} encontrado
     */
    public Produto findProdutoPeloNome(String nome) {
        for (Produto produtoDaVez : produtos) {
            
            if (produtoDaVez.getNome().equalsIgnoreCase(nome)) {
       
                return produtoDaVez;
            }
            
        }
        return null;
    }
    
    /**
     * Encontra todos os {@link Produto} de uma determinada categoria
     * ignorando letras maiúsculas e minúsculas.
     * 
     * Caso não encontre nenhum {@link Produto} devolva uma lista vazia
     * 
     * @param categoria Categoria desejada
     * @return Produtos encontrados
     */
    public List<Produto> findProdutoPorCategoria(String categoria) {
        List<Produto> p = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(categoria)) {
                p.add(produto);
            }
        }
        return p;
    }
    
    /**
     * Encontra todos os {@link ProdutoInternacional} presentes no {@link Carrinho}.
     * Caso não encontre nenhum {@link ProdutoInternacional} devolva uma lista vazia
     * 
     * @return Produtos internacionais encontrados
     */
    public Integer countProdutosInternacionais() {
        Integer c = 0;
        for (Produto produto : produtos) {
            if (produto instanceof ProdutoInternacional) {
                c++;
            }
        }
        return c;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }
}
