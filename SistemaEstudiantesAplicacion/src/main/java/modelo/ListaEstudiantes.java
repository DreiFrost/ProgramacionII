package modelo;
import java.util.ArrayList;
import modelo.Estudiante;
/**
 *
 * @author DIEGO
 */
public class ListaEstudiantes {

    private ArrayList<Estudiante> estudiantes;

    public ListaEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void guardar(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public Estudiante buscar(String carnet) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCarnet().equals(carnet)) {
                return estudiante;
            }
        } return null;
    }

    public boolean eliminar(String carnet) {

        Estudiante estudiante = buscar(carnet);
        if (estudiante != null) {
            estudiantes.remove(estudiante);
            return true;
        }
        return false;
    }

    public boolean modificar(String carnet, String nombre, int edad, String carrera) {
        Estudiante estudiante = buscar(carnet);
        if (estudiante != null) {
            estudiante.setNombre(nombre);
            estudiante.setEdad(edad);
            estudiante.setCarrera(carrera);
            return true;
        }
        return false;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}