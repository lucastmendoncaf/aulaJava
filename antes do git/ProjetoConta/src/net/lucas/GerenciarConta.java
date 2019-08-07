package net.lucas;

import net.lucas.Model.Cliente;
import net.lucas.Model.Conta;

import java.awt.*;
import java.util.Scanner;

public class GerenciarConta {
    public Conta conta = new Conta();
    public static void main(String[] args) {
	// write your code here
        GerenciarConta gc = new GerenciarConta();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{

            System.out.println("Menu PRINCIPAL");
            System.out.println("1... Cadastar Conta");
            System.out.println("2... Depositar");
            System.out.println("3... Sacar");
            System.out.println("4... Ver o saldo");
            System.out.println("5... ver dados");
            System.out.println("9... SAIR");
            System.out.println("Digite Sua Opacaop");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    gc.cadastrarConta();
                    break;
                case 2:
                    gc.efetuarDeposito();
                    break;
                case 3:
                 gc.efetuarDeposito();
                 break;
                case 4:
                    gc.consultarSaldo();
                    break;
                case 5:
                    gc.consultarDados();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opaco invalida");
            }
            //montar menu
        }while (opcao != 9);
    }

    public void cadastrarConta(){
        Scanner sc = new Scanner(System.in);
    //cadastras o cliente primeiro
        Cliente cliente = new Cliente();
        System.out.println("Digite o id do Cliente");
        cliente.setIdCliente(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome do Cliente");
        cliente.setNome((sc.nextLine()));
        System.out.println("Digite o email do Cliente");
        cliente.setEmail((sc.nextLine()));
        //dados da conta
        conta.setCliente(cliente);
        System.out.println("Digite o numero da conta: ");
        conta.setNunConta(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a agencia da conta: ");
        conta.setAgencia(sc.nextLine());
        System.out.println("Conta cadastrada com sucesso");
    }

    public void efetuarDeposito(){
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.println("Digite o valor do deposito");
        valor = Double.parseDouble(sc.nextLine());
        //depositar agpra
        boolean deuCerto = conta.depositar(valor);
        if(deuCerto){
            System.out.println("Deposito efetuado com sucesso");
        }else {
            System.out.println("Valor invalido para deposito");
        }

    }
    public void EfetuarSaque(){
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.println("Digite o valor do saque");
        valor = Double.parseDouble(sc.nextLine());
        //dacar agpra
        boolean deuCerto = conta.sacar(valor);
        if(deuCerto){
            System.out.println("saque efetuado com sucesso ");
        }else {
            System.out.println(" sem saldo para o saque ");
        }

    }

    public void consultarDados(){
        
    }

    public void consultarSaldo(){


    }
}
