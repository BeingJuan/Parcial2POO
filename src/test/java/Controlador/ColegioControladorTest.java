/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author JuanA
 */
public class ColegioControladorTest {

    @Test
    public void testAgregarProfesor() {
        Colegio c = new Colegio("Test");
        ColegioControlador ctrl = new ColegioControlador(c);

        ctrl.agregarProfesor("Luis","dir","tel","fecha",
                "123","Mat",10,10);

        assertEquals(1, c.getProfesores().size());
    }

    @Test
    public void testAgregarEstudiante() {
        Colegio c = new Colegio("Test");
        ColegioControlador ctrl = new ColegioControlador(c);

        ctrl.agregarEstudiante("Ana","dir","tel","fecha",
                "E1","10","Carlos");

        assertEquals(1, c.getEstudiantes().size());
    }
}