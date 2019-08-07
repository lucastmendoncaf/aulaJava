package br.com.pfalves.sampleCONE;

import br.com.pfalves.sampleCONE.visao.ConeView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        int opc =0;
        while(opc !=9){
            System.out.println("Menu PRINCIPAL");
            System.out.println("1... Volume do Cone");
            System.out.println("2... VOlume da esfera");
            System.out.println("9... Sair");
            System.out.println("EScolha A opcao: ");
            opc = Integer.parseInt(leitor.nextLine());
            switch (opc){
                case 1:
                    ConeView mikey = new ConeView();
                    mikey.executarPrograma();
                    break;
                case 2:
                    System.out.println("nao esta pronto");
                    break;
                case 9:
                    System.out.println("Fim do pogama");
                    break;
                default:
                    System.out.println("Escolha Incorreta");
                    System.out.println("Verifique a opcao novamente");
                    break;
            }
        }
    }
}
