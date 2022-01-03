/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.Curso;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Shrike
 */
public class PlanEstudio {
    private static ArrayList<Curso> datos = new ArrayList<>();

    public static void agregar(Curso obj){
        datos.add(obj);
    }
    
    public static ArrayList<Curso> obtener(){
        return datos;
    }
    
    public static Curso buscarCurso(String codigo){
        Iterator<Curso> elemento;
        
        elemento = datos.iterator();
        while(elemento.hasNext()){
            Curso c = elemento.next();
            
            if(c.getCodigo().equalsIgnoreCase(codigo)){
                return c;
            }
        }
        
        return null;
    }
    
    public static ArrayList<Curso> cursosPorCiclo(int ciclo){
        ArrayList<Curso> aux = new ArrayList<>();
        Iterator<Curso> elemento;
        
        elemento = datos.iterator();
        while(elemento.hasNext()){
            Curso c = elemento.next();
            
            if(c.getCiclo() == ciclo){
                aux.add(c);
            }
        }
        
        return aux;
    }
}
