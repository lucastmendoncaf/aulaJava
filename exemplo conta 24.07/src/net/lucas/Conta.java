package net.lucas;

public class Conta {
    public int nunConta;
    public String nomeCliente;
    public double saldo;
    public double cpmf ;

    public void sacar(double valor){
        double valorImposto = valor * cpmf;
        saldo = saldo - valor - valorImposto;
    }
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    /**
     * @param
     */
    public void imprimir(){
        System.out.println("-----------------");
        System.out.println("dados da conta");
        System.out.println("numero da conta = " + nunConta);
        System.out.println("Nome do Cliente = " + nomeCliente);
        System.out.println("Saldo = " + saldo);
        System.out.println("-----------------");
    }
}
