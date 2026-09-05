 package BibliotecaGeneral;

 import java.time.LocalDate;
 import java.util.ArrayList;
 import java.util.List;
 
 
public class Autor {
    private String nombre;
    private String nacionalidad;
    private LocalDate fechaNacimiento; 
    
    public Autor(String nombre, String nacionalidad, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
    
