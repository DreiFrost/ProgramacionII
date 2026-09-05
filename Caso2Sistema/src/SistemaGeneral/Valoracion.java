/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaGeneral;

/**
 *
 * @author DIEGO
 */
import java.time.LocalDate;

public class Valoracion {

    private int puntuacion;
    private String comentario;
    private LocalDate fecha;
    private Usuario usuario;
    private Restaurante restaurante;

    public Valoracion(int puntuacion,
                      String comentario,
                      LocalDate fecha,
                      Usuario usuario,
                      Restaurante restaurante) {

        if (puntuacion < 1 || puntuacion > 5) {
            throw new IllegalArgumentException(
                    "La puntuacion debe estar entre 1 y 5."
            );
        }

        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.fecha = fecha;
        this.usuario = usuario;
        this.restaurante = restaurante;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        if (puntuacion < 1 || puntuacion > 5) {
            throw new IllegalArgumentException(
                    "La puntuacion debe estar entre 1 y 5."
            );
        }

        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    @Override
    public String toString() {
        return "Valoracion{" +
                "puntuacion=" + puntuacion +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                ", usuario=" + usuario.getNombre() +
                ", restaurante=" + restaurante.getNombre() +
                '}';
    }
}