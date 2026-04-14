/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestIntegracion;
import Modelo.*;
import Controlador.ColegioControlador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author JuanA
 */
public class Integracion {
public class IntegracionTest {

    @Test
    public void testFlujoCompleto() {

        Colegio colegio = new Colegio("San Jose");
        ColegioControlador ctrl = new ColegioControlador(colegio);

        ctrl.agregarProfesor("Luis","dir","tel","fecha",
                "123","Mat",10,100);

        ctrl.agregarEstudiante("Ana","dir","tel","fecha",
                "E1","10","Carlos");

        assertEquals(1, colegio.getProfesores().size());
        assertEquals(1, colegio.getEstudiantes().size());

        String repProf = ctrl.getReporteProfesores();
        String repEst = ctrl.getReporteEstudiantes();

        assertTrue(repProf.contains("Luis"));
        assertTrue(repEst.contains("Ana"));
        }
      }
}
