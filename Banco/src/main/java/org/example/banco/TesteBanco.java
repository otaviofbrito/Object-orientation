package org.example.banco;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteBanco {

    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("OTAVIO", "BRITO");
        banco.addCliente(cliente1);
        Conta pp1 = new ContaPoupanca(50000,0.03);
        Conta cc1 = new ContaCorrente(220000);
        cliente1.addConta(pp1);
        cliente1.addConta(cc1);


        Cliente cliente2 = new Cliente("OTAVIO", "BRITO");
        banco.addCliente(cliente2);
        Conta pp2 = new ContaPoupanca(50000,0.03);
        cliente2.addConta(pp2);

        ArrayList<Cliente> clientes = banco.getCliente("OTAVIO","BRITO");
        System.out.println("CLIENTES: " + clientes.size());
        String tipoConta = "";
        for(int i = 0; i<clientes.size(); i++){
            Cliente nome = clientes.get(i);
            System.out.println("Cliente nmro: " + (i+1) + " " + nome.getNome() + " " + nome.getSobrenome());
            for(int j = 0; j<nome.getNumeroContas(); j++){
                Conta conta = nome.getContas(j);
                if(conta instanceof ContaPoupanca){
                    tipoConta = "Conta Poupanca";
                }else tipoConta = "Conta Corrente";
                System.out.println(tipoConta + " " + conta.getSaldo());
            }



        }


    }
}