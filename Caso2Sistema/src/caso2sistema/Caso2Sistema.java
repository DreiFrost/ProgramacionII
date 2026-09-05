package caso2sistema;
import SistemaGeneral.Tipo_plato;
import SistemaGeneral.*;
import java.time.LocalDate;
/**
 *
 * @author DIEGO
 */

public class Caso2Sistema {

    public static void main(String[] args) {

        Plato plato1 = new Plato(
                "Pizza Margarita",
                "Pizza con tomate, queso y albahaca",
                65.00,
                Tipo_plato.PLATO_FUERTE
        );

        Plato plato2 = new Plato(
                "Ensalada Cesar",
                "Ensalada con pollo, lechuga y aderezo Cesar",
                45.00,
                Tipo_plato.ENTRADA
        );

        Plato plato3 = new Plato(
                "Tiramisu",
                "Postre italiano con cafe y mascarpone",
                35.00,
                Tipo_plato.POSTRE
        );

        Plato plato4 = new Plato(
                "Limonada",
                "Bebida natural de limon",
                20.00,
                Tipo_plato.BEBIDA
        );
        Menu menu1 = new Menu(1);

        menu1.agregarPlato(plato1);
        menu1.agregarPlato(plato2);
        menu1.agregarPlato(plato3);
        menu1.agregarPlato(plato4);

        Restaurante restaurante1 = new Restaurante(
                "La Casona",
                "Zona 10, Ciudad de Guatemala",
                "Italiana",
                menu1
        );

        Usuario usuario1 = new Usuario(
                "Carlos",
                "carlos@gmail.com"
        );

        Usuario usuario2 = new Usuario(
                "Maria",
                "maria@gmail.com"
        );

        Valoracion valoracion1 = new Valoracion(
                5,
                "Excelente comida y muy buen servicio.",
                LocalDate.now(),
                usuario1,
                restaurante1
        );

        Valoracion valoracion2 = new Valoracion(
                4,
                "La comida estuvo muy buena.",
                LocalDate.now(),
                usuario2,
                restaurante1
        );


        restaurante1.agregarValoracion(valoracion1);
        restaurante1.agregarValoracion(valoracion2);

        System.out.println("\tRESTAURANTE");

        System.out.println(restaurante1);

        System.out.println("\n\n\tMENU");


        restaurante1.getMenu().mostrarPlatos();

        System.out.println("\n\n\tVALORACIONES");

        restaurante1.mostrarValoraciones();
    }
}
