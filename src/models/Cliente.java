package models;

public class Cliente {
    private final String nomeCliente;

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    @Override
    public String toString() {
        return "{" + "cliente = " + nomeCliente + '}';
    }
}
