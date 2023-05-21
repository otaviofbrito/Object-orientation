package org.example.banco;

public class Banco {
    private Cliente [] clientes;
    private int numeroDeClientes;


    public Banco(){
       clientes = new Cliente[5];
    }

    public void addCliente(Cliente cliente){
        this.clientes[numeroDeClientes] = cliente;
        numeroDeClientes++;
    }

    public Cliente getCliente(int index){
        return this.clientes[index];
    }

    public int getNumeroDeClientes(){
        return this.numeroDeClientes;
    }



}
