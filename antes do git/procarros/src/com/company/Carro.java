package com.company;

public class Carro {
    //definir atributos
    String cor;
    String modelo;
    int quantidadePortas;

    //definir metodos
    void andar(){
        System.out.println("-------->");
        System.out.println("Carro " +modelo+ " comçou a andar");

    }
    void estacionar(){
        System.out.println("Carro " +modelo+ " parado / Estacionado");
        System.out.println("-----------");

    }
    void parar(){
        System.out.println("carro "+modelo+ " parou");
        System.out.println(">----------");
    }
}
