/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Vista.*;

/**
 *
 * @author JuanA
 */
import Controlador.ColegioControlador;
import Modelo.Colegio;

public class Main {
    public static void main(String[] args) {

        Colegio colegio = new Colegio("Colegio San José");
        ColegioControlador controller = new ColegioControlador(colegio);

        new VentanaPrincipal(controller).setVisible(true);
    }
}