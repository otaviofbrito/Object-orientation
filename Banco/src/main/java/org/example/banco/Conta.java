package org.example.banco;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }
    }

}
