package org.example;

public class TestePonto {
    public static void main(String[] args){

        Ponto primeiroPonto = new Ponto();
        Ponto segundoPonto = new Ponto(400,230);
        primeiroPonto.setX(200);
        primeiroPonto.setY(200);

        System.out.println("primeiro (" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");
        System.out.println("segundo (" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");

        Ponto outraRefSegPonto = segundoPonto;
        outraRefSegPonto.setX(111);
        outraRefSegPonto.setY(222);

        System.out.println("primeiro (" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");
        System.out.println("segundo (" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");

    }

}
