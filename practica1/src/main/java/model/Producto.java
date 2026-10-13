package model;

import java.util.UUID;

public class Producto {
    private UUID id;
    private String nombre;
    private int precio;
    private int stock;

    private Producto(UUID id, String nombre, int precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public static Producto getNewInstance(UUID id, String nombre, int precio, int stock) {
        if(id==null){
            throw new ExceptionProducto("No se puede crear un producto con id nula");
        }
        if(nombre==null||nombre.isBlank()){
            throw new ExceptionProducto("el nombre no es valido");

        }
        if(precio<1){
            throw  new ExceptionProducto("Precio no valido");
        }
        if (stock<0){
            throw  new ExceptionProducto("stock no valido");
        }
        return new  Producto(id, nombre, precio, stock);
    }

    public String getNombre() {
        return nombre;
    }

    public UUID getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return nombre.toLowerCase()+" "+precio+" "+stock;
    }
}
