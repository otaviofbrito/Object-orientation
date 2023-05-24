package org.example.banco.dominio;

public class ContaPoupanca extends Conta {
    private double taxaDeRendimento;

    public ContaPoupanca(double saldoInicial, double taxaDeRendimento){
        super(saldoInicial);
        this.taxaDeRendimento = taxaDeRendimento;
    }

}
