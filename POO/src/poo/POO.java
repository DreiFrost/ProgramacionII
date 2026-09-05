/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author DIEGO
 */
public class POO {

    public static void main(String[] args) {
           Car redCar = new Car("rojo", "1245qw");
           redCar.Start();
           
           Car blueCar = new Car("azul", "7845sd");
           blueCar.Start();
    }    
}

class Car{
    String color;
    String placa; 

    public Car(String color, String placa) {
        this.color = color;
        this.placa = placa;
    }
    
    
    public void Start(){
        System.out.println("Encendiendo el auto color "+ this.color);
        System.out.println("\tCon placas " + this.placa);
    }
    
    public void frenar(){
        System.out.println("Frenar el auto" );
    }
}

