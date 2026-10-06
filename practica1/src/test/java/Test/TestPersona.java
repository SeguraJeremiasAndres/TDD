package Test;

import model.ExceptionPersona;
import model.Persona;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class TestPersona {
    @Test
    public void testPersona_TodosLosAtributos_creacionCorrecta() {
        UUID id = UUID.randomUUID();
        Persona miPersona=Persona.getNewInstance(id,"jeremias","segura",20);

        assertEquals(id,miPersona.getId());
        assertEquals("jeremias",miPersona.getNombre());
        assertEquals("segura",miPersona.getApellido());
        assertEquals(20,miPersona.getEdad());
    }
    @Test
    public void testPersona_UUIDnulo_creacionIncorrecta() {
        assertThrows(ExceptionPersona.class, () -> {Persona miPersona=Persona.getNewInstance(null,"","segura",20);});
    }
    @Test
    public void testPersona_nombreNoValido_creacionIncorrecta() {
        UUID id = UUID.randomUUID();
        assertThrows(ExceptionPersona.class, () -> {Persona miPersona=Persona.getNewInstance(id,"","segura",20);});
    }
    @Test
    public void testPersona_edadNegativa_creacionIncorrecta() {
        UUID id = UUID.randomUUID();
        assertThrows(ExceptionPersona.class, () -> {Persona miPersona=Persona.getNewInstance(id,"Jeremias","segura",-1);});
    }
    @Test
    public void testPersona_edadMenorAlaValida_creacionIncorrecta() {
        UUID id = UUID.randomUUID();
        assertThrows(ExceptionPersona.class, () -> {Persona miPersona=Persona.getNewInstance(id,"Jeremias","segura",0);});
    }
    @Test
    public void testPersona_apellidoNoValido_creacionIncorrecta() {
        UUID id = UUID.randomUUID();
        assertThrows(ExceptionPersona.class, () -> {Persona miPersona=Persona.getNewInstance(id,"Jeremias",null,20);});
    }
    @Test
    public void testPersona_tostringNombre_formatoCorrecto() {
        UUID id = UUID.randomUUID();
        Persona miPersona=Persona.getNewInstance(id,"jeremias","segura",20);
        Persona miPersona2=Persona.getNewInstance(id,"carlos","perez",30);
        //formato del toString primeras 2 letras en mayusculas ultimas 2 del apelllido y la edad
        assertEquals("JEra20",miPersona.toString());
        assertEquals("CAez30",miPersona2.toString());
    }

}
