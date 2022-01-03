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
public class Alumno extends Persona implements Presentable{
    private String coleProcedencia;
    private int añoFinalizacion;

    public Alumno() {
        super();
        this.coleProcedencia = "";
        this.añoFinalizacion = 0;
    }

    public Alumno(String nombre, int edad, String coleProcedencia, int añoFinalizacion) {
        super(nombre, edad);
        this.coleProcedencia = coleProcedencia;
        this.añoFinalizacion = añoFinalizacion;
    }

    public String getColeProcedencia() {
        return coleProcedencia;
    }

    public void setColeProcedencia(String coleProcedencia) {
        this.coleProcedencia = coleProcedencia;
    }

    public int getAñoFinalizacion() {
        return añoFinalizacion;
    }

    public void setAñoFinalizacion(int añoFinalizacion) {
        this.añoFinalizacion = añoFinalizacion;
    }

    
    @Override
    public String presentarLinea() {
        return getNombre() + "\t" + getEdad() + "\t" + coleProcedencia + "\t" + añoFinalizacion + "\n";
    }

    @Override
    public String presentarDetalle() {
        return "Nombre: " + getNombre() + 
                "\nEdad: " + getEdad() + 
                "\nCol. de Procedencia: " + coleProcedencia + 
                "\nAño de finalizacion: " + añoFinalizacion + "\n";
    }
}
