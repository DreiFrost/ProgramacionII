/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.LocalDate;
/**
 *
 * @author DIEGO
 */
public class Persona {
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private double peso;
    private double altura;
    private String direccion;
    private String telefono;
    private String correo; 

    public Persona(String nombreCompleto, LocalDate fechaNacimiento, double peso, double altura, String direccion, String telefono, String correo) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.altura = altura;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public Persona(){
    
    }
    
    public int calcularEdad(){
    
        LocalDate fechaActual=LocalDate.now(); 
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        return edad;
    }
    
    public boolean esMayorEdad(){
    
        if(calcularEdad()>=18){
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombreCompleto);
        System.out.println("Peso: "+ peso);
        System.out.println("Fecha de Nacimiento: "+fechaNacimiento);
        System.out.println("Altura: "+ altura);
        System.out.println("Direccion: "+direccion);
        System.out.println("Telefono: "+telefono);
        System.out.println("Correo: "+correo);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
       
    

