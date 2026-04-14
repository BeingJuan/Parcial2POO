/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author JuanA
 */
public class PersonaTest {

    @Test
    public void testConstructorYGetters() {
        Persona p = new Persona("Juan", "Cali", "123", "2000-01-01");

        assertEquals("Juan", p.getNombre());
        assertEquals("Cali", p.getDireccion());
        assertEquals("123", p.getTelefono());
        assertEquals("2000-01-01", p.getFechaNacimiento());
    }
}
