package org.example.banco;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String sobrenome;
    private ArrayList<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Conta getContas(int index) {
        return contas.get(index);
    }
    public int getNumeroContas(){
        return contas.size();
    }
    public void addConta(Conta conta) {
        contas.add(conta);
    }
}
