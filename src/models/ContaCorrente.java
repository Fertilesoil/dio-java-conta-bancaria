package models;

public class ContaCorrente extends Conta {
    public ContaCorrente(double saldo, Banco banco, Cliente cliente) {
        super(saldo, banco, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Bem vindo ao banco " + super.banco.getNome());
        System.out.println("********* Extrato da conta *********");
        super.infoConta();
        System.out.println("********* Obrigado por usar nosso banco, volte sempre! *********");
    }

    @Override
    public String toString() {
        return "ContaCorrente: {" +
                "agencia = " + agencia +
                ", conta = " + conta +
                ", saldo = " + saldo +
                ", cliente = " + cliente +
                ", banco = " + banco +
                '}';
    }
}
