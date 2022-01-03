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
public class Docente extends Persona implements Presentable{
    private String grado;
    private int tiempoDocente;

    public Docente() {
        super();
        this.grado = "";
        this.tiempoDocente = 0;
    }

    public Docente(String grado, int tiempoDocente, String nombre, int edad) {
        super(nombre, edad);
        this.grado = grado;
        this.tiempoDocente = tiempoDocente;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getTiempoDocente() {
        return tiempoDocente;
    }

    public void setTiempoDocente(int tiempoDocente) {
        this.tiempoDocente = tiempoDocente;
    }
    

    @Override
    public String presentarLinea() {
        return getNombre() + "\t" + getEdad() + "\t" + grado + "\t" + tiempoDocente + "\n"; 
    }

    @Override
    public String presentarDetalle() {
        return "Nombre: " + getNombre() + 
                "\nEdad: " + getEdad() + 
                "\nGrado: " + grado + 
                "\nTiempo de docente: " + tiempoDocente + "\n"; 
    }
}
