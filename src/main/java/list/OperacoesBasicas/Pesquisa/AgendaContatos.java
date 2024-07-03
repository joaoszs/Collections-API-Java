package main.java.list.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos
{
    private Set<Contato> contatoSet ;

    public AgendaContatos()
    {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero)
    {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato()
    {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome)
    {
        Set<Contato> ContatosPorNome = new HashSet<>();
        for (Contato c : contatoSet)
        {
            if (c.getNome().startsWith(nome))
            {
                ContatosPorNome.add(c);
            }
        }
        return ContatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero)
    {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet)
        {
            if (c.getNome().equalsIgnoreCase(nome))
            {
                c.setNumero(novoNumero);
                break;
            }
        }
        return contatoAtualizado;
    }
}
