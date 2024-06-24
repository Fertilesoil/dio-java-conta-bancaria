import models.*;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Midas");
        Cliente nelson = new Cliente("Nelson");
        Cliente josefa = new Cliente("Josefa");


        Conta contaCorrente = new ContaCorrente(90.0, banco, nelson);
        Conta contaPoupanca = new ContaPoupanca(3000.0, banco, josefa);

        contaCorrente.sacar(130d);
        System.out.println();

        contaCorrente.sacar(80d);
        System.out.println();

        contaPoupanca.transferir(500d, contaCorrente);
        System.out.println();

        contaCorrente.imprimirExtrato();
        System.out.println();
        contaPoupanca.imprimirExtrato();
        System.out.println();

        banco.exibirContas();
    }
}