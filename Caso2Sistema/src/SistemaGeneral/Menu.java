/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaGeneral;

/**
 *
 * @author DIEGO
 */
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private int id;
    private List<Plato> platos;

    public Menu(int id) {
        this.id = id;
        this.platos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void mostrarPlatos() {
        for (Plato plato : platos) {
            System.out.println(plato);
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", platos=" + platos +
                '}';
    }
}
