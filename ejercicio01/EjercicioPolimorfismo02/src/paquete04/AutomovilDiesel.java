/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {
    protected double numeroLitrosMaximosTanque;
    protected double costoCadaLitro;
    protected double descuentoLitros;
    protected double totalCancelaD;

    public AutomovilDiesel(double numeroLitrosMaximosTanque, double costoCadaLitro, double descuentoLitros, String nomP,String pla) {
        super(nomP,pla);
        this.numeroLitrosMaximosTanque = numeroLitrosMaximosTanque;
        this.costoCadaLitro = costoCadaLitro;
        this.descuentoLitros = descuentoLitros;
    }
    
    public void establecerNumeroLitrosMaximosTanque(double e){
        numeroLitrosMaximosTanque = e;
    }
    public void establecerCostoCadaLitro(double e){
        costoCadaLitro = e;
    }
    public void establecerDescuentoLitros(double e){
        descuentoLitros = e;
    }
    @Override
    public void calcularValorCancelar(){
        totalCancelaD = (costoCadaLitro *(numeroLitrosMaximosTanque *descuentoLitros ));
    }
    //----------------------------------
    public double obtenerNumeroLitrosMaximosTanque() {
        return numeroLitrosMaximosTanque;
    }
    public double obtenerCostoCadaLitro() {
        return costoCadaLitro;
    }
    public double obtenerDescuentoLitros() {
        return descuentoLitros;
    }
    public double obtenertotalCancelar() {
        return totalCancelaD;
    }
    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s"
                + "Numero de Litros Maximos del Tanque: %.2f\n"
                + "Costo de cada Litro: %.2f\n"
                + "Descuento de Litros: %.2f\n"
                +"Total a Cancelar: %.2f\n",
                cadenaFinal,
                numeroLitrosMaximosTanque,
                costoCadaLitro,
                descuentoLitros,
                totalCancelaD);
        return cadenaFinal;
    }
}
