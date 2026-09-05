/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesGeneral;

/**
 *
 * @author DIEGO
 */
public class Producto {
    String codigo;
    String nombre;
    int cantidad;
    double precio;

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
   public void Mostrar(){
        System.out.println("Codigo: " +this.codigo);
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Cantidad: " +this.cantidad);
        System.out.println("Precio: " +this.precio);
    }

    
    //funciones get
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    //funciones getter

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
