package br.com.pfalves.sample1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     double p, v, d;
     int q, c = 0;
     Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor da etiqueta:");
        p = Double.parseDouble(sc.nextLine());

        System.out.println("digite a quantidade de produtos:");
        q = Integer.parseInt(sc.nextLine());

        v = p * q;

     switch (c){

         case 1:
             d = v * 0.10;
             v = v + d;
             System.out.println("O valor total da sua compra é " + v);
             break;

         case 2:
             d = v * 0.05;
             v = v + d;
             System.out.println("O valor total da sua compra é " + v);
             break;

         case 3:
             v = v / 2;
             System.out.println("O valor total de cada parcela é " + v);

         case 4:
             d = v * 0.10;
             v = v + d;
             System.out.println("O valor total da sua compra é " + v);
             break;
     }



    }
}
