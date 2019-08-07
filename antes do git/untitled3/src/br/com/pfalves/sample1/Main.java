package br.com.pfalves.sample1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 10; i++) {
            System.out.println("vetor na posicao" + i + "=" + vetor[i]);
        }
        for (int x: vetor) {
            System.out.println("x = " + x);
        }
    }
}
