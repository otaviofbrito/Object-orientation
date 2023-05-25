package org.example;

public class TesteVeiculo {

    public static void main(String[] args){

        Veiculo caminhao = new Veiculo(10000);
        System.out.println("Criando veiculo com carga" + caminhao.getCargaMax());
        System.out.println("add 1 500kg" + caminhao.addCarga(500));
        System.out.println("add 1 250kg" + caminhao.addCarga(250));
        System.out.println("add 1 5000kg" + caminhao.addCarga(5000));
        System.out.println("add 1 4000kg" + caminhao.addCarga(4000));
        System.out.println("add 1 300kg" + caminhao.addCarga(300));
        System.out.println("carga total =" + caminhao.getCarga());
    }
}
