package br.com.pfalves.sampleCONE.modelo;

public class Cone {
    private double raio;
    private double altura;


    private double getRaio(){
        return raio;
    }
    public void  setRaio(double raio){
        this.raio = raio;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public void calcularVolume(){
        double resultado;
        resultado = (Math.PI * Math.pow(raio, 2.0) + altura) /3.000;

    }

}



