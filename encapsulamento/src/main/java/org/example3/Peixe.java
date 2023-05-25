package org.example3;

import org.example3.Animal;
import org.example3.AnimalDeEstimacao;

public class Peixe extends Animal implements AnimalDeEstimacao {
    public Peixe(String nome){
        super(nome, 0);
    }
    public void brincar(){
        System.out.println(this.getNome() + "Mergulhou");
    }

    public void caminhar(){
        System.out.println(this.getNome() + "Nadou");
    }

    public void comer(){
        System.out.println(this.getNome() + nome + "Comeu");
    }
}
