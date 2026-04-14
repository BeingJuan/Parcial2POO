/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
/**
 *
 * @author JuanA
 */
public class ColegioControlador{

    private Colegio colegio;

    public ColegioControlador(Colegio colegio) {
        this.colegio = colegio;
    }

    public void agregarProfesor(String nombre, String dir, String tel, String fecha,
                                String cedula, String area, double salHora, int horas) {
        Profesor p = new Profesor(nombre, dir, tel, fecha, cedula, area, salHora, horas);
        colegio.agregarProfesor(p);
    }

    public void agregarEstudiante(String nombre, String dir, String tel, String fecha,
                                  String codigo, String grado, String acudiente) {
        Estudiante e = new Estudiante(nombre, dir, tel, fecha);
        e.setCodigoEstudiante(codigo);
        e.setGrado(grado);
        e.setAcudiente(acudiente);
        colegio.agregarEstudiante(e);
    }

    public String getReporteEstudiantes() {
        return colegio.reporteEstudiantes();
    }

    public String getReporteProfesores() {
        return colegio.reporteProfesores();
    }

    public Colegio getColegio() {
        return colegio;
    }
}
