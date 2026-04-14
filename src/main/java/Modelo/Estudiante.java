/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JuanA
 */
public class Estudiante extends Persona {
    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento) {
    super(nombre, direccion, telefono, fechaNacimiento);
}

    private String codigoEstudiante;
    private String grado;
    private String acudiente;



    public String getCodigoEstudiante() { return codigoEstudiante; }
    public void setCodigoEstudiante(String codigoEstudiante) { this.codigoEstudiante = codigoEstudiante; }

    public String getGrado() { return grado; }
    public void setGrado(String grado) { this.grado = grado; }

    public String getAcudiente() { return acudiente; }
    public void setAcudiente(String acudiente) { this.acudiente = acudiente; }

    
    @Override
    public String toString() {
        return getNombre() + " | Código: " + codigoEstudiante + " | Grado: " + grado;
    }

        public String toString(boolean detalle) {
        if (detalle) {
            return "Nombre: " + getNombre() + "\nCódigo: " + codigoEstudiante +
                   "\nGrado: " + grado + "\nAcudiente: " + acudiente;
        }
        return toString();
    }
}