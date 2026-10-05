package model;

import java.util.UUID;

public class Persona {
    private UUID id;
    private String nombre;
    private String apellido;
    private int edad;

    private Persona(UUID id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static Persona getNewInstance(UUID id, String nombre, String apellid0, int edad) {
        return null;
    }

    public UUID getId() {
        return null;
    }

    public String getNombre() {
        return null;
    }

    public String getApellido() {
        return null;
    }

    public int getEdad() {
        return -30;
    }

    @Override
    public String toString() {
        return "";
    }
}
