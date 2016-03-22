/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijuegosolimpicoss2;
import java.util.*;
/**
 *
 * @author USER
 */
public class Grupo2 {
    private String nombreDeporte;
    private int numIntegrantes;
    private ArrayList <Integrante2> integrantes;

    public Grupo2(String nombreDeporte, int numIntegrantes, ArrayList<Integrante2> integrantes) {
        this.nombreDeporte = nombreDeporte;
        this.numIntegrantes = numIntegrantes;
        this.integrantes = integrantes;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public int getNumIntegrantes() {
        return numIntegrantes;
    }

    public ArrayList<Integrante2> getIntegrantes() {
        return integrantes;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public void setNumIntegrantes(int numIntegrantes) {
        this.numIntegrantes = numIntegrantes;
    }

    public void setIntegrantes(ArrayList<Integrante2> integrantes) {
        this.integrantes = integrantes;
    }
    public void imprimir(){
        System.out.println("Deporte:" + nombreDeporte + "\n");
        System.out.println("Los integrantes participantes son: ");
        int numeroIntegrante = 1;
        for(Integrante2 integrante : integrantes){
            System.out.print("Integrante " + numeroIntegrante + ":\n");
            integrante.NombreCompleto();
            numeroIntegrante++;
        }
    }   
}

