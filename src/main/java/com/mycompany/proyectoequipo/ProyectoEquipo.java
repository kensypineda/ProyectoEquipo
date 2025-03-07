package com.mycompany.proyectoequipo;

public class ProyectoEquipo {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Marcos", 40);
        Doctor doctor = new Doctor("Barbara", 35, "Cardiología", 10);
        Deportista deportista = new Deportista("Pedro", 25, "Fútbol");

        persona.mostrarInformacion();
        doctor.mostrarInformacion();
        deportista.mostrarInformacion();
    }
}