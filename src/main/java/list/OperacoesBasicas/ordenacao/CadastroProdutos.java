package main.java.list.OperacoesBasicas.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos
{
    private Set<Produto> produtoSet;

    public CadastroProdutos(Set<Produto> produtoSet)
    {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade)
    {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome()
    {
        Set<Produto> ProdutosPorNome = new TreeSet<>();
        return ProdutosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco ()
    {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }
}
