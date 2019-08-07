package net.lucas;

public class Compiuter {
    public String marca;
    public String cor;
    public String modelo;
    public long nunSerie;
    public double preco;

    public void imprimir(){
        System.out.println("marca = " + marca);
        System.out.println("cor = " + cor);
        System.out.println("modelo = " + modelo);
        System.out.println("nunSerie = " + nunSerie);
        System.out.println("preco = " + preco);
    }

    public void calculaValor(){
    if (marca =="hp"){
        preco = preco + (preco* 0.3);
        System.out.println("O preco alterou para: "+ preco);
    }else{
        if (marca == "IBM"){
            preco = preco + (preco* 0.5);
            System.out.println("O preco alterou para: "+ preco);
        }else{
            System.out.println("O preco nao alterara:");
        }
         }
    }

    public void alteravalor(){


    }
}
