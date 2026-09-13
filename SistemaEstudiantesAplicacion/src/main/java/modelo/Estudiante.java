/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DIEGO
 */

public class Estudiante extends Persona {

    private String carnet;
    private String carrera;

    public Estudiante(String carnet, String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carnet = carnet;
        this.carrera = carrera;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getCarrera() {
        return carrera;
    }
}