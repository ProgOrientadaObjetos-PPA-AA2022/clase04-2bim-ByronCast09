/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    protected  String nombrePropietario;
    protected String placa;
    protected double valorCancelar;
    
    
    public void establecerNombresPropietario(String e){
        nombrePropietario = e;
    }
    public void establecerPlaca(String e){
        placa = e;
    }
   
    public abstract void calcularValorCancelar();
    //-------------------------------------------------------
    public String obtenerNombrePropietario(){
        return nombrePropietario;  
    }
    public String obtenerPlaca(){
        return placa;  
    }
    public double obtenerValorCancelar(){
        return valorCancelar;  
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombres del Propietario: %s\n"
                + "Placas: %s\n"
                + "Valor a Cancelar: %.2f\n",
                nombrePropietario,
                placa,
                valorCancelar);
        return cadena;
    }
}

