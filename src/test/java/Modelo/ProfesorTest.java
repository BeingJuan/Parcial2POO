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
public class ProfesorTest {

    @Test
    public void testCalculos() {
        Profesor p = new Profesor("Luis", "Cali", "111", "1990-01-01",
                "123", "Matemáticas", 10, 100);

        assertTrue(p.calcularPagoMensual() > 0);
        assertTrue(p.calcularPrestaciones() > 0);
    }
}