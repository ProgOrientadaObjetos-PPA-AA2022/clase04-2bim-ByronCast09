/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {
    protected double numGalonesMaximos;
    protected double costoGalon;
    protected double iva;
    protected double totalCancelaG;

    public AutomovilGasolina(double numGalonesMaximos, double costoGalon, double iva, String nomP,String pla) {
        super(nomP,pla);
        this.numGalonesMaximos = numGalonesMaximos;
        this.costoGalon = costoGalon;
        this.iva = iva;
    }
    
    
    public void establecerNumGalonesMaximos(double e){
        numGalonesMaximos = e;
    }
    public void establecerCostoGalon(double e){
        costoGalon = e;
    }
    public void establecerIva(double e){
        iva = e;
    }
    public void establecerTotalCancela(double e){
        totalCancelaG = e;
    }
    
    @Override
    public void calcularValorCancelar(){
        totalCancelaG = (costoGalon * numGalonesMaximos)+(0.10)*(costoGalon * numGalonesMaximos);
    }
    //----------------------------------------
    public double obtenerNumGalonesMaximos() {
        return numGalonesMaximos;
    }
    public double obtenerCostoGalon() {
        return costoGalon;
    }
    public double obtenerIva() {
        return iva;
    }
    public double obtenerTotalCancela() {
        return totalCancelaG;
    }
    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s"
                + "Numero de Galones Maximos: %.2f\n"
                + "Costo del Galon: %.2f\n"
                + "Iva: %.2f\n"
                +"Total a Cancelar: %.2f\n",
                cadenaFinal,
                numGalonesMaximos,
                costoGalon,
                iva,
                totalCancelaG);
        return cadenaFinal;
    }
}
