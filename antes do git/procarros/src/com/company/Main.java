package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carro fusca = new Carro();
        fusca.cor = "Amarelo";
        fusca.quantidadePortas = 2;
        fusca.modelo = "fusca1500";

        Carro frontier = new Carro();
        frontier.cor = "prata";
        frontier.quantidadePortas = 4;
        frontier.modelo = "frontier2.0";

        fusca.andar();
        frontier.andar();
        fusca.parar();
        fusca.estacionar();

    }
}
