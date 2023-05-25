package org.example3;

public abstract class Animal {
    protected String nome;
    protected int numeroDePernas;

    protected Animal(String nome, int numeroDePernas){
        this.nome = nome;
        this.numeroDePernas = numeroDePernas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDePernas() {
        return numeroDePernas;
    }

    public void setNumeroDePernas(int numeroDePernas) {
        this.numeroDePernas = numeroDePernas;
    }

    public void caminhar(){
        System.out.println(this.nome + "Caminhou com " + this.numeroDePernas + " pernas");
    }

    public abstract void comer();
}
