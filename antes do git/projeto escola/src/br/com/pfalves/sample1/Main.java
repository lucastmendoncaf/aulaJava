package br.com.pfalves.sample1;

import br.com.pfalves.sample1.modelo.aluno;

public class Main {

    public static void main(String[] args) {
	// write your code here
        aluno aluno;
        //objeto
        aluno = new aluno();
        aluno.setRm(15000);
        aluno.setNome("Carlos Silva");
        aluno.setEmail("Carlos@gmail.com");
        aluno.setCurso("informatica");
        System.out.println("RM " + aluno.getRm());

        //matricular
        aluno.matricular();
        //cancelar
        aluno.cancelarmatricula();
    }
}
