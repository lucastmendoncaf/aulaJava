package br.com.pfalves.sample1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o salario; ");
        salario = Double.parseDouble(sc.nextLine());

        //calcular o aumento usando o if tenario
        double aumento = salario > 5000.0 ? salario * 0.9 : salario * 0.11;
        System.out.println("aumento "+ aumento);
    }
}
