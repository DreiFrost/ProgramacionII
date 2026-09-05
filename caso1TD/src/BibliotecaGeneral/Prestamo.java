package BibliotecaGeneral;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author DIEGO
 */


public class Prestamo {

    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    private Copia copia;
    private Usuario usuario;

    private Multa multa;
    
    public Prestamo(LocalDate fechaPrestamo,
            Copia copia,
            Usuario usuario) {

        this.fechaPrestamo = fechaPrestamo;
        this.copia = copia;
        this.usuario = usuario;
        this.fechaDevolucion = null;
        this.multa = null;
    }

    public void hacerDevolucion(LocalDate fechaDevolucion) {

        this.fechaDevolucion = fechaDevolucion;

        long dias = ChronoUnit.DAYS.between(
                fechaPrestamo,
                fechaDevolucion
        );

        if (dias > 30) {

            int diasRetraso = (int) (dias - 30);

            multa = new Multa(
                    diasRetraso, (int) 5.0);

            copia.setEstado(EstadoCopia.CON_RETRASO);

        } else {

            copia.setEstado(EstadoCopia.En_la_biblioteca);
        }
    }
    
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Copia getCopia() {
        return copia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Multa getMulta() {
        return multa;
    }

    public boolean tieneRetraso() {
        return multa != null;
    }
}
    


