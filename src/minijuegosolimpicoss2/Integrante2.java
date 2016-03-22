/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijuegosolimpicoss2;
import java.util.*;
/**
 *
 * @author Diego Herrera
 */
public class Integrante2 {
    private String nombre;
    private String apellido;

    public Integrante2(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
     public void NombreCompleto(){
        System.out.print("Nombre: " + nombre+"\t");
        System.out.print("Apellido: " + apellido + "\n");
    }
    
 
}
