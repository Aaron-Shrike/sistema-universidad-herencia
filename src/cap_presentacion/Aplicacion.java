/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import LibMenu.Menu;
import LibMenu.Opcion;
import basicas.Consola;
import cap_datos.AsignacionCursos;
import cap_datos.ListaPersonas;
import cap_datos.PlanEstudio;
import cap_logica.Alumno;
import cap_logica.Curso;
import cap_logica.CursoDocente;
import cap_logica.Docente;
import cap_logica.Persona;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Shrike
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu  objMenu = new Menu();
        Consola objConsola = new Consola();
        
        Iterator it;
        
        int opc;
        
        definirmenu(objMenu);  
        
        do{
            opc = objMenu.display();
            
            switch(opc){
                case 11:
                        Docente objD = new Docente();
                        
                        objD.setNombre(objConsola.leer("Ingrese nombre : "));
                        objD.setEdad(objConsola.leer("Ingrese edad[18-70] : ", 18, 70));
                        objD.setGrado(objConsola.leer("Ingrese grado(Bachiller|Magister|Doctor) : "));
                        objD.setTiempoDocente(objConsola.leer("Ingrese tiempo de docente[1-20](Años) : ", 1, 20));
                        
                        ListaPersonas.agregar(objD);
                        
                        System.out.println("\n* Docente registrado");
                    break;
                
                case 12:
                        Alumno objA = new Alumno();
                        
                        objA.setNombre(objConsola.leer("Ingrese nombre : "));
                        objA.setEdad(objConsola.leer("Ingrese edad[18-70] : ", 18, 70));
                        objA.setColeProcedencia(objConsola.leer("Colegio de procedencia : "));
                        objA.setAñoFinalizacion(objConsola.leer("Año de finalizacion[1900-2019] : ", 1900, 2019));
                        
                        ListaPersonas.agregar(objA);
                        
                        System.out.println("\n* Alumno registrado");
                    break;
                    
                case 13:
                        Curso objC = new Curso();
                        
                        objC.setCodigo(objConsola.leer("Ingrese codigo : "));
                        objC.setNombre(objConsola.leer("Ingrese nombre : "));
                        objC.setCreditos(objConsola.leer("Numero de creditos[1-5] : ", 1, 5));
                        objC.setCiclo(objConsola.leer("Ingrese ciclo[1-10] : ", 1, 10));
                        
                        PlanEstudio.agregar(objC);
                        
                        System.out.println("\n* Curso registrado");
                    break;
                    
                case 14:
                        Curso auxC;
                        String auxCodigo;
                        
                        auxCodigo = objConsola.leer("Ingrese codigo del curso a buscar : ");
                        auxC = PlanEstudio.buscarCurso(auxCodigo);
                        
                        if(auxC != null){
                            System.out.println(auxC.presentarDetalle());
                        }else{
                            System.out.println("Curso con el codigo " + auxCodigo + ". No encontrado");
                        }
                    break;
                    
                
                case 21:
                        Docente auxD;
                        Curso auxC1;
                        String auxNombre;
                        String auxCodigo1;
                        String semestre;
                        
                        auxNombre = objConsola.leer("Ingrese nombre del docente a buscar : ");
                        auxD = (Docente)ListaPersonas.buscarDocente(auxNombre);
                        
                        if(auxD != null){
                            auxCodigo1 = objConsola.leer("Ingrese codigo del curso a buscar : ");
                            auxC1 = PlanEstudio.buscarCurso(auxCodigo1);
                            
                            if(auxC1 != null){
                                semestre = objConsola.leer("Ingrese semestre : ");
                                
                                CursoDocente objCD = new CursoDocente(auxNombre, auxCodigo1, semestre);
                                
                                AsignacionCursos.agregar(objCD);
                                
                                System.out.println("\n* Curso asignado");
                            }else{
                                System.out.println("Curso con el codigo " + auxCodigo1 + ". No encontrado");
                            }
                        }else{
                            System.out.println("Docente " + auxNombre + ". No encontrado");
                        }
                    break;
                    
                    
                case 31:
                        ArrayList<Persona> auxListP = ListaPersonas.obtener();
                        Iterator<Persona> elementoP;
                        
                        System.out.println("REPORTE GENERAL DE PERSONAS");
                        System.out.println("--------------------------------------------");
                        
                        elementoP = auxListP.iterator();
                        while(elementoP.hasNext()){
                            Persona p = elementoP.next();
                            
                            System.out.println(p.presentarLinea());
                        }
                    break;
                    
                case 32:
                        ArrayList<Alumno> auxListA = ListaPersonas.obtenerAlumnos();
                        Iterator<Alumno> elementoA;
                        
                        System.out.println("LISTA DE ALUMNOS");
                        System.out.println("Nombre\tEdad\tColegio de procedencia\tAño de finalizacion");
                        System.out.println("---------------------------------------------------------------");
                        
                        elementoA = auxListA.iterator();
                        while(elementoA.hasNext()){
                            Alumno a = elementoA.next();
                            
                            System.out.println(a.presentarLinea());
                        } 
                    break;
                    
                case 33:
                        int[] cantDocentes = ListaPersonas.cantidadDocentes();
                        
                        System.out.println("CANTIDAD DE DOCENTES POR GRADO");
                        System.out.println("------------------------------");
                        System.out.println("Bachilleres : " + cantDocentes[0]);
                        System.out.println("Magisters    : " + cantDocentes[1]);
                        System.out.println("Doctores    : " + cantDocentes[2]);
                    break;
                    
                
                case 41:
                        ArrayList<Curso> auxListC = PlanEstudio.obtener();
                        Iterator<Curso> elementoC;
                        
                        System.out.println("PLAN DE ESTUDIOS");
                        System.out.println("Codigo\tCurso\tCreditos\tCiclo");
                        System.out.println("----------------------------------------");
                        
                        elementoC = auxListC.iterator();
                        while(elementoC.hasNext()){
                            Curso c = elementoC.next();
                            
                            System.out.println(c.presentarLinea());
                        }
                    break;
                    
                case 42:
                        ArrayList<Curso> auxListC1;
                        Iterator<Curso> elementoC1;
                        int auxCiclo;
                        int suma = 0;
                        
                        auxCiclo = objConsola.leer("Ingrese ciclo a buscar[1-10] : ", 1, 10);
                        auxListC1 = PlanEstudio.cursosPorCiclo(auxCiclo);
                        
                        System.out.println("CURSOS DEL CICLO (" + auxCiclo + ")");
                        System.out.println("Codigo\tCurso\tCreditos\tCiclo");
                        System.out.println("-----------------------------------------");
                        
                        elementoC1 = auxListC1.iterator();
                        while(elementoC1.hasNext()){
                            Curso c = elementoC1.next();
                            
                            System.out.println(c.presentarLinea());
                            suma += c.getCreditos();
                        }
                        
                        System.out.println("-----------------------------------------");
                        System.out.println("Total de creditos : " + suma);
                    break;
                    
                case 43:
                        ArrayList<CursoDocente> auxListCD = AsignacionCursos.obtener();
                        Iterator<CursoDocente> elementoCD;
                        
                        System.out.println("CURSOS ASIGNADOS");
                        System.out.println("Docente\tCodigo\tSemestre");
                        System.out.println("----------------------------------------");
                        
                        elementoCD = auxListCD.iterator();
                        while(elementoCD.hasNext()){
                            CursoDocente cd = elementoCD.next();
                            
                            System.out.println(cd.presentarLinea());
                        }
                    break;
            }            
        }while(opc != 99);
        System.out.println("* FIN DEL PROGRAMA *");
    }
    
    public static void definirmenu(Menu objMenu){
        objMenu.agregar(new Opcion(11,"Agregar Docente"));
        objMenu.agregar(new Opcion(12,"Agregar Alumno"));
        objMenu.agregar(new Opcion(13,"Agregar Curso al Plan"));
        objMenu.agregar(new Opcion(14,"Buscar Curso en el Plan"));
        
        objMenu.agregar(new Opcion(21,"Registrar Curso al Docente"));
        
        objMenu.agregar(new Opcion(31,"Reporte General Personas")); 
        objMenu.agregar(new Opcion(32,"Reporte Alumnos")); 
        objMenu.agregar(new Opcion(33,"Reporte Cantidad de docentes x grado"));
        
        objMenu.agregar(new Opcion(41,"Reporte de Plan de Estudios")); 
        objMenu.agregar(new Opcion(42,"Reporte Cursos en ciclo especifico")); 
        objMenu.agregar(new Opcion(43,"Reporte CURSOS ASIGNADOS")); 
        
        objMenu.agregar(new Opcion(99,"Salir"));
    }
    
}
