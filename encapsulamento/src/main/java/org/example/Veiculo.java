package org.example;

public class Veiculo {
    private double carga;
    private double cargaMax;


    public Veiculo(double cargaMax){
        this.cargaMax = kgTonewt(cargaMax);
    }

    public double getCarga(){
        return this.newtToKg(carga);
    }

    public double getCargaMax(){
        return this.newtToKg(cargaMax);
    }

    public boolean addCarga(double peso){
        if(carga + kgTonewt(peso) <= cargaMax){
            carga = carga + kgTonewt(peso);
            return true;
        }else return false;
    }

    private double newtToKg(double peso){
        return peso/9.8;
    }

    private double kgTonewt(double peso){
        return peso*9.8;
    }

}
