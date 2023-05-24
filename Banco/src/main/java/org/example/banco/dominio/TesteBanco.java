package org.example.banco.dominio;

import org.example.banco.dominio.Banco;
import org.example.banco.relatorios.RelatorioClientes;

public class TesteBanco {

    public static void main(String[] args) {

        /** Exercício: Recupere abaixo o objeto singleton Banco em vez de atribuir null à variável banco **/
        Banco banco = Banco.getInstance();
        Cliente cliente;
        RelatorioClientes relatorio = new RelatorioClientes();

        // Cria vários clientes e suas respectivas contas
        System.out.println("Criando uma conta corrente para o cliente Bruno Henrique.");
        Cliente brunoHenrique = new Cliente("Bruno", "Henrique");
        banco.addCliente(brunoHenrique);
        cliente = banco.getCliente(0);
        cliente.addConta(new ContaPoupanca(50000.00, 0.03));
        cliente.addConta(new ContaCorrente(220000.00, 40000.00));

        // Criação do cliente Everton Ribeiro e sua respectiva
        // conta corrente com saldo inicial e cheque especial
        System.out.println("Criando uma conta corrente para o cliente Everton Ribeiro");
        Cliente evertonRibeiro = new Cliente("Everton", "Ribeiro");
        Conta contaER = new ContaCorrente(45000, 30000.00);
        evertonRibeiro.addConta(contaER);
        banco.addCliente(evertonRibeiro);

        // Criação do cliente Filipe Luis e sua respectiva
        // conta corrente com saldo inicial, sem cheque especial
        System.out.println("Criando uma conta corrente para o cliente Filipe Luis.");
        Cliente filipeLuis = new Cliente("Filipe", "Luis");
        Conta contaFilipeLuis = new ContaCorrente(70000);
        filipeLuis.addConta(contaFilipeLuis);
        banco.addCliente(filipeLuis);

        System.out.println("Criando uma conta corrente para o cliente Gabriel Barbosa.");
        Cliente gabrielBarbosa = new Cliente("Gabriel", "Barbosa");
        banco.addCliente(gabrielBarbosa);
        cliente = banco.getCliente(2);
        cliente.addConta(new ContaPoupanca(220000.00, 0.03));

        // Criação do cliente Diego Alves e sua respectiva conta com saldo inicial
        System.out.println("Criando uma conta corrente para o cliente Diego Alves.");
        Cliente diegoAlves = new Cliente("Diego", "Alves");
        Conta contaDA = new ContaCorrente(50000);
        diegoAlves.addConta(contaDA);
        banco.addCliente(diegoAlves);

        // Criação da cliente Lorena Lara com conta conjunta com Diego Alves
        System.out.println("Diego Alves autorizou o cadastro de sua conta corrente como sendo conjunta com a cliente Lorena Lara.");
        Cliente lorenaLara = new Cliente("Lorena", "Lara");
        lorenaLara.addConta(contaDA);
        banco.addCliente(lorenaLara);

        // gerar o relatorio
        relatorio.geraRelatorio();





    }
}