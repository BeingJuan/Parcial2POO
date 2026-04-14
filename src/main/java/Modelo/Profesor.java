/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JuanA
 */
public class Profesor extends Persona {

    private String cedula;
    private String area;
    private double salarioPorHora;
    private int horasMes;

    
    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento,
                    String cedula, String area, double salarioPorHora, int horasMes) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioPorHora = salarioPorHora;
        this.horasMes = horasMes;
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public double getSalarioPorHora() { return salarioPorHora; }
    public void setSalarioPorHora(double salarioPorHora) { this.salarioPorHora = salarioPorHora; }

    public int getHorasMes() { return horasMes; }
    public void setHorasMes(int horasMes) { this.horasMes = horasMes; }
    
    public double calcularPagoMensual() {
        return salarioPorHora * horasMes * 1.30;
    }

    
    public double calcularPrestaciones() {
        return calcularPagoMensual() * 0.19;
    }
    @Override
    public String toString() {
        return getNombre() + " | " + area + " | Pago: $" +
               String.format("%.0f", calcularPagoMensual()) +
               " | Prestaciones: $" + String.format("%.0f", calcularPrestaciones());
    }
    public String toString(boolean detalle) {
        if (detalle) {
            return "Nombre: " + getNombre() + "\nCédula: " + cedula +
                   "\nÁrea: " + area +
                   "\nSalario/hora: $" + salarioPorHora +
                   "\nHoras mes: " + horasMes +
                   "\nPago mensual: $" + String.format("%.0f", calcularPagoMensual()) +
                   "\nPrestaciones: $" + String.format("%.0f", calcularPrestaciones());
        }
        return toString();
    }
}
