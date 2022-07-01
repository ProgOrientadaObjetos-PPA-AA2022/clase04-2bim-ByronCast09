/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete03.AutomovilGasolina;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        AutomovilGasolina autoG = new AutomovilGasolina();
        autoG.establecerNombresPropietario("Byron Castillo");
        autoG.establecerPlaca("LGFD65H");
        autoG.establecerCostoGalon(3.0);
        autoG.establecerNumGalonesMaximos(20.00);
        autoG.establecerIva(0.1);
        autoG.obtenerCostoGalon();
        autoG.obtenerNumGalonesMaximos();
        autoG.obtenerTotalCancela();
        System.out.print(autoG);
    }
}
