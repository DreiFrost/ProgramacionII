package BibliotecaGeneral;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DIEGO
 */
public class Usuario {
    private String nombre;
    private int carnet;
    private List<Prestamo> prestamos;
    
    public Usuario(String nombre, int carnet, int prestamos) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.prestamos = new ArrayList<>();
    }
    
    public boolean puedeSolicitarPrestamo() {

        int prestamosActivos = 0;

        for (Prestamo prestamo : prestamos) {

            if (prestamo.getFechaDevolucion() == null) {
                prestamosActivos++;
            }
            if (prestamo.tieneRetraso()) {
                return false;}
        }

        return prestamosActivos < 3;
    }
    
    public void agregarPrestamo(Prestamo prestamo) {

        if (!puedeSolicitarPrestamo()) {
            System.out.println(
                    "El usuario no puede solicitar otro libro."
            );
            return;
        }

        prestamos.add(prestamo);
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getCarnet() {
        return carnet;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
    
}
