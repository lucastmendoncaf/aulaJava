package br.com.pfalves.sample1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //comando if
        int x = 10;
        boolean ehCasado = true;
        double salario = 1000.0;
        double aumento = calcularValorDeAumento(ehCasado, salario);
        System.out.println("aumento = " + aumento);


    }
    public static double calcularValorDeAumento(boolean ehCasado, double salario){
        if (ehCasado && salario>=950){
            return salario * 0.10;
        }
        if (!ehCasado && salario >= 1500.0) {
            return  salario * 0.10;
        }
        return  salario * 0.09;
    }
}
