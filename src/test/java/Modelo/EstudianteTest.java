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

public class EstudianteTest {

    @Test
    public void testEstudiante() {
        Estudiante e = new Estudiante("Ana", "Cali", "555", "2001-02-02");

        e.setCodigoEstudiante("E001");
        e.setGrado("10");
        e.setAcudiente("Carlos");

        assertEquals("E001", e.getCodigoEstudiante());
        assertEquals("10", e.getGrado());
        assertEquals("Carlos", e.getAcudiente());
    }
}