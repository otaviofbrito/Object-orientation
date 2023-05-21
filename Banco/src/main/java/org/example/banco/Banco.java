package org.example.banco;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Banco(){
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public Cliente getCliente(int index){
        return clientes.get(index);
    }

    public int getNumeroDeClientes(){
        return clientes.size();
    }



}
