package org.example.banco;

import java.util.Scanner;

public class TesteBanco {

    public static void main(String[] args){

        Cliente cliente = new Cliente("Otavio", "Brito");
        Conta conta = new Conta(50000);
        cliente.setConta(conta);
        System.out.println("Cliente: " + cliente.getNome() + ", saldo: " + cliente.getConta().getSaldo());
        System.out.println("Sacar 1200" + conta.sacar(1200));
        System.out.println("depositar 8525" + conta.depositar(8525));
        System.out.println("sacar 12800" + conta.sacar(12800));
        System.out.println("sacar 50000" + conta.sacar(50000));
        System.out.println("saldo: " + conta.getSaldo());
    }

}
