package org.ficha2902082.maven.parking.sergiojeisson.entities;

public class Car {

    /*Sintaxis de atributos (camel case)
     * Modificador de acceso
     * Tipo de dato del atributo
     * Nombre del atributo
    */
    public String placa;
    public TipoVehiculo tipoVehiculo;

    public Car() {
    }

    public Car(String placa, 
            TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }
}
