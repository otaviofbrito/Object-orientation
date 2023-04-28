package org.example.t1;

public class Veiculo {

    private double carga;
    private double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga(){
        return this.carga;
    }

    public double getCargaMaxima(){
        return this.cargaMaxima;
    }

    public boolean adicionarCaixa(double peso){
        if(this.carga + peso <= this.cargaMaxima){
            this.carga = this.carga + peso;
            return true;
        }else{
            return false;
        }
    }
}
