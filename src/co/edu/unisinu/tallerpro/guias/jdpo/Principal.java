/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unisinu.tallerpro.guias.jdpo;

import co.edu.unisinu.tallerpro.guias.jdpo.ventanas.EjercicioABPLogin;
import co.edu.unisinu.tallerpro.guias.jdpo.ventanas.Usuario;
import co.edu.unisinu.tallerpro.guias.jdpo.ventanas.ventanaABP;
import java.util.ArrayList;
import java.util.List;


public class Principal {
    public static void main(String[] args) {
        EjercicioABPLogin miVentana = new EjercicioABPLogin();
        miVentana.setLocationRelativeTo(null);
        miVentana.setVisible(true);
    }
    public static List<Usuario>usuarios= new ArrayList();
}