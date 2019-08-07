package br.com.pfalves.sample1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner leitor = new Scanner(System.in);
        double t1, t2;
        String resultado;
        System.out.println("Qual a temperatura");
        t1 = Double.parseDouble(leitor.nextLine());
        if (t1 < 99) {
            resultado = "A temperatura esta muito baixa";
        } else if (t1 <= 200) {
            resultado = "A temperatura esta baixa";
        }
        else  if (t1 <= 500){
            resultado = "A temperatura esta suave";
        }
        else {
            resultado = "ta quente bagarai";
        }
        System.out.println(" "+ resultado);
    }
}
