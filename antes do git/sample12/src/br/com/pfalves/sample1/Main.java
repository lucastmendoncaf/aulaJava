package br.com.pfalves.sample1;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double precos [] = {13.89, 15.99, 17.99};
        double total = 0.0;
        int opc = 0;
        StringBuilder menu = new StringBuilder();
        menu.append("Cardapio de Hoje \n");
        menu.append("1...Big Mac\n");
        menu.append("2...Big Rod\n");
        menu.append("3...Big Combo Especial\n");
        menu.append("4...Sair\n");
        menu.append("Escolha sua opção\n");
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, menu.toString()));
            switch (opc){
                case 1:
                total+= precos[0];
                break;
                case 2:
                    total+= precos[1];
                    break;
                case 3:
                    total+= precos[2];
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null),
                        ""
            }

        }while(opc!=9);
    }
}
