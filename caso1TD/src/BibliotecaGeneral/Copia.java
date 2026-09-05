
package BibliotecaGeneral;

/**
 *
 * @author DIEGO
 */
public class Copia {
    
    private String codigo;
    private EstadoCopia estado;
    
    public Copia(String codigo, EstadoCopia estado) {
        this.codigo = codigo;
        this.estado = estado;
    }
    
     public String getCodigo() {
        return codigo;
    }

    public EstadoCopia getEstado() {
        return estado;
    }

    public void setEstado(EstadoCopia estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Copia{" +
                "codigo='" + codigo + '\'' +
                ", estado=" + estado +
                '}';
    }
    
}
