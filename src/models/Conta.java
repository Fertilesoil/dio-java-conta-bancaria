package models;

public abstract class Conta {
    private static final int numeroDaConta = 327;
    private static int digitoDaConta = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(double saldo, Banco banco, Cliente cliente) {
        this.agencia = numeroDaConta;
        this.conta = digitoDaConta++;
        this.saldo = saldo;
        this.banco = banco;
        banco.adicionarConta(this);
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente, tente novamente mais tarde.");
            return;
        }

        this.saldo -= valor;
        System.out.println("Seu saldo agora é: " + String.format("%.2f", this.saldo));
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Seu saldo agora é: " + String.format("%.2f", this.saldo));
    }

    public void transferir(double valor, Conta contaParaTransferir) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente, tente novamente mais tarde.");
            return;
        }

        this.sacar(valor);
        contaParaTransferir.depositar(valor);
        System.out.println("Sucesso! Você acaba de transferir o valor de: " + String.format("%.2f", valor));
    }

    protected void infoConta() {
        System.out.println("Informações de " + this.cliente.getNomeCliente());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Saldo atual: " + String.format("%.2f", this.saldo));
    }
    public abstract void imprimirExtrato();

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                ", banco=" + banco +
                '}';
    }
}
