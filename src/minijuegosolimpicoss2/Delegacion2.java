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
public class Delegacion2 {
    private String pais;
    private int numMedallasOro;
    private int numMedallasPlata;
    private int numMedallasBronce;
    private HashMap<String,Grupo2> grupos;

    public Delegacion2(String pais, int numMedallasOro, int numMedallasPlata, int numMedallasBronce,    HashMap<String,Grupo2> grupos) {
        this.pais = pais;
        this.numMedallasOro = numMedallasOro;
        this.numMedallasPlata = numMedallasPlata;
        this.numMedallasBronce = numMedallasBronce;
        this.grupos = grupos;
    }

    public String getPais() {
        return pais;
    }

    public int getNumMedallasOro() {
        return numMedallasOro;
    }

    public int getNumMedallasPlata() {
        return numMedallasPlata;
    }

    public int getNumMedallasBronce() {
        return numMedallasBronce;
    }
    public    HashMap<String,Grupo2> getGrupos() {
        return grupos;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setNumMedallasOro(int numMedallasOro) {
        this.numMedallasOro = numMedallasOro;
    }

    public void setNumMedallasPlata(int numMedallasPlata) {
        this.numMedallasPlata = numMedallasPlata;
    }

    public void setNumMedallasBronce(int numMedallasBronce) {
        this.numMedallasBronce = numMedallasBronce;
    }

    public void setGrupos(HashMap<String, Grupo2> grupos) {
        this.grupos = grupos;
    }
    public int getTotalMedallas(){
        int a = this.numMedallasOro;
        int b = this.numMedallasPlata;
        int c = this.numMedallasBronce;
        return a+b+c;
    }
    public Grupo2 getGrupo(String nombreDeporte){
        if (nombreDeporte==null){
        System.out.println("Las delegaciones participantes son "+ pais);
        }
        return grupos.get(nombreDeporte);
    }
    
    
  

 
            
            
            
}
