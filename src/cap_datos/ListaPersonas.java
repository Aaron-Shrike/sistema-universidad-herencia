/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.Alumno;
import cap_logica.Docente;
import cap_logica.Persona;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Shrike
 */
public class ListaPersonas {
    private static ArrayList<Persona> datos = new ArrayList<>();

    public static void agregar(Persona obj){
        datos.add(obj);
    }
    
    public static ArrayList<Persona> obtener(){
        return datos;
    }
    
    public static Persona buscarDocente(String nombre){
        Iterator<Persona> elemento;
        
        elemento = datos.iterator();
        while(elemento.hasNext()){
            Persona p = elemento.next();
            
            if(p instanceof Docente && p.getNombre().equalsIgnoreCase(nombre)){
                return p;
            }
        }
        
        return null;
    }
    
    public static ArrayList<Alumno> obtenerAlumnos(){
        ArrayList<Alumno> aux = new ArrayList<>();
        Iterator<Persona> elemento;
        
        elemento = datos.iterator();
        while(elemento.hasNext()){
            Persona p = elemento.next();
            
            if(p instanceof Alumno){
                aux.add((Alumno) p);
            }
        }
        
        return aux;
    }
    
    public static int[] cantidadDocentes(){
        int[] contador = new int[3];
        Iterator<Persona> elemento;
        
        elemento = datos.iterator();
        while(elemento.hasNext()){
            Persona p = elemento.next();
            
            if(p instanceof Docente){
                if(((Docente) p).getGrado().equalsIgnoreCase("bachiller")){
                    contador[0]++;
                }
                if(((Docente) p).getGrado().equalsIgnoreCase("magister")){
                    contador[1]++;
                }
                if(((Docente) p).getGrado().equalsIgnoreCase("doctor")){
                    contador[2]++;
                }
            }
        }
        
        return contador;
    }
    
    
}
