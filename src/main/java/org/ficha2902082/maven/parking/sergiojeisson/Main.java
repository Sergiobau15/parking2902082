package org.ficha2902082.maven.parking.sergiojeisson;

import org.ficha2902082.maven.parking.sergiojeisson.entities.Car;
import org.ficha2902082.maven.parking.sergiojeisson.entities.Cupo;
import org.ficha2902082.maven.parking.sergiojeisson.entities.Customer;
import org.ficha2902082.maven.parking.sergiojeisson.entities.TipoDocumento;
import org.ficha2902082.maven.parking.sergiojeisson.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.sergiojeisson.entities.Registro;

import java.util.List;
import java.util.ArrayList;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        
        //Crear dos cupos
        //instanciar dos cupos

        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra = 'A';

        Cupo cupito2 = new Cupo('B', 5, 2.5);


        //instanciar dos carros
        Car carrito1 = new Car();
        carrito1.placa = "JKD451";
        carrito1.tipoVehiculo = TipoVehiculo.TAXI;

        Car carrito2 = new Car("MBD543", TipoVehiculo.BUS);


        //Instanciar cliente
        Customer cliente1 = new Customer("Sergio", TipoDocumento.TI, "Bautista", 103309425L, 3143656025L);

        //Vincular carros al cliente
        cliente1.addCar(carrito1);
        cliente1.addCar(carrito2);
        cliente1.addCar("ASD 542", TipoVehiculo.CAMIONETA);

        //Decalara una lista de registros
        List<Registro> misRegistros = new ArrayList<>();

        //Instanciar dos registros Entrada/Salida

        Registro registro1 = new Registro(
            LocalDate.of(2024, Month.FEBRUARY, 22), 
            LocalTime.of(15, 30, 44), 
            LocalDate.of(2024, Month.JULY, 9), 
            LocalTime.of(20, 45, 12), 
            5000.00, 
            cliente1.misCarros.get(0),
            cupito1
        );

        Registro registro2 = new Registro(
            LocalDate.of(2024, Month.APRIL, 12), 
            LocalTime.of(10, 25, 32), 
            LocalDate.of(2024, Month.AUGUST, 9), 
            LocalTime.of(12, 38, 13), 
            3000.00, 
            cliente1.misCarros.get(0),
            cupito2
            );
            
        //vincular los registros a la lista de registros
        misRegistros.add(registro1);

        //recorrer la lista de registros
        for(Registro r : misRegistros){
            System.out.println("Placa: " + r.car.placa + 
                                " | " + "Cupo: " + r.cupo.letra + 
                                " | " + "Valor: " + r.valor + 
                                " | " + "Fecha Inicio: " + r.fechaInicio.toString() +
                                " | ");
        }
    
    }
} 