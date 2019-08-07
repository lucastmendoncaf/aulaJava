package net.lucas.Model;

public class Conta {
    private int nunConta;
    private String agencia;
    private Cliente cliente;
    private double saldo;

    public int getNunConta() {
        return nunConta;
    }

    public void setNunConta(int nunConta) {
        this.nunConta = nunConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Nun da conta: " + nunConta + "\n" +
                "Agencia: " + agencia + "\n" +
                        cliente.toString() +
                "Saldo em Reais" + saldo + "\n";
    }

    public boolean sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor) {
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }
}
