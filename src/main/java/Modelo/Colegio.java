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
