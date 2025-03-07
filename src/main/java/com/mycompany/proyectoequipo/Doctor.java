package com.mycompany.proyectoequipo;

public class Doctor extends Persona {
    private String especialidad;
    private int experiencia;

    public Doctor(String nombre, int edad, String especialidad, int experiencia) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad + ", Años de experiencia: " + experiencia);
    }
}
