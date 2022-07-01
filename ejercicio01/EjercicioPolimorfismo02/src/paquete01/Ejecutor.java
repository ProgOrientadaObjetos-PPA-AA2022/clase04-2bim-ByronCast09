/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        AutomovilGasolina autoG = new AutomovilGasolina(20.00,3.0,0.10,"Byron Castillo","JSHD4544");
        
        autoG.obtenerCostoGalon();
        autoG.obtenerPlaca();
        autoG.obtenerNumGalonesMaximos();
        autoG.obtenerTotalCancela();
        autoG.calcularValorCancelar();
        System.out.print(autoG);
        
        AutomovilDiesel autoD = new AutomovilDiesel(20.00,2.00,10.00,"Kevin Saraguro","L54F45");
        
        autoD.calcularValorCancelar();
        System.out.println("");
        System.out.print(autoD);
    }
}
