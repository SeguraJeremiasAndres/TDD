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
        if(id==null){
            throw new ExceptionLibro("el id no puede ser nulo");
        }
        if(titulo==null||titulo.isBlank()){
            throw new ExceptionLibro("el titulo no es valido");
        }
        if(autor==null||autor.isBlank()){
            throw new ExceptionLibro("el autor no es valido");
        }
        if(paginas<=0){
            throw new ExceptionLibro("el paginas no valida");
        }
        return new Libro(id, titulo, autor, paginas);
    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return titulo.toLowerCase()+" "+paginas;
    }
}
