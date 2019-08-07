package br.com.pfalves.sample1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        double vc, qtd, pr, vt, j, d, vp, tp, a,  sup;
        String resultado;
        System.out.println("Digite o valor em caixa: ");
        vc = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite a Qantidae de produtos: ");
        qtd = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o preço de cada unidade: ");
        pr = Double.parseDouble(leitor.nextLine());

        vt = qtd * pr;
        j = 0.10;
        d = 0.05;
        sup = vc * 0.80;
        tp = vt +(vt*j);
        vp = tp /3;
        a= vt - (vt*d);

        if (vt > sup){
            resultado = "A compra sera parcelada em 3x, cada parcela " +
                    "sera de: " +vp + "e o total sera de: " +tp;
        }
        else {
            resultado = "a compra sera avista e o valor total sera: "+a;
        }
        System.out.println(resultado);

    }
}
