package org.ficha2902082.maven.parking.sergiojeisson;
//Importar dependencias
import org.ficha2902082.maven.parking.sergiojeisson.entities.Car;
import org.ficha2902082.maven.parking.sergiojeisson.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.sergiojeisson.entities.Customer;
import org.ficha2902082.maven.parking.sergiojeisson.entities.TipoDocumento;;

public class Main {
    public static void main(String[] args) {

        Car carrito1 = new Car();
        carrito1.placa = "ASB 345";
        carrito1.tipoVehiculo = TipoVehiculo.CAMIONETA;

        Car carrito2 = new Car();
        carrito2.placa = "JHG 652";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;

        Customer cliente1 = new Customer();
        cliente1.nombre = "Sergio";
        cliente1.apellidos = "Bautista";
        cliente1.tipoDocumento = TipoDocumento.TI;
        cliente1.documento = 1033044582L;
        cliente1.celular = 3142865425L;

        //METODO
        //Añadir carros al cliente
        //Invocar, llamar, ejecutar el metodo declarado

        cliente1.addCar(carrito1);
        cliente1.addCar(carrito2);
        cliente1.addCar("ASB 345", TipoVehiculo.TAXI);

        System.out.println("Cliente:"+ cliente1.nombre +" "+ cliente1.apellidos);
        System.out.println("Documento:" + cliente1.documento + "\ntipoDocumento:" + cliente1.tipoDocumento + "\nCelular:" + cliente1.celular);
        for(Car c: cliente1.misCarros){
            System.out.println("-------------------------------------");
            System.out.println("Placa:" + c.placa);
            System.out.println("Tipo:" + c.tipoVehiculo);
        }
    
    }
} 