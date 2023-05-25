package org.example3;

import org.example3.*;

public class TesteAnimal {
    public static void main(String[] args) {


        Peixe p = new Peixe("Nemo");
        Gato g = new Gato("Tom");
        Animal a = new Peixe("Peixoto");
        Animal ar = new Aranha("ARACNILDA");
        AnimalDeEstimacao g2 = new Gato("Rogerio");



        p.brincar();
        p.caminhar();
        p.comer();

        g.brincar();
        g.caminhar();
        g.comer();


        a.caminhar();
        a.comer();

        ar.comer();
        ar.caminhar();

        g2.brincar();

        Peixe p2 = (Peixe)a;
        p2.brincar();
    }
}
