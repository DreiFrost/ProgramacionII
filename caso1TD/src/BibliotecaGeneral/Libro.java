package BibliotecaGeneral;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DIEGO
 */
public class Libro {
    private String nombre;
    private TipoLibro tipo;
    private String editorial;
    private int año;
    private Autor autor;
    
    private List<Copia> copias;
    
    public Libro(String nombre, TipoLibro tipo, String editorial,int año, Autor autor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.año = año;
        this.autor = autor;
        this.copias = new ArrayList<>();
    }
    
    public void agregarCopia(Copia copia) {
        copias.add(copia);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public TipoLibro getTipo() {
        return tipo;
    }
    
    public String getEditorial() {
        return editorial;
    }

    public int getAño() {
        return año;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    public List<Copia> getCopias() {
        return copias;
    }

    @Override
    public String toString() {
        return nombre + " - " + autor.getNombre();
    }
    
    
}
