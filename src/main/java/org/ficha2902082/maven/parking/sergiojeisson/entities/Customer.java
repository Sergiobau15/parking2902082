package org.ficha2902082.maven.parking.sergiojeisson.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    
    public String nombre;
    public TipoDocumento tipoDocumento;
    public String apellidos;
    public Long documento;
    public Long celular;
    public List<Car> misCarros;


    //constructor
    public Customer(String nombre, TipoDocumento tipoDocumento, String apellidos, Long documento, Long celular) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.apellidos = apellidos;
        this.documento = documento;
        this.celular = celular;
        this.misCarros = new ArrayList<Car>();
    }

    

    //Metodo 1: añadir carro al cliente
    /*
    Definir metodo(firma del metodo - Signature):
     * Modificador de acceso
     * Tipo de dato de retorno
     * Nombre del metodo
     * Parametros(Inputs): Tipo de dato del parametro, Nombre del parametro
    */

    public void addCar(Car c){
        this.misCarros.add(c);
    }

    //Sobrecarga de metodos:
    //en una clase se permiten metodos con el mismo nombre
    //pero con difenrente firma

    //sobrecarga del metodo
    public void addCar(String placa, TipoVehiculo tipoVehiculo){
        //instanciar(construir)
        Car c = new Car();
        c.placa = placa;
        c.tipoVehiculo = tipoVehiculo;
        this.misCarros.add(c);
    }


}
