/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete3.Propietario;

/**
 *
 * @author reroes
 */
public abstract class Arriendo {
    
    protected Propietario arrendatario;
    protected double arriendoMensual;
    protected double cuotaBase;
    
    /*public Arriendo(String nombre, double cuotaB){
        // nombreArrendatario = nombre;
        establecerNombreArrendatario(nombre);
        cuotaBase = cuotaB;
    }
    */
    public Arriendo(Propietario arre,double arrieM,double cuotB){
        arrendatario = arre;
        arriendoMensual = arrieM;
        cuotaBase = cuotB;
    }
    public void establecerArrendatario(Propietario arren){
        arrendatario = arren;
    }
    
    public void establecerCuotaBase(double x){
        cuotaBase = x;
    }
    
    public abstract void establecerArriendoMensual();
    
    public Propietario obtenerArrendatario(){
        return arrendatario;
    }
    
    public double obtenerCuotaBase(){
        return cuotaBase;
    }
    
    public double obtenerArriendoMensual(){
        return arriendoMensual;
    }
    
    
}
