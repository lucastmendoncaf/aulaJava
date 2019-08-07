package net.lucas;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Conta conta1, conta2;
    conta1 = new Conta();
    conta1.cpmf = 0.0010;
    conta1.nunConta = 123;
    conta1.nomeCliente = "Tamara";
    conta1.imprimir();
    conta1.depositar(2000);
    conta1.imprimir();
    conta1.sacar(1000);
    conta1.imprimir();

    conta2 =new Conta();
    conta2.cpmf = 1.0020;
    conta2.nunConta = 234;
    conta2.nomeCliente = "Jorge Tadeu";
    conta2.imprimir();
    conta2.depositar(500);
    conta2.sacar(100);
    conta2.imprimir();
    }

}
