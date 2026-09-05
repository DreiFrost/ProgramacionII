/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaGeneral;

/**
 *
 * @author DIEGO
 */
import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private String nombre;
    private String direccion;
    private String tipoCocina;

    private Menu menu;
    private List<Valoracion> valoraciones;

    public Restaurante(String nombre,
                       String direccion,
                       String tipoCocina,
                       Menu menu) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCocina = tipoCocina;
        this.menu = menu;
        this.valoraciones = new ArrayList<>();
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

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Valoracion> getValoraciones() {
        return valoraciones;
    }

    public void agregarValoracion(Valoracion valoracion) {
        valoraciones.add(valoracion);
    }

    public void mostrarValoraciones() {
        for (Valoracion valoracion : valoraciones) {
            System.out.println(valoracion);
        }
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipoCocina='" + tipoCocina + '\'' +
                '}';
    }
}
