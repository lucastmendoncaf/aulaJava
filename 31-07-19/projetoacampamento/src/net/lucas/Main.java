package net.lucas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Acampamento membro = new Acampamento();
        Scanner iscan = new Scanner(System.in);
        System.out.println("digite o nome da pessoa: ");
        membro.nome = iscan.nextLine();
        System.out.println("digite a idade da pessoa: ");
        membro.idade = Integer.parseInt(iscan.nextLine());
        membro.immprimir();
        membro.separargrupo();
        membro.immprimir();

    }
}
