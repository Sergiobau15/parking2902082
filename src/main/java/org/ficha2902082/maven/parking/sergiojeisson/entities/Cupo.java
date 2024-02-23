package org.ficha2902082.maven.parking.sergiojeisson.entities;

public class Cupo {

    public char letra;
    public double largo;
    public double ancho;

    //constructor por defect
    public Cupo() {
    }

    //constructor con parametros
    public Cupo(char letra, 
                double largo, 
                double ancho) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
    }

    
    

}
