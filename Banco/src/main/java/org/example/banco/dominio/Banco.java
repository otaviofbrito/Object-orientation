package org.example.banco.dominio;

import java.util.ArrayList;

public class Banco {

    private static final Banco INSTANCE = new Banco();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    private Banco(){}

    public static Banco getInstance(){
        return INSTANCE;
    }

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
