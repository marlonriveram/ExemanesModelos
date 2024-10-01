package org.example;


import org.example.modelos.*;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Accidente accidenteUno = new Accidente();

        System.out.println(" ------ se llena el contrucctor vacio ---------------");


        // Llenar los atributos del objeto utilizando Scanner
        System.out.print("Ingrese ID del accidente: ");
        accidenteUno.setId(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese tipo de accidente: ");
        accidenteUno.setTipoAccidente(scanner.nextLine());

        System.out.print("Ingrese fecha del accidente (yyyy-mm-dd): ");
        accidenteUno.setFechaAccidente(LocalDate.parse(scanner.nextLine()));

        System.out.print("Ingrese ubicación: ");
        accidenteUno.setUbicacion(scanner.nextLine());

        System.out.print("Numero heridos: ");
        accidenteUno.setNumeroHeridos(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Numero fallecidos: ");
        accidenteUno.setNumeroFallecidos(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Estado civil: ");
        accidenteUno.setEstadoVital(scanner.nextLine());


        System.out.print("Hay testigos ( true o false ): ");
        accidenteUno.setHayTestigos(scanner.nextBoolean());


        System.out.print("Ingrese descriopcion: ");
        accidenteUno.setDescripcion(scanner.nextLine());

        System.out.print("Reportado por : ");
        accidenteUno.setReportadoPor(scanner.nextLine());

        // Mostrar los datos ingresados
        System.out.println("Accidente ingresado: " + accidenteUno);


        System.out.println("-----------------------------------------------------------------------------");
        Accidente accidenteDos = new Accidente(1,"vehecular", LocalDate.of(1985,8,01),"medellin",2,0,"casi muerto",false,"manajado en  bajo sustancias alusinogenas","El Bryan");

        System.out.println(accidenteUno);
        System.out.println(accidenteDos);

        System.out.println("------------------------------------------------------------------------------");
        Vehiculo vehiculoUno = new Vehiculo();
        Vehiculo vehiculoDos = new Vehiculo(1L,"mmr54","2024","mazda","1800cc","rojo",false,"cuero","diesel","camioneta","150km/h",false,true,LocalDate.of(2023,4,6),"marlon");

        System.out.println(vehiculoUno);
        System.out.println(vehiculoDos);
        System.out.println("------------------------------------------------------------------------------");

        Asegurado aseguradoUno = new Asegurado();
        Asegurado aseguradoDos = new Asegurado(1L,"marlon","rivera","M",27,"campo valdes",LocalDate.of(1997,5,8),"sura",1000000,false,"sura",1000000,"marlon",LocalDate.of(2024,1,10),"fredfy");

        System.out.println(aseguradoUno);
        System.out.println(aseguradoUno);

        System.out.println("------------------------------------------------------------------------------");
        Aseguradora aseguradoraUno = new Aseguradora();
        Aseguradora aseguradoraDos = new Aseguradora(1L,"seguros sura","la 33","12345678","sura@mail.com","www.sura.com","3",100,"copacabana","5 estrellas");

        System.out.println(aseguradoraUno);
        System.out.println(aseguradoraDos);

        System.out.println("------------------------------------------------------------------------------");

        Beneficiario beneficiarioUno = new Beneficiario();
        System.out.println(" ------------------llenar contructor vacio beneficiario ---------------------------------");

        // Llenar los atributos
        System.out.print("Ingrese ID: ");
        beneficiarioUno.setId(scanner.nextLong());
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese nombre del beneficiario: ");
        beneficiarioUno.setNombreBeneficario(scanner.nextLine());

        System.out.print("Ingrese apellido del beneficiario: ");
        beneficiarioUno.setApellidoBeneficiaro(scanner.nextLine());

        System.out.print("Ingrese teléfono: ");
        beneficiarioUno.setTelefono(scanner.nextLine());

        System.out.print("Ingrese email: ");
        beneficiarioUno.setEmail(scanner.nextLine());

        System.out.print("Ingrese estado civil: ");
        beneficiarioUno.setEstadoCivil(scanner.nextLine());

        System.out.print("Ingrese nacionalidad: ");
        beneficiarioUno.setNacionalidad(scanner.nextLine());

        System.out.print("Ingrese estrato: ");
        beneficiarioUno.setEstrato(scanner.nextLine());

        System.out.print("Ingrese ocupación: ");
        beneficiarioUno.setOcupacion(scanner.nextLine());

        System.out.print("Ingrese ingreso anual: ");
        beneficiarioUno.setIngresoAnual(scanner.nextLine());

        // Mostrar los datos ingresados (opcional)
        System.out.println("Beneficiario ingresado: " + beneficiarioUno);

        Beneficiario beneficiarioDos = new Beneficiario(2L,"Juan jose","gallego","1234568","juanjo@mail.com","casado","Colombiano","5","profesor","10000000");

        System.out.println(beneficiarioUno);
        System.out.println(beneficiarioDos);
        System.out.println("------------------------------------------------------------------------------");



    }
}