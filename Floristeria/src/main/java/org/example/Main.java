package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente(1L,"jorge","salazar",30,1.78f,"01/03-1997","M","123456","desconocida","10");

        Flor florUno = new Flor();
        Flor florDos = new Flor(1D,50,"rosa","alta calidad","1000000","rojo","se cultivo en el cesde", LocalDate.now(),"una semana","rico");

        Proveedor proveedorUno = new Proveedor();
        Proveedor proveedorDos = new Proveedor(1L,"lucho",10,5,"celulares",LocalDate.now(),2,"123456","itm","10");

        Repartidor repartidorUno = new Repartidor();
        Repartidor repartidorDos = new Repartidor(1L,"juanjo","villa",21,1.79F,LocalDate.now(),"Masculino","123456","desconocida","rico");

        System.out.println("---------------------------------------------------------");

        System.out.println("--- Llenar clienete uno ------------------------");
        System.out.print("Ingrese ID: ");
        clienteUno.setId(scanner.nextLong());
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese nombre: ");
        clienteUno.setNombre(scanner.nextLine());

        System.out.print("Ingrese apellido: ");
        clienteUno.setApellido(scanner.nextLine());

        System.out.print("Ingrese edad: ");
        clienteUno.setEdad(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese estatura: ");
        clienteUno.setEstatura(scanner.nextFloat());
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese fecha de nacimiento (formato: yyyy-MM-dd): ");
        clienteUno.setFechaNacimiento(scanner.nextLine());

        System.out.print("Ingrese género: ");
        clienteUno.setGenero(scanner.nextLine());

        System.out.print("Ingrese teléfono: ");
        clienteUno.setTel(scanner.nextLine());

        System.out.print("Ingrese dirección: ");
        clienteUno.setDireccion(scanner.nextLine());

        System.out.print("Ingrese estrato: ");
        clienteUno.setEstrato(scanner.nextLine());

        // Mostrar los datos ingresados (opcional)
        System.out.println("Cliente ingresado: " + clienteUno);

        System.out.println("---------------------------------------------------------");
        System.out.println(clienteDos);

        System.out.println("---------------------------------------------------------");

        System.out.println(florUno);
        System.out.println(florDos);
        System.out.println("---------------------------------------------------------");

        System.out.println(proveedorUno);
        System.out.println(proveedorDos);
        System.out.println("---------------------------------------------------------");

        System.out.println(repartidorUno);
        System.out.println(repartidorDos);
        System.out.println("---------------------------------------------------------");
    }
}

