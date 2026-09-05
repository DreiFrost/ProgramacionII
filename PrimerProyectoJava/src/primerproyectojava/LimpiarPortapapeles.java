import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

public class LimpiarPortapapeles {
    public static void main(String[] args) {
        try {
            // Accedemos al portapapeles del sistema operativo
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            
            // Obtenemos el contenido obligándolo a ser texto plano
            String textoLimpio = (String) clipboard.getData(DataFlavor.stringFlavor);
            
            // Creamos una nueva selección solo con el texto limpio
            StringSelection seleccion = new StringSelection(textoLimpio);
            
            // Sobrescribimos el portapapeles con esta versión sin metadatos
            clipboard.setContents(seleccion, seleccion);
            
            System.out.println("¡Texto copiado al portapapeles sin metadatos de formato!");
            
        } catch (Exception e) {
            System.out.println("No hay texto en el portapapeles o hubo un error.");
            e.printStackTrace();
        }
    }
}

