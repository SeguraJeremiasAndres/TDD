package model;

import java.util.UUID;

public class Producto {
    private UUID id;
    private String nombre;
    private int precio;
    private int Stock;

    private Producto(UUID id, String nombre, int precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        Stock = stock;
    }

    public static Producto getNewInstance(UUID id, String nombre, int precio, int stock) {
        return null;
    }

    public String getNombre() {
        return null;
    }

    public UUID getId() {
        return null;
    }

    public int getPrecio() {
        return -222;
    }

    public int getStock() {
        return -123;
    }

    @Override
    public String toString() {
        return null;
    }
}
