package caso1dt;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import BibliotecaGeneral.*;
public class Caso1TD {

    public static void main(String[] args) {

        Autor autor = new Autor(
                "Gabriel García Márquez",
                "Colombiana",
                LocalDate.of(1927, 3, 6)
        );

        Libro libro = new Libro(
                "Cien años de soledad",
                TipoLibro.Novela,
                "Sudamericana",
                1967,
                autor
        );

        Copia copia1 = new Copia("C001",EstadoCopia.En_la_biblioteca);
        Copia copia2 = new Copia("C002",EstadoCopia.En_la_biblioteca);

        libro.agregarCopia(copia1);
        libro.agregarCopia(copia2);


        Usuario usuario = new Usuario("Carlos Pérez", 1001, 1);


        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro);
        biblioteca.registrarUsuario(usuario);
        
        biblioteca.realizarPrestamo(
                usuario,
                libro,
                LocalDate.of(2026, 8, 1)
        );

        Prestamo prestamo = usuario
                .getPrestamos()
                .get(0);


        
        biblioteca.devolverLibro(
                prestamo,
                LocalDate.of(2026, 8, 20)
        );
    }

    }



