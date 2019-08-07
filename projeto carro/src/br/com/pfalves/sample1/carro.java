package br.com.pfalves.sample1;

public class carro {
    //definir os atributos
    public String nome;
    public String marca;
    public String cor;
    public String modelo;
    public String ano;

    // Definir os corpos dos metodos

    public void estacionar () {
    //o que faz o metodo
        System.out.println("carro : " + nome);
        System.out.println("Sendo estacionado");
    }
    public void andar (int velocidade) {
        System.out.println("Carro : " + nome);
        System.out.println("sendo acelerado em " + velocidade);
        System.out.println("por hora");
    }
    public void parar () {
        System.out.println("Carro sendo parado");
    }
}
