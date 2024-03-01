package org.ficha2902082.maven.parking.sergiojeisson;

import org.ficha2902082.maven.parking.sergiojeisson.entities.Car;
import org.ficha2902082.maven.parking.sergiojeisson.entities.Cupo;
import org.ficha2902082.maven.parking.sergiojeisson.entities.Customer;
import org.ficha2902082.maven.parking.sergiojeisson.entities.Empleado;
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

        //Instancia de empleado
        Empleado empleado1 = new Empleado("Miguel", 1L);
        Empleado empleado2 = new Empleado("Sergio", 2L);
        Empleado empleado3 = new Empleado("Messi", 3L);

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
            cupito1,
            empleado1
        );

        LocalDate fi1 = LocalDate.of(2023 ,Month.APRIL ,24);
        LocalTime hi1 = LocalTime.of(11, 32, 40);    
        LocalDate ff1 = LocalDate.of(2024 ,Month.AUGUST,10);
        LocalTime hf1 = LocalTime.of(10, 42, 52);
        
        Double valorR2 = 3000.00;

        Registro registro2 = new Registro(
            fi1,  
            hi1,  
            ff1,
            hf1,   
            valorR2,     
            cliente1.misCarros.get(0),
            cupito2,
            empleado2
        );
        
        LocalDate fi2 = LocalDate.of(2025 ,Month.JULY ,13);
        LocalTime hi2 = LocalTime.of(15, 45, 40);    
        LocalDate ff2 = LocalDate.of(2025 ,Month.OCTOBER,10);
        LocalTime hf2 = LocalTime.of(22, 13, 45);
        
        Double valorR3 = 8000.00;

        Registro registro3 = new Registro(
            fi2,  
            hi2,  
            ff2,
            hf2,   
            valorR3,     
            cliente1.misCarros.get(0),
            cupito1,
            empleado3
        );

        LocalDate fi3 = LocalDate.of(2022 ,Month.SEPTEMBER ,30);
        LocalTime hi3 = LocalTime.of(14, 25, 40);    
        LocalDate ff3 = LocalDate.of(2022 ,Month.DECEMBER,10);
        LocalTime hf3 = LocalTime.of(12, 15, 22);
        
        Double valorR4 = 8000.00;

        Registro registro4 = new Registro(
            fi3,  
            hi3,  
            ff3,
            hf3,   
            valorR4,     
            cliente1.misCarros.get(0),
            cupito1,
            empleado3
        );

        LocalDate fi4 = LocalDate.of(2023 ,Month.JULY ,12);
        LocalTime hi4 = LocalTime.of(14, 25, 40);    
        LocalDate ff4 = LocalDate.of(2023 ,Month.NOVEMBER,22);
        LocalTime hf4 = LocalTime.of(15, 24, 32);
        
        Double valorR5 = 26000.00;

        Registro registro5 = new Registro(
            fi4,  
            hi4,  
            ff4,
            hf4,   
            valorR5,     
            cliente1.misCarros.get(0),
            cupito2,
            empleado2
        );

            
        //vincular los registros a la lista de registros
        misRegistros.add(registro1);
        misRegistros.add(registro2);
        misRegistros.add(registro3);
        misRegistros.add(registro4);
        misRegistros.add(registro5);


        //recorrer la lista de registros
        for(Registro r : misRegistros){
            System.out.println("Placa: " + r.car.placa + 
                                " | " + "Cupo: " + r.cupo.letra + 
                                " | " + "Valor: " + r.valor + 
                                " | " + "Fecha Inicio: " + r.fechaInicio.toString() +
                                " | " + "Fecha Fin: " + r.fechaFin.toString() +
                                " | " + "Empleado: "+ r.empleado.codigo +
                                " | ");
        }
    
    }
} 