package org.example.banco.dominio;

public class Conta {
    protected double saldo;  //protected acessivel para subclasses

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo+=valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return  false;
    }

}
