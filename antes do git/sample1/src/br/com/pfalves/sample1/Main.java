package br.com.pfalves.sample1;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a;
        int b;
        a = 15;
        b = 20;
        int soma = a + b;
        System.out.println("o resultado: " + soma);
        JOptionPane.showMessageDialog( null, "Resultado " + soma,
                "Soma de valores", JOptionPane.INFORMATION_MESSAGE);
    }
}
