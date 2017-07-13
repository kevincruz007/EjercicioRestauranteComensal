package restaurante;


/**
 * Created by alumno on 12/07/2017.
 */

/*
* Enunciado:
* Nombre, dirección, cantidad de trabajadores, cantidad de comenzales
* que soporta al mismo tiempo, si acepta niños, categoría 1 al 5.
* Para calcular el impuesto que debe pagar el restaurante se multiplica la categoría
* por la capacidad de comensales que tiene, y si acepta niños el impuesto se divide entre 3.
* */

public class Restaurante {
    private String nombre="";
    private String direccion="";
    private long id=0;
    private int cantidadDeTrabajadores=0;
    private int cantidadDeComensales=0;
    private Integer[] categoria={1,2,3,4,5};
    private float impuestoAPagar=0;
    private boolean aceptaNinos=true;

    public Restaurante() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCantidadDeTrabajadores() {
        return cantidadDeTrabajadores;
    }

    public void setCantidadDeTrabajadores(int cantidadDeTrabajadores) {
        this.cantidadDeTrabajadores = cantidadDeTrabajadores;
    }

    public int getCantidadDeComensales() {
        return cantidadDeComensales;
    }

    public void setCantidadDeComensales(int cantidadDeComensales) {
        this.cantidadDeComensales = cantidadDeComensales;
    }

    public boolean isAceptaNinos() {
        return aceptaNinos;
    }

    public void setAceptaNinos(boolean aceptaNinos) {
        this.aceptaNinos = aceptaNinos;
    }
}
