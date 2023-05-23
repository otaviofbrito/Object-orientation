package org.example.banco;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<>();


    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public Cliente getCliente(int index){
        return clientes.get(index);
    }

    public ArrayList<Cliente> getCliente(String nome, String sobrenome){
        ArrayList<Cliente> arr = new ArrayList<>();
        for(Cliente cliente:clientes){
            if(cliente.getNome().equals(nome) && cliente.getSobrenome().equals(sobrenome)){
                arr.add(cliente);
            }
        }
        return arr;
    }

    public int getNumeroDeClientes(){
        return clientes.size();
    }



}
