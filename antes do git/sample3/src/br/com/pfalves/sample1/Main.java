package br.com.pfalves.sample1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// ultima versao de some dois valores usandp o console
        int raio, pi;
        //criar um leitor de teclado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite ym valor para a: ");
        a = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite ym valor para b: ");
        b = Integer.parseInt(leitor.nextLine());

        int soma = a + b;
        System.out.println("o resultado da soma é " + soma);
    }
}
