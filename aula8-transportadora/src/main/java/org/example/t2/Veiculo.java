package org.example.t2;

public class Veiculo {

    private double carga;
    private double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = quilosParaNewtons(cargaMaxima);
    }

    public double getCarga(){
        return newtonsParaKilos(this.carga);
    }

    public double getCargaMaxima(){
        return newtonsParaKilos(this.cargaMaxima);
    }

    public boolean adicionarCaixa(double peso){
        if(this.carga + quilosParaNewtons(peso) <= this.cargaMaxima){
            this.carga = this.carga + quilosParaNewtons(peso);
            return true;
        }else{
            return false;
        }
    }

    private double newtonsParaKilos(double peso){
        return peso/9.8;
    }

    private double quilosParaNewtons(double peso){
        return peso*9.8;
    }
}
