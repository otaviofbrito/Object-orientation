package org.example.t4banco;

public class Conta {
    private double saldo;


    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public void sacar(double amount){
        if(this.saldo >= amount){
            this.saldo = this.saldo - amount;
        }

    }
}
