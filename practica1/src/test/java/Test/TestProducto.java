package Test;
import model.ExceptionProducto;
import model.Producto;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class TestProducto {
    @Test
    public void testPersona_TodosLosAtributos_creacionCorrecta() {
        UUID id = UUID.randomUUID();
        //id nombre precio y stock
        Producto miProducto= Producto.getNewInstance(id,"telefono",500,100);

        assertEquals(id,miProducto.getId());
        assertEquals("telefono",miProducto.getNombre());
        assertEquals(500,miProducto.getPrecio());
        assertEquals(100,miProducto.getStock());
    }
    @Test
    public void testProducto_UUIDnulo_creacionIncorrecta() {
        assertThrows(ExceptionProducto.class, () -> {Producto miProducto=Producto.getNewInstance(null,"Telefono",500,100);});
    }
    @Test
    public void testProducto_nombreInvalido_creacionIncorrecta() {
        assertThrows(ExceptionProducto.class, () -> {Producto miProducto=Producto.getNewInstance(UUID.randomUUID(),"",500,100);});
    }
    @Test
    public void testProducto_precioInvalido_creacionIncorrecta() {
        assertThrows(ExceptionProducto.class, () -> {Producto miProducto=Producto.getNewInstance(UUID.randomUUID(),"telefono",0,100);});
    }
    @Test
    public void testProducto_stockInvalido_creacionIncorrecta() {
        assertThrows(ExceptionProducto.class, () -> {Producto miProducto=Producto.getNewInstance(UUID.randomUUID(),"telefono",500,-1);});
    }

    @Test
    public void testProducto_tostringNombre_formatoCorrecto() {
        UUID id = UUID.randomUUID();
        Producto miProducto=Producto.getNewInstance(id,"telefono",500,100);
        Producto miProducto1 =Producto.getNewInstance(id,"Heladera",1000,50);
        //formato del toString telefono precio y stock
        assertEquals("telefono 500 100",miProducto.toString());
        assertEquals("heladera 1000 50", miProducto1.toString());
    }
}
