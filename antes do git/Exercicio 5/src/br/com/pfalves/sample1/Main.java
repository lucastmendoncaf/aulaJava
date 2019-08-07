package br.com.pfalves.sample1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        String resultado;
        Double a, p, imc;


        System.out.println("Qual o seu peso : ");
        p = Double.parseDouble(leitor.nextLine());

        System.out.println("Qual a sua altura : ");
        a = Double.parseDouble(leitor.nextLine());

        imc = p / (a*a);

        if (imc <18.5){
            System.out.println("Esta abaixo do peso");
        }else {
            if (imc < 25){
                System.out.println(" Peso ideal ");
            }else {
                if (imc < 30){
                    System.out.println("Parabens esta com obesidade de grau 1");
                }else{
                    if (imc < 35){
                        System.out.println("Parabens, sua obesidade e de nivel 2");
                    }else {
                        System.out.println("Parabens voce esta com obesidade morbida de nivel 3");
                    }
                }
            }
        }



    }
}
