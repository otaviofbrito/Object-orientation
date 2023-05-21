package org.example.banco;

import java.util.Scanner;

public class TesteBanco {

    public static void main(String[] args){

        Banco banco = new Banco();
        Cliente c1 = new Cliente("Rogerio", "gordo");
        Cliente c2 = new Cliente("alicia", "garnier");
        Cliente c3 = new Cliente("otavio", "brito");
        Conta conta1 = new Conta(100000);
        Conta conta2 = new Conta(300000);
        Conta conta3 = new Conta(20000);
        c1.setConta(conta1);
        c2.setConta(conta2);
        c3.setConta(conta3);

        banco.addCliente(c1);
        banco.addCliente(c2);
        banco.addCliente(c3);
        System.out.println("Clientes: " + banco.getNumeroDeClientes());
        System.out.println("Cliente:" + banco.getCliente(0).getNome() + ", saldo: " + conta1.getSaldo());
        System.out.println("Cliente:" + banco.getCliente(1).getNome() + ", saldo: " + conta2.getSaldo());
        System.out.println("Cliente:" + banco.getCliente(2).getNome() + ", saldo: " + conta3.getSaldo());
    }

}
