/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author JuanA
 */
public class Colegio {

    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Estudiante> estudiantes;

    public Colegio(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public ArrayList<Profesor> getProfesores() { return profesores; }
    public ArrayList<Estudiante> getEstudiantes() { return estudiantes; }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }
    public String reporteEstudiantes() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== REPORTE DE ESTUDIANTES ===\n");
        if (estudiantes.isEmpty()) {
            sb.append("No hay estudiantes registrados.\n");
        } else {
            for (int i = 0; i < estudiantes.size(); i++) {
                sb.append((i + 1)).append(". ").append(estudiantes.get(i).toString()).append("\n");
            }
            sb.append("Total: ").append(estudiantes.size()).append("\n");
        }
        return sb.toString();
    }

    
    public String reporteProfesores() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== REPORTE DE PROFESORES (mayor a menor salario) ===\n");
        if (profesores.isEmpty()) {
            sb.append("No hay profesores registrados.\n");
            return sb.toString();
        }

        
        ArrayList<Profesor> lista = new ArrayList<>(profesores);
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j).calcularPagoMensual() < lista.get(j + 1).calcularPagoMensual()) {
                    Profesor tmp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, tmp);
                }
            }
        }

        double totalPrestaciones = 0;
        for (int i = 0; i < lista.size(); i++) {
            sb.append((i + 1)).append(". ").append(lista.get(i).toString()).append("\n");
            totalPrestaciones += lista.get(i).calcularPrestaciones();
        }
        sb.append("Total prestaciones: $").append(String.format("%.0f", totalPrestaciones)).append("\n");
        return sb.toString();
    }
}