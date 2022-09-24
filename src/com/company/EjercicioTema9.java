package com.company;

public class EjercicioTema9 {
    public static void main(String[] args) {

        Cliente objCliente = new Cliente();
        Trabajador objTrabajador = new Trabajador();

        objCliente.credito = 200.60;
        objCliente.nombre = "Steve";
        objCliente.edad = 18;
        objCliente.telefono = 123456789;

        System.out.println("CLIENTE");
        System.out.println("Edad: " + objCliente.edad);
        System.out.println("Nombre: " + objCliente.nombre);
        System.out.println("Telefono: " + objCliente.telefono);
        System.out.println("Credito: " + objCliente.credito);

        System.out.println("----------------");

        objTrabajador.salario = 570.90;
        objTrabajador.nombre = "Jorge";
        objTrabajador.edad = 32;
        objTrabajador.telefono = 987654321;

        System.out.println("TRABAJADOR");
        System.out.println("Edad: " + objTrabajador.edad);
        System.out.println("Nombre: " + objTrabajador.nombre);
        System.out.println("Telefono: " + objTrabajador.telefono);
        System.out.println("Salario: " + objTrabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona { // la clase Cliente es clase hija de Persona
    double credito;
}

class Trabajador extends Persona { // la clase Trabajador es clase hija de Persona
    double salario;
}

