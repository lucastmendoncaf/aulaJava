package br.com.pfalves.sample1;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        double qtd, pm,pt;
        String resultado;

        System.out.println("Digite oa quantidade de maças: ");
        qtd = Double.parseDouble(leitor.nextLine());

        if (qtd <12){
            pm = 1.30;
            pt = qtd * pm;
            resultado = "O preço de total de :"+qtd+" Maças sera: "+pt+" ao custo de: "+pm+" por maça";
        }
        else{
            pm = 1;
            pt = qtd * pm;
            resultado = "O preço de total de: "+qtd+" Maças sera: "+pt+" ao custo: de "+pm+" por maça";
        }
        System.out.println(resultado);

    }
}
