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
public class Curso implements Presentable{
    private String codigo;
    private String nombre;
    private int creditos;
    private int ciclo;

    public Curso() {
        this.codigo = "";
        this.nombre = "";
        this.creditos = 0;
        this.ciclo = 0;
    }
    
    public Curso(String codigo, String nombre, int creditos, int ciclo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.ciclo = ciclo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
    
    
    @Override
    public String presentarLinea() {
        return codigo + "\t" + nombre + "\t" + creditos + "\t" + ciclo + "\n";
    }

    @Override
    public String presentarDetalle() {
        return "Codigo: " + codigo + 
                "\nNombre: " + nombre + 
                "\nCreditos: " + creditos + 
                "\nCiclo: " + ciclo + "\n";
    }
    
    
}
