package comensal;

/**
 * Created by alumno on 12/07/2017.
 */


/**
 * Enunciado:
 * Nombre, apellidos y cantidad de veces que ha visitado el restaurante.
 */
public class Comensal {
    private String nombre="";
    private String apellidos="";
    private long id=0;
    private int cantidadDeVecesVisitado=0;

    public Comensal() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCantidadDeVecesVisitado() {
        return cantidadDeVecesVisitado;
    }

    public void setCantidadDeVecesVisitado(int cantidadDeVecesVisitado) {
        this.cantidadDeVecesVisitado = cantidadDeVecesVisitado;
    }
}
