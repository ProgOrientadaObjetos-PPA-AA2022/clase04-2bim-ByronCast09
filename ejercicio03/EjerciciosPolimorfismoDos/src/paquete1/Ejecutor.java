/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;
import java.util.ArrayList;
import paquete2.Arriendo;
import paquete3.Propietario;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        Propietario prop1 = new Propietario("Christian","Shepherd",18);
        
        ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                prop1, 300.0,96.25);
        arriendoComida.establecerIva(10); // en porcentaje
        arriendoComida.establecerValorAgua(20.2); // en $
        arriendoComida.establecerValorLuz(40.2); // en $
        
        Propietario prop2 = new Propietario("Christian","Shepherd",18);
        ArriendoLocalComida arriendoComida2 = new ArriendoLocalComida(
                prop2, 300.32, 0.20);
        
        
        Propietario prop3 = new Propietario("Andrew","Schroeder",18);
        ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                prop3, 430.0,56.35);
        arriendoComercial.establecerValorAdicionalFijo(100); // en $
        
        Propietario prop4 = new Propietario("Angela","Watson",18);
        ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                prop4,3640,29.1);
        arriendoSesiones.establecerValorSillas(10); // en $
        arriendoSesiones.establecerValorAmplificacion(20); // en $
        
        listaArriendos.add(arriendoComida);
        listaArriendos.add(arriendoComercial);
        listaArriendos.add(arriendoSesiones);
        listaArriendos.add(arriendoComida2);
        
        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual(); // se llama al 
                                                            // métodos abstracto
            System.out.println(listaArriendos.get(i));
            System.out.println();
        }
        
        
    }
}
