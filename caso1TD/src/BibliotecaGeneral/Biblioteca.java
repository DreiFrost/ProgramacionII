/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaGeneral;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DIEGO
 */
public class Biblioteca {

    private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean realizarPrestamo(
            Usuario usuario,
            Libro libro,
            LocalDate fecha) {

        if (!usuario.puedeSolicitarPrestamo()) {
            System.out.println(
                "El usuario no puede solicitar más préstamos."
            );
            return false;
        }

        Copia copiaDisponible = null;

        for (Copia copia : libro.getCopias()) {

            if (copia.getEstado() == EstadoCopia.En_la_biblioteca) {
                copiaDisponible = copia;
                break;
            }
        }

        if (copiaDisponible == null) {
            System.out.println(
                "No hay copias disponibles."
            );
            return false;
        }

        Prestamo prestamo = new Prestamo(
                fecha,
                copiaDisponible,
                usuario
        );

        copiaDisponible.setEstado(
                EstadoCopia.Prestado
        );

        usuario.agregarPrestamo(prestamo);

        System.out.println(
            "Préstamo realizado correctamente."
        );

        return true;
    }

    public void devolverLibro(
            Prestamo prestamo,
            LocalDate fechaDevolucion) {

        prestamo.hacerDevolucion(fechaDevolucion);

        if (prestamo.getMulta() != null) {

            System.out.println(
                "El libro fue devuelto con retraso."
            );

            System.out.println(
                "Días de retraso: " +
                prestamo.getMulta().getDiasRetraso()
            );

            System.out.println(
                "Multa: $" +
                prestamo.getMulta().getPagoSancion()
            );

        } else {

            System.out.println(
                "Libro devuelto correctamente."
            );
        }
    }
}