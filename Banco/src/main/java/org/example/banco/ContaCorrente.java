package org.example.banco;

public class ContaCorrente extends Conta {
    private ContaPoupanca protecaoContaPoupanca;

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    public ContaCorrente(double saldoInicial, ContaPoupanca protecaoContaPoupanca) {
        super(saldoInicial);
        this.protecaoContaPoupanca = protecaoContaPoupanca;
    }

    public ContaPoupanca getContaPoupanca() {
        return protecaoContaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.protecaoContaPoupanca = contaPoupanca;
    }

    @Override
    public boolean sacar(double valor) {
        if (this.protecaoContaPoupanca == null) {
            super.sacar(valor);
        } else {
            if (this.saldo + protecaoContaPoupanca.saldo >= valor) {
                saldo = saldo - valor;
                if (saldo < 0) {
                    protecaoContaPoupanca.saldo += saldo;
                    saldo = 0;
                }
                return true;
            }
        }
        return false;
    }
}
