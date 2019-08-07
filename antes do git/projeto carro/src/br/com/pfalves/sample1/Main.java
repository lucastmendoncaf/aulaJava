package br.com.pfalves.sample1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        carro carro1 = new carro();
        carro carro2 = new carro();
        // definir como sera o carro
        carro1.nome = "uno";
        carro1.marca =" fiat";
        carro1.cor = "Vermeio";
        carro1.ano = "2011";
        carro1.modelo = "cs";
        carro1.andar( 15);
        carro1.parar();

        carro2.nome = "Fuscao";
        carro2.marca = "vw";
        carro2.cor = "preto";
        carro2.ano = "1900";
        carro2.modelo = "fusca 1600";
        carro2.andar(20);
        carro2.parar();


    }
}
