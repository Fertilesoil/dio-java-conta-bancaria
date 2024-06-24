package models;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    final private String nome;
    private final List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    protected void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void exibirContas() {
        System.out.println(this.contas);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "{" + "banco = " + nome + '}';
    }
}
