package br.com.pfalves.sampleCONE.visao;

import br.com.pfalves.sampleCONE.modelo.Cone;

import java.util.Scanner;

public class ConeView {
    public void executarPrograma(){
        //pogama para ezecutar o calculo do volume desse cone
        Cone cone = new Cone();

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor so Raio: ");
        cone.setRaio(Double.parseDouble(leitor.nextLine()));
        System.out.println("Digite o valor da altura: ");
        cone.setAltura(Double.parseDouble(leitor.nextLine()));

        //importabdo o resultado
        System.out.println("valor do Volume do cone = " + cone.calcularVolume());


    }
}
