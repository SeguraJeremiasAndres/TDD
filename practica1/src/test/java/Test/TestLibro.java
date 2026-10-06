package Test;
import model.ExceptionLibro;
import model.Libro;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
public class TestLibro {
    @Test
    public void testLibro_todosLosArgumentos_creacionValida() {
        //id titulo autor cantPaginas
        UUID id = UUID.randomUUID();
        Libro miLibro = Libro.getNewInstance(id, "Clean Code", "Robert C. Martin", 644);
        assertEquals(id, miLibro.getId());
        assertEquals("Clean Code", miLibro.getTitulo());
        assertEquals("Robert C. Martin", miLibro.getAutor());
        assertEquals(644, miLibro.getPaginas());
    }

    @Test
    public void testLibro_idNULL_creacionInvalida() {
        assertThrows(ExceptionLibro.class, () -> {
            Libro miLibro = Libro.getNewInstance(null, "Clean Code", "Robert C. Martin", 644);
        });
    }

    @Test
    public void testLibro_tituloInvalido_creacionInvalida() {
        assertThrows(ExceptionLibro.class, () -> {
            Libro miLibro = Libro.getNewInstance(UUID.randomUUID(), "", "Robert C. Martin", 644);
        });
    }

    @Test
    public void testLibro_autorInvalido_creacionInvalida() {
        assertThrows(ExceptionLibro.class, () -> {
            Libro miLibro = Libro.getNewInstance(UUID.randomUUID(), "Clean Code", "", 644);
        });
    }

    @Test
    public void testLibro_paginasInvalidas_creacionInvalida() {
        assertThrows(ExceptionLibro.class, () -> {
            Libro miLibro = Libro.getNewInstance(UUID.randomUUID(), "Clean Code", "Robert C. Martin", 0);
        });
    }
    @Test
    public void testLibro_tostringNombre_formatoCorrecto() {
        UUID id = UUID.randomUUID();
        Libro miLibro=Libro.getNewInstance(id,"Clean code","Robert C. Martin",644);
        Libro miLibro2=Libro.getNewInstance(id,"Clean Architecture","Robert C. Martin",432);
        //formato del toString titulo y cant paginas
        assertEquals("Clean Code 644",miLibro.toString());
        assertEquals("Clean Architecture 432",miLibro2.toString());
    }
}

