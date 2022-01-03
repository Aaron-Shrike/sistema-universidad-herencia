/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.CursoDocente;
import java.util.ArrayList;

/**
 *
 * @author Shrike
 */
public class AsignacionCursos {
    private static ArrayList<CursoDocente> datos = new ArrayList<>();

    public static void agregar(CursoDocente obj){
        datos.add(obj);
    }
    
    public static ArrayList<CursoDocente> obtener(){
        return datos;
    }
}
