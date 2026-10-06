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

    public static Persona getNewInstance(UUID id, String nombre, String apellido, int edad) {
        if(id==null) {
            throw new  ExceptionPersona("ID no valido");
        }
        if(nombre==null||nombre.isBlank()) {
            throw new  ExceptionPersona("Nombre no valido");
        }
        if(apellido==null||apellido.isBlank()) {
            throw  new  ExceptionPersona("Apellido no valido");
        }
        if(edad<1) {
            throw new  ExceptionPersona("Edad no valida");
        }
        return new Persona(id,nombre,apellido,edad);
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    //formato del toString primeras 2 letras en mayusculas ultimas 2 del apelllido y la edad
    @Override
    public String toString() {
        String aux=nombre.toUpperCase().substring(0,2);
        String aux2=apellido.toLowerCase().substring(apellido.length()-2,apellido.length());
        return aux+aux2+edad;
    }
}
