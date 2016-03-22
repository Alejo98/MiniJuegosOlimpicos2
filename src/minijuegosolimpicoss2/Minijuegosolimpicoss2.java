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
public class Minijuegosolimpicoss2 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner lectura=new java.util.Scanner(System.in);
        
        int numDelegaciones=0;
        do{
            System.out.println("Ingrese el numero de delegaciones que quiere inscribir "
                    + "tenga en cuenta que el limite es de 10 delegaciones");
            numDelegaciones=lectura.nextInt();
            }while((numDelegaciones>10)||(numDelegaciones<0));
        int medallas[]=new int [numDelegaciones];
        HashMap<String,Delegacion2> delegacion= new HashMap<String, Delegacion2>();
        for(int i=0; i<numDelegaciones;i++){
            System.out.println("DILIGENCIE LA INSCRIPCION PARA LA DELEGACION");
            System.out.println("Pais: ");
            String pais=lectura.next();
            System.out.println("ingrese el Numero de Medallas de Oro ");
            int medallasOro=lectura.nextInt();
            System.out.println("ingrese el Numero de Medallas de Plata ");
            int medallasPlata=lectura.nextInt();
            System.out.println("ingrese el Numero de Medallas de Bronce");
            int medallasBronce=lectura.nextInt();
            medallas[i]=medallasOro+medallasBronce+medallasPlata;
            System.out.println("ingrese el Numero de Deportes que va a participar la Delegacion");
            int numDeportes=lectura.nextInt();
               HashMap<String,Grupo2> grupos=new HashMap<String,Grupo2>();
            for (int j=0; j<numDeportes;j++){
                System.out.println("Ingrese el Deporte al que se inscribe el grupo  "+(j+1));
                String nombreDeporte=lectura.next();
                System.out.println("Numero de integrantes del deporte");
                int numIntegrantes=lectura.nextInt();
                 ArrayList<Integrante2> integrantes=new ArrayList<Integrante2>();
                for(int k=0; k<numIntegrantes;k++){
                    System.out.println("Ingrese el nombre del integrante "+(k+1)+":");
                    String nombre=lectura.next();
                    System.out.println("Ingrese el apellido del integrante "+(k+1) +":");
                    String apellido=lectura.next();     
                    integrantes.add(new Integrante2(nombre,apellido));
                }                  
             grupos.put(nombreDeporte,new Grupo2(nombreDeporte,numIntegrantes,integrantes));
            } 
            delegacion.put(pais,new Delegacion2(pais,medallasOro,medallasPlata,medallasBronce,grupos));
            
        }
        System.out.println("\t Paises que van a participar en los minijuegos");
        for(Delegacion2 s : delegacion.values()){
               System.out.println(s.getPais());
                
            }
         System.out.println("Desea buscar las delegaciones que participan en un deporte en especifico "
                 + "escriba el nombre del deporte");
         String nombreDeporte=lectura.next();
         
         for(Delegacion2 s : delegacion.values()){
                           if(s.getGrupo(nombreDeporte) != null){
                           s.getGrupo(nombreDeporte).imprimir();
                            }
                           else if(s.getGrupo(nombreDeporte) == null){
                               System.out.println("Ninguna delegacion juega este deporte ");
                           }   
                    }
         System.out.println("Desea Saber Que Delegacion Tiene Mas Medallas");
         //2 Colombia 1 1 1 1 a 1 Diego Herrera Venezuela 1 1 1 1 a 2 Juan varela Andres Parra
         System.out.print("Digite 1 si desea saberlo");
             int Saber=lectura.nextInt();
             if(Saber==1){
                       int mayor;
                       
                       mayor=medallas[0];
                       int contador=1;
                       for (int j=1;j<numDelegaciones;j++){
                        if (mayor<medallas[j]){
                             mayor=medallas[j]; 
                             contador=j+1;
                            }
                        }
                       System.out.println("La delegacion con mas medallas es la numero: "+contador);
                        for(Delegacion2 s : delegacion.values()){
                            System.out.println(s.getPais());
                
                        }
                       
         
             
             }
    
        
     
       
        
    }
    
}
