package org.example.banco;

public class TesteBanco {

    public static void main(String[] args){

        Conta cliente = new Conta(1000);
        System.out.println("Criando conta com saldo de: " + cliente.getSaldo());
        System.out.println("sacando: 250");
        cliente.sacar(250);
        System.out.println("depositando: 320.50");
        cliente.depositar(320.50);
        System.out.println("sacando: 120");
        cliente.sacar(120);
        System.out.println("saldo de: " + cliente.getSaldo());
    }

}
