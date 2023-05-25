package org.example3;

public class Gato extends Animal implements AnimalDeEstimacao {

    public Gato(String nome){
        super(nome,4);
    }
    public Gato(){
        this(null);
    }

    @Override
    public void brincar(){
        System.out.println(this.nome + "Meow");
    }

    @Override
    public void comer(){
        System.out.println(this.nome + "Comeu racao");
    }
}
