/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_logica;

/**
 *
 * @author Shrike
 */
public class CursoDocente implements Presentable{
    private String codigoCurso;
    private String nombreDocente;
    private String semestre;

    public CursoDocente() {
        this.codigoCurso = "";
        this.nombreDocente = "";
        this.semestre = "";
    }
    
    public CursoDocente(String codigoCurso, String nombreDocente, String semestre) {
        this.codigoCurso = codigoCurso;
        this.nombreDocente = nombreDocente;
        this.semestre = semestre;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    
    @Override
    public String presentarLinea() {
        return codigoCurso + "\t" + nombreDocente + "\t" + semestre + "\n";
    }

    @Override
    public String presentarDetalle() {
        return "Cod. del Curso: " + codigoCurso + 
                "\nNombre del docente: " + nombreDocente + 
                "\nSemestre: " + semestre + "\n";
    }
}
