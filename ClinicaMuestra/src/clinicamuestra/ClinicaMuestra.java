/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinicamuestra;
import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author DIEGO
 */
public class ClinicaMuestra {
    
    private static ArrayList<Persona> arraypersona1 = new ArrayList<>();
    private static Scanner entrada=new Scanner(System.in);
    
    public static void main(String[] args) {
        int opc;
        do{
            System.out.println("\n\n\t\tSistema de Evaluacion IMC");
            System.out.println("1.Registrar Personas");
            System.out.println("2.Mostrar Registro");
            System.out.println("3.Buscar Persona");
            System.out.println("4.Salir");
            System.out.println("Opcion: ");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1: registrarPersona(); break;
                case 2: mostrarPersona(); break;
                case 3: buscarPersona(); break;
                case 4: System.out.println("Presione una tecla para Salir"); break;
                default: System.out.println("Ingrese un numero dentro del Rango¡¡");
            }
            
        }while(opc!=4);
    }
    
    public static void registrarPersona(){
        Persona persona1 = new Persona();
        System.out.println("\n\tIngrese datos\n");
        entrada.nextLine();
        System.out.println("Nombre completo: ");
        persona1.setNombreCompleto(entrada.nextLine());
        System.out.println("Fecha Nacimiento: ");
        persona1.setFechaNacimiento(LocalDate.parse(entrada.nextLine()));
        System.out.println("Peso: ");
        persona1.setPeso(entrada.nextDouble());
        System.out.println("Altura: ");
        persona1.setAltura(entrada.nextDouble());
        System.out.println("Direccion: ");
        entrada.nextLine();
        persona1.setDireccion(entrada.nextLine());
        System.out.println("Telefono: ");
        persona1.setTelefono(entrada.nextLine());
        System.out.println("Correo Electronico: ");
        persona1.setCorreo(entrada.nextLine());
        
        arraypersona1.add(persona1);
        
    }
    
    public static void mostrarPersona(){
        System.out.println("\n============\t============\t============");
        System.out.println("\tRegistro General");
        for(int i=0; i<arraypersona1.size(); i++){
            arraypersona1.get(i).mostrarDatos();
            System.out.println("============\t============\t============");
        }
    
    }
    

    public static void buscarPersona() {
    System.out.println("\n============\t============\t============");
    entrada.nextLine();
    System.out.println("Ingrese el nombre a buscar: ");
    String palabraBuscar = entrada.nextLine();
    
    for (int i = 0; i < arraypersona1.size(); i++) {
        
        Persona persona1 = arraypersona1.get(i);
        
        if (persona1.getNombreCompleto().equalsIgnoreCase(palabraBuscar)) {
            System.out.println("\n\tPersona Encontrada");
            System.out.println("Nombre: " + persona1.getNombreCompleto());
            return;
        }
    }
    System.out.println("Persona no esta ingresado los datos.");
    System.out.println("============\t============\t============");
}
}
    


