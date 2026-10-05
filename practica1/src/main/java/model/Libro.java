package model;

import java.util.UUID;

public class Libro {
    private UUID id;
    private String titulo;
    private String autor;
    private int paginas;

    private Libro(UUID id, String titulo, String autor, int paginas) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public static Libro getNewInstance(UUID id, String titulo, String autor, int paginas) {
        return null;
    }

    public UUID getId() {
        return null;
    }

    public String getTitulo() {
        return null;
    }

    public String getAutor() {
        return null;
    }

    public int getPaginas() {
        return -123;
    }

    @Override
    public String toString() {
        return null;
    }
}
