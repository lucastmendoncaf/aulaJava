package net.lucas;

public class Acampamento {
    public String nome;
    public char equipe;
    public int idade;

    public void immprimir(){
        System.out.println("nome da pessoa = " + nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);
    };

    public void separargrupo(){
        if(idade <=5){
            equipe = ' ';
        }else{
            if (idade <=10){
                equipe = 'a';
            }else{
                if (idade <=20){
                    equipe = 'b';
            }else{
                    equipe = 'C';
                }
            }
        }
    };
}



