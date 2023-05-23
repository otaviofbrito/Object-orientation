package org.example.banco;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(double saldoInicial){
        super(saldoInicial);
    }
    public ContaCorrente(double saldoInicial, double chequeEspecial){
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double valor){
        if(this.saldo + chequeEspecial >= valor){
            saldo = saldo - valor;
            return true;
        }else return false;
    }
}
