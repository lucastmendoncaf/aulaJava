package br.com.pfalves.sample1.modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class aluno {
                //atributos do aluno
        private int rm;
        private String nome;
        private String email;
        private String curso;

        //Métodos

    public void matricular () {
        System.out.println(" aluno " + nome);
        System.out.println(" Matriculado com ");
        System.out.println(" Sucesso");
    }
    public void  cancelarmatricula () {
        System.out.println(" aluno " + nome);
        System.out.println(" registro cancelado ");
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter  formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(agora.format(formato));
        System.out.println(" Sucesso");
    }
    //metodos get and set

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public String toString(){
        return "RM: " + rm + "\nNome: " + nome + "\nEmail: "
                + email + "\nCurso" + "\n";
    }
}
