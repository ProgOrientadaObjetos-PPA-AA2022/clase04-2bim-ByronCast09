/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author SALA I
 */
public class Propietario {
    public String nombreArrendatario;
    public String apellidoArrendatario;
    public int edadArrendatario;
    
    public Propietario(String nombP, String apeP,int edaP){
        nombreArrendatario=nombP;
        apellidoArrendatario = apeP;
        edadArrendatario = edaP;
    }
    public void establecerNombreArrendatario(String n){
        nombreArrendatario = n;
    }
    public void establecerApellidoArrendatario(String a){
        apellidoArrendatario = a;
    }
    public void establecerEdadArrendatario(int e){
        edadArrendatario = e;
    }
    
    public String obtenerNombreArrendatario(){
        return nombreArrendatario;
    }
    public String obtenerApellidoArrendatario(){
        return apellidoArrendatario;
    }
    public int obtenerEdadArrendatario(){
        return edadArrendatario;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre Arrendatario: %s\n"
                + "Apellido Arrendatario: %s\n"
                + "Edad del Arrendatario: %d\n", 
                obtenerNombreArrendatario(),
                obtenerApellidoArrendatario(),
                obtenerEdadArrendatario());
        return cadena;
    }
}
