/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author JuanA
 */
public class ColegioTest {

    @Test
    public void testAgregar() {
        Colegio c = new Colegio("San Jose");

        Profesor p = new Profesor("Luis", "Cali", "111", "1990-01-01",
                "123", "Matemáticas", 10, 100);

        Estudiante e = new Estudiante("Ana", "Cali", "222", "2001-01-01");

        c.agregarProfesor(p);
        c.agregarEstudiante(e);

        assertEquals(1, c.getProfesores().size());
        assertEquals(1, c.getEstudiantes().size());
    }
}