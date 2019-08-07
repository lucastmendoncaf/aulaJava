package br.com.pfalves.sample1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //escolha o sao duixe pelo numero
      int  opc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("EScolha pelo NUmero");
        System.out.println("1... big Mac");
        System.out.println("2... Stakehouse");
        System.out.println("3... Casquinha de chocolate");
        System.out.println("9... Sair");
        System.out.println("... Digite o numero");
        opc = Integer.parseInt(sc.nextLine());
        switch (opc){
            case 1:
                System.out.println("Sua escolha foi o big Mac");
                break;
            case 2:
                System.out.println("sua escolha foi o steakhouse");
                break;
            case 3:
                System.out.println("Diverta-se com a casquinha");
                break;
            case 9:
                System.out.println("Fim do programa");
                break;
            default:
                System.out.println("Escolha corretamente");

        }
    }
}
