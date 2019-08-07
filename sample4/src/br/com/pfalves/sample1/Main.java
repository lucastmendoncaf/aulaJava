package br.com.pfalves.sample1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double raio, pi, v;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = Double.parseDouble(leitor.nextLine());

         v = Math.PI * (raio*raio) ;
        System.out.println("a circunferencia da bola é " + v);
    }
}
