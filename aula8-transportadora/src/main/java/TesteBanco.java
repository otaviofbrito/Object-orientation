import org.example.t4banco.Conta;

import java.util.Scanner;

public class TesteBanco
{
    public static void main(String[] args){

        System.out.println("Criando uma conta com saldo de 1000");
        Scanner scan = new Scanner(System.in);
        Conta contaBanco = new Conta(1000);

        System.out.println("sacar:");
        double saque = scan.nextDouble();
        contaBanco.sacar(saque);
        System.out.println("saque de :"+ saque + " " + contaBanco.getSaldo());

        System.out.println("depositar:");
        double deposito = scan.nextDouble();
        contaBanco.depositar(deposito);
        System.out.println("deposito de:"+ saque + " " + contaBanco.getSaldo());

        System.out.println("sacar:");
        saque = scan.nextDouble();
        contaBanco.sacar(saque);
        System.out.println("saque de:"+ saque + " " + contaBanco.getSaldo());

        scan.close();
    }
}
