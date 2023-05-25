package org.example3;

public class Aranha extends Animal {
    public Aranha(String nome){
        super(nome,8);
    }

    @Override
    public void comer(){
        System.out.println(this.nome + "Comeu");
    }
}
