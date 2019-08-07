package br.com.pfalves.sample1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double saln, sal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        sal = Double.parseDouble(scanner.nextLine());

        double aumento = calcularAumento(sal);

        saln = sal + aumento;

        System.out.println("O valor do novo salário é de " + saln);
    }
     public static double calcularAumento(double sal){
         if(sal < 500){
            return sal * 0.15;
         }
        if(sal>=500 && sal>=1000){
            return sal * 0.10;
        }
        return sal * 0.05;
        }

    }

