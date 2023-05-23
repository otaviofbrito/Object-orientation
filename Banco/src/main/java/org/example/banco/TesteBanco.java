package org.example.banco;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteBanco {

    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("OTAVIO", "BRITO");
        banco.addCliente(cliente1);
        Conta pp1 = new ContaPoupanca(50000,0.03);
        ContaCorrente cc1 = new ContaCorrente(200, new ContaPoupanca(100,0.03));
        cliente1.setContaCorrente(cc1);
        cc1.sacar(250);
        System.out.println("saldo " + cc1.getSaldo());
        System.out.println("saldo " + cc1.getContaPoupanca().getSaldo());


    }
}